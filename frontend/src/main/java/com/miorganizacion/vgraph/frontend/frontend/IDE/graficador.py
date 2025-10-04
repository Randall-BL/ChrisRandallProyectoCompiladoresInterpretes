import json
from pathlib import Path
from collections import deque, defaultdict
import subprocess
import os

# Ajustes que puedes modificar
DOT_PATH = "ast.dot"
OUT_PNG = "ast.png"
NODESep = 1.2   # espacio horizontal entre nodos hermanos (ajusta si hace falta)
RANKSep = 2.5   # espacio vertical entre niveles (ajusta si hace falta)
RANKDIR = "TB"  # TB = Top->Bottom, LR = Left->Right

# === Cargar AST ===
ast_path = Path("ast.json")
with ast_path.open("r", encoding="utf-8") as f:
    ast = json.load(f)

# === Construir grafo y asignar ids 'n0','n1',... ===
import networkx as nx
G = nx.DiGraph()
counter = 0

def make_id():
    global counter
    cid = f"n{counter}"
    counter += 1
    return cid

def add_node_recursive(node, parent=None):
    """
    Añade nodo(s) al grafo G. Retorna el id del nodo creado para 'node'.
    """
    nid = make_id()
    # label amigable (incluye value/identifier si existen)
    if isinstance(node, dict):
        label = node.get("type", "Node")
        if "value" in node:
            label += "\\n" + str(node["value"])
        if "identifier" in node:
            label += "\\n" + str(node["identifier"])
    else:
        label = str(node)
    G.add_node(nid, label=label)
    if parent is not None:
        G.add_edge(parent, nid)

    # expandir hijos
    if isinstance(node, dict):
        for k, v in node.items():
            if k == "type":
                continue
            # primitivos -> hoja con texto "k: v"
            if isinstance(v, (str, int, float, bool)) or v is None:
                child_id = make_id()
                G.add_node(child_id, label=f"{k}: {v}")
                G.add_edge(nid, child_id)
            elif isinstance(v, list):
                # nodo intermedio que representa la lista
                list_id = make_id()
                G.add_node(list_id, label=f"{k}[]")
                G.add_edge(nid, list_id)
                for item in v:
                    add_node_recursive(item, list_id)
            else:
                add_node_recursive(v, nid)
    elif isinstance(node, list):
        for item in node:
            add_node_recursive(item, parent)
    return nid

root_id = add_node_recursive(ast)

# === Calcular profundidad (BFS) desde la raíz ===
depth = {}
q = deque([root_id])
depth[root_id] = 0
while q:
    u = q.popleft()
    for v in G.successors(u):
        if v not in depth:
            depth[v] = depth[u] + 1
            q.append(v)

# Agrupar nodos por nivel
nodes_by_depth = defaultdict(list)
for n, d in depth.items():
    nodes_by_depth[d].append(n)

# === Crear contenido DOT forzado con rank=same por nivel ===
def escape_label(s: str) -> str:
    # escapamos comillas y ya hemos usado '\n' literal para saltos
    return s.replace('"', '\\"')

dot_lines = []
dot_lines.append("digraph AST {")
# atributos globales del grafo
dot_lines.append(f'  graph [rankdir={RANKDIR} nodesep={NODESep} ranksep={RANKSep} splines=true overlap=false];')
dot_lines.append('  node [shape=box, style="rounded,filled", fillcolor=lightblue, fontname="monospace"];')
dot_lines.append('  edge [arrowhead=vee];')
dot_lines.append("")

# declarar nodos con labels
for n, data in G.nodes(data=True):
    lbl = escape_label(data.get("label", n))
    dot_lines.append(f'  {n} [label="{lbl}"];')

dot_lines.append("")

# declarar subgrafos por nivel (rank = same)
# Esto obliga a que los nodos de la misma profundidad estén en el mismo nivel visual.
for d in sorted(nodes_by_depth.keys()):
    nodes = nodes_by_depth[d]
    if nodes:
        # subgrafo sin cluster, solo rank=same
        joined = " ".join(nodes)
        dot_lines.append(f"  {{ rank = same; {joined}; }}")

dot_lines.append("")

# declarar aristas
for u, v in G.edges():
    dot_lines.append(f"  {u} -> {v};")

dot_lines.append("}")
dot_content = "\n".join(dot_lines)

# escribir archivo .dot
with open(DOT_PATH, "w", encoding="utf-8") as f:
    f.write(dot_content)


# === Llamar a dot para generar PNG ===
try:
    subprocess.run(["dot", "-Tpng", DOT_PATH, "-o", OUT_PNG], check=True)
    print(f"PNG generado: {OUT_PNG}")
    os.remove(DOT_PATH)  # Elimina el archivo .dot
except FileNotFoundError:
    print("Error: no se encontró 'dot'. Instala Graphviz y asegúrate de que 'dot' esté en el PATH.")
except subprocess.CalledProcessError as e:
    print("Error ejecutando dot:", e)

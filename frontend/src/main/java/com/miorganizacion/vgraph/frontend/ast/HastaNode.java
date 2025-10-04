package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Hasta")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "condicion", "instrucciones" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HastaNode extends ASTNode {
    private final ASTNode condicion;
    private final List<ASTNode> instrucciones = new ArrayList<>();

    public HastaNode(ASTNode condicion) {
        this.condicion = condicion;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "HastaNode";
    }

    @JsonProperty("condicion")
    public ASTNode getCondicion() {
        return condicion;
    }

    public void addInstruccion(ASTNode instruccion) {
        instrucciones.add(instruccion);
    }

    @JsonProperty("instrucciones")
    public List<ASTNode> getInstrucciones() {
        return instrucciones;
    }
}
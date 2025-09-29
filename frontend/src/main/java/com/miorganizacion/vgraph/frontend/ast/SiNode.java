package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Si")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "condicion", "instruccionesSi", "instruccionesSino" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SiNode extends ASTNode {
    private final ASTNode condicion;
    private final List<ASTNode> instruccionesSi = new ArrayList<>();
    private final List<ASTNode> instruccionesSino = new ArrayList<>();
    private boolean tieneElse = false;

    public SiNode(ASTNode condicion) {
        this.condicion = condicion;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "SiNode";
    }

    @JsonProperty("condicion")
    public ASTNode getCondicion() {
        return condicion;
    }

    public void addInstruccionSi(ASTNode instruccion) {
        instruccionesSi.add(instruccion);
    }

    public void addInstruccionSino(ASTNode instruccion) {
        instruccionesSino.add(instruccion);
        tieneElse = true;
    }

    @JsonProperty("instruccionesSi")
    public List<ASTNode> getInstruccionesSi() {
        return instruccionesSi;
    }

    @JsonProperty("instruccionesSino")
    public List<ASTNode> getInstruccionesSino() {
        return tieneElse ? instruccionesSino : null;
    }

    public boolean tieneElse() {
        return tieneElse;
    }
}
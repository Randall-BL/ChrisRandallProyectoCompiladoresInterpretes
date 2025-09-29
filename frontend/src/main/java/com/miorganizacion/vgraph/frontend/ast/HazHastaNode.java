package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("HazHasta")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "instrucciones", "condicion" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HazHastaNode extends ASTNode {
    private final List<ASTNode> instrucciones = new ArrayList<>();
    private final ASTNode condicion;

    public HazHastaNode(ASTNode condicion) {
        this.condicion = condicion;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "HazHastaNode";
    }

    public void addInstruccion(ASTNode instruccion) {
        instrucciones.add(instruccion);
    }

    @JsonProperty("instrucciones")
    public List<ASTNode> getInstrucciones() {
        return instrucciones;
    }

    @JsonProperty("condicion")
    public ASTNode getCondicion() {
        return condicion;
    }
}
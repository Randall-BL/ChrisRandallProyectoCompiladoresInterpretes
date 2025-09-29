package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("HazMientras")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "instrucciones", "condicion" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HazMientrasNode extends ASTNode {
    private final List<ASTNode> instrucciones = new ArrayList<>();
    private final ASTNode condicion;

    public HazMientrasNode(ASTNode condicion) {
        this.condicion = condicion;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "HazMientrasNode";
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
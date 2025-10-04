package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Mientras")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "condicion", "instrucciones" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MientrasNode extends ASTNode {
    private final ASTNode condicion;
    private final List<ASTNode> instrucciones = new ArrayList<>();

    public MientrasNode(ASTNode condicion) {
        this.condicion = condicion;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "MientrasNode";
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
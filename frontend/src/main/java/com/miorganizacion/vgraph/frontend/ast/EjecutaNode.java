package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Ejecuta")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "ordenes" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EjecutaNode extends ASTNode {
    private final List<ASTNode> ordenes = new ArrayList<>();

    @Override
    @JsonIgnore
    public String getType() {
        return "EjecutaNode";
    }

    public void addOrden(ASTNode orden) {
        ordenes.add(orden);
    }

    @JsonProperty("ordenes")
    public List<ASTNode> getOrdenes() {
        return ordenes;
    }
}
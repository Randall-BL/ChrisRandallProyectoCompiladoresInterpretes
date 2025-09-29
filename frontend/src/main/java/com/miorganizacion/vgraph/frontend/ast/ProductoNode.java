package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Producto")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "operandos" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductoNode extends ASTNode {
    private final List<ASTNode> operandos = new ArrayList<>();

    public ProductoNode() {
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "ProductoNode";
    }

    public void addOperando(ASTNode operando) {
        operandos.add(operando);
    }

    @JsonProperty("operandos")
    public List<ASTNode> getOperandos() {
        return operandos;
    }
}
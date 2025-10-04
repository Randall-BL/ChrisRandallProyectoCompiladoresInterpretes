package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Suma")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "operandos" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SumaNode extends ASTNode {
    private final List<ASTNode> operandos = new ArrayList<>();

    public SumaNode() {
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "SumaNode";
    }

    public void addOperando(ASTNode operando) {
        operandos.add(operando);
    }

    @JsonProperty("operandos")
    public List<ASTNode> getOperandos() {
        return operandos;
    }
}
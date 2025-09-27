package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("BinaryOp")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "operator", "left", "right" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BinaryOpNode extends ASTNode {
    private final String operator;
    private final ASTNode left;
    private final ASTNode right;

    public BinaryOpNode(String operator, ASTNode left, ASTNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "BinaryOpNode";
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("left")
    public ASTNode getLeft() {
        return left;
    }

    @JsonProperty("right")
    public ASTNode getRight() {
        return right;
    }
}

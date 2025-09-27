package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Condition")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "left", "operator", "right" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ConditionNode extends ASTNode {
    private final ASTNode left;
    private final String operator;
    private final ASTNode right;

    public ConditionNode(ASTNode left, String operator, ASTNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "ConditionNode";
    }

    @JsonProperty("left")
    public ASTNode getLeft() {
        return left;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("right")
    public ASTNode getRight() {
        return right;
    }
}

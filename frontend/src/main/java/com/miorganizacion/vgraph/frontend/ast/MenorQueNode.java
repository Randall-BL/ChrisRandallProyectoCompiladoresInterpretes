package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("MenorQue")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "left", "right" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MenorQueNode extends ASTNode {
    private final ASTNode left;
    private final ASTNode right;

    public MenorQueNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "MenorQueNode";
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
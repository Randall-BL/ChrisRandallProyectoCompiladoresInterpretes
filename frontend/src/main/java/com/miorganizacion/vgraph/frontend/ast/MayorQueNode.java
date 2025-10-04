package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("MayorQue")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "left", "right" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MayorQueNode extends ASTNode {
    private final ASTNode left;
    private final ASTNode right;

    public MayorQueNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "MayorQueNode";
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
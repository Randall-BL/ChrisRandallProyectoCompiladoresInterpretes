package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Iguales")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "left", "right" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IgualesNode extends ASTNode {
    private final ASTNode left;
    private final ASTNode right;

    public IgualesNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "IgualesNode";
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
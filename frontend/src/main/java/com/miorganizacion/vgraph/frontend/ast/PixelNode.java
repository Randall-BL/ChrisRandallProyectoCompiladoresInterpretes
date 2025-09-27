package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Pixel")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "x", "y" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PixelNode extends ASTNode {
    private final ASTNode x;
    private final ASTNode y;

    public PixelNode(ASTNode x, ASTNode y) {
        this.x = x;
        this.y = y;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "PixelNode";
    }

    @JsonProperty("x")
    public ASTNode getX() {
        return x;
    }

    @JsonProperty("y")
    public ASTNode getY() {
        return y;
    }
}

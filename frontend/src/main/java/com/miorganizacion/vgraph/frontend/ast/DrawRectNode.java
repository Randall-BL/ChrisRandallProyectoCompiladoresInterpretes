package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("DrawRect")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "x1", "y1", "x2", "y2" })
public class DrawRectNode extends ASTNode {
    private final ASTNode x1;
    private final ASTNode y1;
    private final ASTNode x2;
    private final ASTNode y2;

    public DrawRectNode(ASTNode x1, ASTNode y1, ASTNode x2, ASTNode y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "DrawRectNode";
    }

    @JsonProperty("x1")
    public ASTNode getX1() {
        return x1;
    }

    @JsonProperty("y1")
    public ASTNode getY1() {
        return y1;
    }

    @JsonProperty("x2")
    public ASTNode getX2() {
        return x2;
    }

    @JsonProperty("y2")
    public ASTNode getY2() {
        return y2;
    }
}

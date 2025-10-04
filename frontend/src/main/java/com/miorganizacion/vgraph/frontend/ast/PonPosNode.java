package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("PonPos")
public class PonPosNode extends ASTNode {
    private final ASTNode x;
    private final ASTNode y;
    public PonPosNode(ASTNode x, ASTNode y) { this.x = x; this.y = y; }
    @Override @JsonIgnore public String getType() { return "PonPosNode"; }
    @JsonProperty("x") public ASTNode getX() { return x; }
    @JsonProperty("y") public ASTNode getY() { return y; }
}
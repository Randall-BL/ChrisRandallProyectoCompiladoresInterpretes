package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("PonY")
public class PonYNode extends ASTNode {
    private final ASTNode value;
    public PonYNode(ASTNode value) { this.value = value; }
    @Override @JsonIgnore public String getType() { return "PonYNode"; }
    @JsonProperty("value") public ASTNode getValue() { return value; }
}
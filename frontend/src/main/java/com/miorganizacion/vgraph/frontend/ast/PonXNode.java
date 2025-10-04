package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("PonX")
public class PonXNode extends ASTNode {
    private final ASTNode value;
    public PonXNode(ASTNode value) { this.value = value; }
    @Override @JsonIgnore public String getType() { return "PonXNode"; }
    @JsonProperty("value") public ASTNode getValue() { return value; }
}
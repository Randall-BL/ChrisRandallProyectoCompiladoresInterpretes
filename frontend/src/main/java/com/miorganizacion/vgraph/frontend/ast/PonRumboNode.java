package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("PonRumbo")
public class PonRumboNode extends ASTNode {
    private final ASTNode value;
    public PonRumboNode(ASTNode value) { this.value = value; }
    @Override @JsonIgnore public String getType() { return "PonRumboNode"; }
    @JsonProperty("value") public ASTNode getValue() { return value; }
}
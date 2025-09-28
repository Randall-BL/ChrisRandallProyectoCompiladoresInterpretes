package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Rumbo")
public class RumboNode extends ASTNode {
    public RumboNode() {}
    @Override @JsonIgnore public String getType() { return "RumboNode"; }
}
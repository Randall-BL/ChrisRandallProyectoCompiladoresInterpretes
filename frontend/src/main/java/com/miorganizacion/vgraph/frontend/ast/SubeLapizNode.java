package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("SubeLapiz")
public class SubeLapizNode extends ASTNode {
    public SubeLapizNode() {}
    @Override @JsonIgnore public String getType() { return "SubeLapizNode"; }
}
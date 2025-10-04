package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Centro")
public class CentroNode extends ASTNode {
    public CentroNode() {}
    @Override @JsonIgnore public String getType() { return "CentroNode"; }
}
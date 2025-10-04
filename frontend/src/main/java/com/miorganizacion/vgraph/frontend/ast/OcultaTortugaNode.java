package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("OcultaTortuga")
public class OcultaTortugaNode extends ASTNode {
    public OcultaTortugaNode() {}
    @Override @JsonIgnore public String getType() { return "OcultaTortugaNode"; }
}
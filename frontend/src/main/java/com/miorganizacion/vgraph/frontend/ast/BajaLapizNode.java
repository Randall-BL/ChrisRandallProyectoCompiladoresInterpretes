package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("BajaLapiz")
public class BajaLapizNode extends ASTNode {
    public BajaLapizNode() {}
    @Override @JsonIgnore public String getType() { return "BajaLapizNode"; }
}
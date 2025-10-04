package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("GiraIzquierda")
public class GiraIzquierdaNode extends ASTNode {
    private final ASTNode angle;
    public GiraIzquierdaNode(ASTNode angle) { this.angle = angle; }
    @Override @JsonIgnore public String getType() { return "GiraIzquierdaNode"; }
    @JsonProperty("angle") public ASTNode getAngle() { return angle; }
}
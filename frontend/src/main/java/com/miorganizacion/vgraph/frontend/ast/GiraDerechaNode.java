package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("GiraDerecha")
public class GiraDerechaNode extends ASTNode {
    private final ASTNode angle;
    public GiraDerechaNode(ASTNode angle) { this.angle = angle; }
    @Override @JsonIgnore public String getType() { return "GiraDerechaNode"; }
    @JsonProperty("angle") public ASTNode getAngle() { return angle; }
}
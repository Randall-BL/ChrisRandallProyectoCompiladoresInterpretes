// AvanzaNode.java
package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Avanza")
@JsonPropertyOrder({ "type", "distance" })
public class AvanzaNode extends ASTNode {
    private final ASTNode distance;
    public AvanzaNode(ASTNode distance) { this.distance = distance; }
    @Override @JsonIgnore public String getType() { return "AvanzaNode"; }
    @JsonProperty("distance") public ASTNode getDistance() { return distance; }
}
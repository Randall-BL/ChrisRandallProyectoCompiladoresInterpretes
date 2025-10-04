// RetrocedeNode.java
package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Retrocede")
@JsonPropertyOrder({ "type", "distance" })
public class RetrocedeNode extends ASTNode {
    private final ASTNode distance;
    public RetrocedeNode(ASTNode distance) { this.distance = distance; }
    @Override @JsonIgnore public String getType() { return "RetrocedeNode"; }
    @JsonProperty("distance") public ASTNode getDistance() { return distance; }
}
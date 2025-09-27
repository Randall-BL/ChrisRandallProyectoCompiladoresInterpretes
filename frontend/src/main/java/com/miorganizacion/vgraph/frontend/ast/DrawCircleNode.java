// DrawCircleNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("DrawCircle")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "cx", "cy", "radius" })
public class DrawCircleNode extends ASTNode {
    private final ASTNode cx;
    private final ASTNode cy;
    private final ASTNode radius;

    public DrawCircleNode(ASTNode cx, ASTNode cy, ASTNode radius) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "DrawCircleNode";
    }

    @JsonProperty("cx")
    public ASTNode getCx() {
        return cx;
    }

    @JsonProperty("cy")
    public ASTNode getCy() {
        return cy;
    }

    @JsonProperty("radius")
    public ASTNode getRadius() {
        return radius;
    }
}

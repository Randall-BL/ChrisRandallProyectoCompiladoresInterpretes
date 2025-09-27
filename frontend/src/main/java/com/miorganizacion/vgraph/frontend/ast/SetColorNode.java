// SetColorNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("SetColor")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "colorExpr" })
public class SetColorNode extends ASTNode {
    private final ASTNode colorExpr;

    public SetColorNode(ASTNode colorExpr) {
        this.colorExpr = colorExpr;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "SetColorNode";
    }

    @JsonProperty("colorExpr")
    public ASTNode getColorExpr() {
        return colorExpr;
    }
}

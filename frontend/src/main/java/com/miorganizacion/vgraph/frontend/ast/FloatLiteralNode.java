// FloatLiteralNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FloatLiteral")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "value" })
public class FloatLiteralNode extends ASTNode {
    private final double value;

    public FloatLiteralNode(double value) {
        this.value = value;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "FloatLiteralNode"; // uso interno solamente
    }

    @JsonProperty("value")
    public double getValue() {
        return value;
    }
}


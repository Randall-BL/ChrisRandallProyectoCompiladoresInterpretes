// ColorLiteralNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Color")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "value" })
public class ColorLiteralNode extends ASTNode {
    private final String value;

    public ColorLiteralNode(String value) {
        this.value = value;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "ColorLiteralNode";
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }
}
// IntLiteralNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("IntLiteral")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "value" })
public class IntLiteralNode extends ASTNode {
    private final int value;

    public IntLiteralNode(int value) {
        this.value = value;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "IntLiteralNode"; // internal only
    }

    @JsonProperty("value")
    public int getValue() {
        return value;
    }
}
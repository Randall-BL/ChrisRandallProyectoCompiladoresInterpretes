// FunctionCallNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FuncCall")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "functionName", "argument" })
public class FunctionCallNode extends ASTNode {
    private final String functionName;
    private final ASTNode argument;

    public FunctionCallNode(String functionName, ASTNode argument) {
        this.functionName = functionName;
        this.argument = argument;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "FunctionCallNode";
    }

    @JsonProperty("functionName")
    public String getFunctionName() {
        return functionName;
    }

    @JsonProperty("argument")
    public ASTNode getArgument() {
        return argument;
    }
}
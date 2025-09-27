// VarReferenceNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("VarRef")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "varName" })
public class VarReferenceNode extends ASTNode {
    private final String varName;

    public VarReferenceNode(String varName) {
        this.varName = varName;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "VarReferenceNode";
    }

    @JsonProperty("varName")
    public String getVarName() {
        return varName;
    }
}
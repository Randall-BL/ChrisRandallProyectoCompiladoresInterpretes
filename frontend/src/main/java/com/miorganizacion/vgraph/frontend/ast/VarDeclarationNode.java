// VarDeclarationNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("VarDecl")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "dataType", "identifier", "initialValue" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VarDeclarationNode extends ASTNode {
    private final String dataType;
    private final String identifier;
    private final ASTNode initialValue;

    public VarDeclarationNode(String dataType, String identifier, ASTNode initialValue) {
        this.dataType = dataType;
        this.identifier = identifier;
        this.initialValue = initialValue;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "VarDeclarationNode";
    }

    @JsonProperty("dataType")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("initialValue")
    public ASTNode getInitialValue() {
        return initialValue;
    }
}

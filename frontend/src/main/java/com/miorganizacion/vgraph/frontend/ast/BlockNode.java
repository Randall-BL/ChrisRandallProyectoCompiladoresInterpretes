// BlockNode.java
package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Block")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "statements" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockNode extends ASTNode {
    private final List<ASTNode> statements = new ArrayList<>();

    @Override
    @JsonIgnore
    public String getType() {
        return "BlockNode";
    }

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }

    @JsonProperty("statements")
    public List<ASTNode> getStatements() {
        return statements;
    }
}
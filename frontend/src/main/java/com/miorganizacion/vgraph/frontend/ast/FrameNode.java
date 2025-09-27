package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Frame")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "statements" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FrameNode extends ASTNode {
    private final List<ASTNode> statements = new ArrayList<>();

    @Override
    @JsonIgnore
    public String getType() {
        return "FrameNode";
    }

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }

    @JsonProperty("statements")
    public List<ASTNode> getStatements() {
        return statements;
    }
}

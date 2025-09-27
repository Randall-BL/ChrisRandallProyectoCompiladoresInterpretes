package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Loop")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "initialization", "condition", "update", "body" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LoopNode extends ASTNode {
    private ASTNode initialization;
    private ASTNode condition;
    private ASTNode update;
    private final List<ASTNode> body = new ArrayList<>();

    @Override
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getType() {
        return "LoopNode";
    }

    @JsonProperty("initialization")
    public ASTNode getInitialization() {
        return initialization;
    }

    public void setInitialization(ASTNode initialization) {
        this.initialization = initialization;
    }

    @JsonProperty("condition")
    public ASTNode getCondition() {
        return condition;
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
    }

    @JsonProperty("update")
    public ASTNode getUpdate() {
        return update;
    }

    public void setUpdate(ASTNode update) {
        this.update = update;
    }

    public void addStatement(ASTNode statement) {
        body.add(statement);
    }

    @JsonProperty("body")
    public List<ASTNode> getBody() {
        return body;
    }
}
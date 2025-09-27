package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;


@JsonTypeName("Assignment")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "identifier", "expression" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AssignmentNode extends ASTNode {
    private final String identifier;
    private final ASTNode expression;

    public AssignmentNode(String identifier, ASTNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "AssignmentNode"; // usado solo internamente
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("expression")
    public ASTNode getExpression() {
        return expression;
    }
}


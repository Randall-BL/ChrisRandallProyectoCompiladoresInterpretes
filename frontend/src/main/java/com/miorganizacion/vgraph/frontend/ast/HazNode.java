package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Haz")
@JsonPropertyOrder({ "type", "identifier", "expression" })
public class HazNode extends ASTNode {
    private final String identifier;
    private final ASTNode expression;

    public HazNode(String identifier, ASTNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override @JsonIgnore public String getType() { return "HazNode"; }
    @JsonProperty("identifier") public String getIdentifier() { return identifier; }
    @JsonProperty("expression") public ASTNode getExpression() { return expression; }
}
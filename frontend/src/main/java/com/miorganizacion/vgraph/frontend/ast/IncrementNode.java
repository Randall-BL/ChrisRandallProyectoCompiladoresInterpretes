package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Increment")
@JsonInclude(JsonInclude.Include.NON_EMPTY) // Para que no aparezca 'byValue' si es null
@JsonPropertyOrder({ "type", "identifier", "byValue" })
public class IncrementNode extends ASTNode {
    private final String identifier;
    private final ASTNode byValue; // Puede ser null

    public IncrementNode(String identifier, ASTNode byValue) {
        this.identifier = identifier;
        this.byValue = byValue;
    }

    @Override @JsonIgnore public String getType() { return "IncrementNode"; }
    @JsonProperty("identifier") public String getIdentifier() { return identifier; }
    @JsonProperty("byValue") public ASTNode getByValue() { return byValue; }
}
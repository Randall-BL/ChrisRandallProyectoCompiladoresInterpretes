package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Division")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "dividendo", "divisor" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DivisionNode extends ASTNode {
    private final ASTNode dividendo;
    private final ASTNode divisor;

    public DivisionNode(ASTNode dividendo, ASTNode divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "DivisionNode";
    }

    @JsonProperty("dividendo")
    public ASTNode getDividendo() {
        return dividendo;
    }

    @JsonProperty("divisor")
    public ASTNode getDivisor() {
        return divisor;
    }
}
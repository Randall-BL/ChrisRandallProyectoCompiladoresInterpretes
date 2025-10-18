package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Potencia")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "base", "exponente" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PotenciaNode extends ASTNode {
    private final ASTNode base;
    private final ASTNode exponente;

    public PotenciaNode(ASTNode base, ASTNode exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "PotenciaNode";
    }

    @JsonProperty("base")
    public ASTNode getBase() {
        return base;
    }

    @JsonProperty("exponente")
    public ASTNode getExponente() {
        return exponente;
    }
}
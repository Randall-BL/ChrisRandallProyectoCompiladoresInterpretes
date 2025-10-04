package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Azar")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "limite" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AzarNode extends ASTNode {
    private final ASTNode limite;

    public AzarNode(ASTNode limite) {
        this.limite = limite;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "AzarNode";
    }

    @JsonProperty("limite")
    public ASTNode getLimite() {
        return limite;
    }
}
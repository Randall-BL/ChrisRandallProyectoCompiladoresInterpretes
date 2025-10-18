package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Repite")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "veces", "ordenes" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RepiteNode extends ASTNode {
    private final ASTNode veces;
    private final List<ASTNode> ordenes = new ArrayList<>();

    public RepiteNode(ASTNode veces) {
        this.veces = veces;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "RepiteNode";
    }

    @JsonProperty("veces")
    public ASTNode getVeces() {
        return veces;
    }

    public void addOrden(ASTNode orden) {
        ordenes.add(orden);
    }

    @JsonProperty("ordenes")
    public List<ASTNode> getOrdenes() {
        return ordenes;
    }
}
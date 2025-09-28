package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Espera")
public class EsperaNode extends ASTNode {
    private final ASTNode duration;
    public EsperaNode(ASTNode duration) { this.duration = duration; }
    @Override @JsonIgnore public String getType() { return "EsperaNode"; }
    @JsonProperty("duration") public ASTNode getDuration() { return duration; }
}
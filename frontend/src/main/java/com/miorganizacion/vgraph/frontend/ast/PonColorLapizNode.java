package com.miorganizacion.vgraph.frontend.ast;
import com.fasterxml.jackson.annotation.*;

@JsonTypeName("PonColorLapiz")
public class PonColorLapizNode extends ASTNode {
    private final String colorName;
    public PonColorLapizNode(String colorName) { this.colorName = colorName; }
    @Override @JsonIgnore public String getType() { return "PonColorLapizNode"; }
    @JsonProperty("colorName") public String getColorName() { return colorName; }
}
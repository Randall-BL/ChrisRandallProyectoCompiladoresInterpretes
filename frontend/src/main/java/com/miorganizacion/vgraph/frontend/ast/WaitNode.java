package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.*;

@JsonTypeName("Wait")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "duration" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class WaitNode extends ASTNode {
    private final ASTNode duration;

    public WaitNode(ASTNode duration) {
        this.duration = duration;
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "WaitNode";
    }

    @JsonProperty("duration")
    public ASTNode getDuration() {
        return duration;
    }
}

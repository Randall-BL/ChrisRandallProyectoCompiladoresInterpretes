package com.miorganizacion.vgraph.frontend.ast;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("If")
@JsonIgnoreProperties({ "line", "column" })
@JsonPropertyOrder({ "type", "condition", "thenBlock", "elseBlock" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IfNode extends ASTNode {
    private final ASTNode condition;
    private final ASTNode thenBlock;
    private final ASTNode elseBlock;
    
    public IfNode(ASTNode condition, ASTNode thenBlock, ASTNode elseBlock) {
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }
    
    @Override
    @JsonIgnore
    public String getType() {
        return "IfNode";  // internal use only
    }
    
    @JsonProperty("condition")
    public ASTNode getCondition() {
        return condition;
    }
    
    @JsonProperty("thenBlock")
    public ASTNode getThenBlock() {
        return thenBlock;
    }
    
    @JsonProperty("elseBlock")
    public ASTNode getElseBlock() {
        return elseBlock;
    }
}

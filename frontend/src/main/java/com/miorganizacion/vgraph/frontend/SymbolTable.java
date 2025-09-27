package com.miorganizacion.vgraph.frontend;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public enum Type { NUMBER, COLOR, UNKNOWN }
    
    private final Map<String, Type> symbols = new HashMap<>();
    
    public void declare(String name, Type type) {
        symbols.put(name, type);
    }
    
    public Type getType(String name) {
        return symbols.getOrDefault(name, Type.UNKNOWN);
    }
    
    public boolean isDeclared(String name) {
        return symbols.containsKey(name);
    }
}
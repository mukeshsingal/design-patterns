package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Prototype> prototypeRegistry;

    public PrototypeRegistry() {
        this.prototypeRegistry = new HashMap<>();
    }

    public void addPrototypeToRegistry(String prototypeName, Prototype prototype) {
        this.prototypeRegistry.put(prototypeName, prototype);
    }

    public Prototype getPrototypeCloneFromRegistry(String prototype) {
        return this.prototypeRegistry.get(prototype).clone();
    }

}

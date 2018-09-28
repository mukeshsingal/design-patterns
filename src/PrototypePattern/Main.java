package PrototypePattern;

/**
 * It is a Creation design pattern which let's you produce
 * new objects by copying existing ones without compromising
 * their internals.
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype("This is sample String");
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();

        prototypeRegistry.addPrototypeToRegistry("Original", concretePrototype);

        ConcretePrototype clonePrototype = (ConcretePrototype) prototypeRegistry.getPrototypeCloneFromRegistry("Original");

        System.out.println(concretePrototype.getName());
        System.out.println(clonePrototype.getName());
    }
}

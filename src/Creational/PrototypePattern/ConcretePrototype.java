package Creational.PrototypePattern;

public class ConcretePrototype implements Prototype {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public ConcretePrototype(ConcretePrototype concretePrototype) {
        this.name = concretePrototype.name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }
}

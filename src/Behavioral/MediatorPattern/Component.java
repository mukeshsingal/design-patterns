package Behavioral.MediatorPattern;

abstract public class Component {
    Mediator mediator;
    private String name;

    Component(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send();

    public abstract void receive(String message);

    public String getName() {
        return name;
    }

}

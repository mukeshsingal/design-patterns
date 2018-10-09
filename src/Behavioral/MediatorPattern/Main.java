package Behavioral.MediatorPattern;

/**
 * Mediator  is a behaviour design pattern that lets you
 * define an object that encapsulate relations between a
 * set of objects to make them independent of each other.
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Component compA = new ComponentA(mediator);
        Component compB = new ComponentB(mediator);

        mediator.register(compA);
        mediator.register(compB);

        compB.send();
        System.out.println("--------");
        compA.send();
    }
}


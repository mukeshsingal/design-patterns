package Behavioral.ObserverPattern;

/**
 * Observer is a behavioral design pattern that let you define
 * 1. one to many dependency between objects
 * 2. so that when one object changes state,
 * 3. all its dependents are notified and updated automatically.
 * <p>
 * Observer will be notified by subject when subject changes its state
 */
public class Main {
    public static void main(String[] args) {
        RadioStation radio = new RadioStation();

        Observer ob1 = new Person("Developer");
        Observer ob2 = new Person("Ram");
        Observer ob3 = new Person("Amit");
        Observer ob4 = new Person("Upender");

        /* Notify Developer and Ram */
        radio.register(ob1);
        radio.register(ob2);
        radio.notifyObservers();

        /* Notify Amit and Ram and remove Developer */
        radio.register(ob3);
        radio.unRegister(ob1);
        radio.updateGolderNumber(23);

    }
}

package Behavioral.ObserverPattern;

public interface Subject {

    void register(Observer o);

    void unRegister(Observer o);

    void notifyObservers();
}

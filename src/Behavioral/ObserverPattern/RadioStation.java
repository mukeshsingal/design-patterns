package Behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class RadioStation implements Subject {
    private List<Observer> myObservers = new ArrayList<>();
    private int golderNumber = 2;

    @Override
    public void register(Observer o) {
        myObservers.add(o);
    }

    @Override
    public void unRegister(Observer o) {
        myObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        myObservers.forEach(observer -> observer.notifyMe(golderNumber));
    }

    void updateGolderNumber(int i) {
        this.golderNumber = i;
        myObservers.forEach(observer -> observer.notifyMe(golderNumber));
    }
}

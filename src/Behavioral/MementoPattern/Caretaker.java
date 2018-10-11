package Behavioral.MementoPattern;

import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> history;

    private int currentStateIndex = -1;

    Caretaker() {
        this.history = new ArrayList<>();
    }

    public void add(Memento memento) {
        history.add(memento);
        currentStateIndex = history.size() - 1;
    }

    private Memento getMemento(int index) {
        return history.get(index);
    }

    Memento undo() {
        System.out.println("Undoing state");
        if (currentStateIndex <= 0) {
            currentStateIndex = 0;
            return getMemento(0);
        }
        currentStateIndex--;
        return getMemento(currentStateIndex);
    }

    Memento redo() {
        System.out.println("Redoing state");
        if (currentStateIndex >= history.size() - 1) {
            currentStateIndex = history.size() - 1;
            return getMemento(currentStateIndex);
        }
        currentStateIndex++;
        return getMemento(currentStateIndex);
    }
}

package Behavioral.MementoPattern;

public class Memento {
    private String state;

    Memento(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

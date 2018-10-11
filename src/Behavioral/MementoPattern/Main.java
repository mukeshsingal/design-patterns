package Behavioral.MementoPattern;

/**
 * Memento is behavioral design pattern that lets you capture
 * the object's internal state without exposing its internal
 * structure so that object can be returned to the state later.
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setArticle("State 1: Mukesh");
        caretaker.add(originator.save());
        printState(originator);

        originator.setArticle("State 2: Ram");
        caretaker.add(originator.save());
        printState(originator);

        originator.restore(caretaker.undo());
        printState(originator);

        originator.restore(caretaker.redo());
        printState(originator);

        originator.restore(caretaker.redo());
        printState(originator);
    }

    private static void printState(Originator originator) {
        System.out.println("Current state " + originator.getArticle());
    }
}

package Behavioral.IteratorPattern;

/**
 * It is behavioural design pattern that let you access the elements
 * of an aggregate object sequentially without exposing its underlying
 * representation.
 */
public class Main {
    public static void main(String[] args) {
        IterableCollection collection = new ConcreteCollection();
        Iterator iterator = collection.createIterator();

        int i = 0;
        while (iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }
}

package Behavioral.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements IterableCollection {
    private List<String> internalList = new ArrayList<>();

    ConcreteCollection() {
        internalList.add("My");
        internalList.add("Name");
        internalList.add("is");
        internalList.add("Developer");
        internalList.add("Singal");
    }

    @Override
    public Iterator createIterator() {
        return new CustomIterator(this);
    }

    int size() {
        return internalList.size();
    }

    String getStringAtIndex(int index) {
        return internalList.get(index);
    }
}

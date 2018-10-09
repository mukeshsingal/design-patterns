package Behavioral.IteratorPattern;

public class CustomIterator implements Iterator {

    private ConcreteCollection concreteCollection;
    private int collectionSize;
    private int currentIndex = -1;

    CustomIterator(ConcreteCollection concreteCollection) {
        this.collectionSize = concreteCollection.size();
        this.concreteCollection = concreteCollection;
    }

    @Override
    public String getNext() {
        currentIndex++;
        return this.concreteCollection.getStringAtIndex(currentIndex);
    }

    @Override
    public boolean hasMore() {
        return currentIndex + 1 < collectionSize;
    }
}

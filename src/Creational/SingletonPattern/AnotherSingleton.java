package Creational.SingletonPattern;

class AnotherSingleton {
    private static final AnotherSingleton ourInstance = new AnotherSingleton();
    private int value;

    private AnotherSingleton() {
    }

    static AnotherSingleton getInstance() {
        return ourInstance;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }
}

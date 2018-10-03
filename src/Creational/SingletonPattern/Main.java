package Creational.SingletonPattern;

/**
 * Singleton pattern is creation design pattern that
 * Let's you ensure that class has only single instance
 * and provide global access to the instance.
 */
public class Main {
    public static void main(String[] args) {

        /* Using Enum : Thread Safe */
        MySingleton s1 = MySingleton.INSTANCE;
        MySingleton s2 = MySingleton.INSTANCE;
        s1.setValue(23);
        System.out.println(s2.getValue());

        /* Using Private Constructor: Not Threadsafe */
        AnotherSingleton singleton = AnotherSingleton.getInstance();
        AnotherSingleton singleton2 = AnotherSingleton.getInstance();
        singleton.setValue(4);
        System.out.println(singleton2.getValue());
    }

}

package Structural.ProxyPattern;

/**
 * Intent
 * <p>
 * 1) Provide a surrogate or placeholder for another object
 * to control access to it.
 * 2. Use an extra level of indirection to support distributed,
 * controlled, or intelligent access.
 * 3. Add a wrapper and delegation to protect the real component
 * from undue complexity.
 * <p>
 * Problem:
 * Creating resources intensive objects
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new CircleProxy();
        shape.display();
    }
}

package Structural.BridgePattern;

/**
 * Intent
 * 1. Decouple an abstraction from its implementation so that
 * the two can vary independently.
 * 2. Publish interface in an inheritance hierarchy, and bury
 * implementation in its own inheritance hierarchy.
 * 3. Beyond encapsulation, to insulation
 * <p>
 * Problem:
 */
public class Main {
    public static void main(String[] args) {
        GreenColor greenColor = new GreenColor();
        RedColor redColor = new RedColor();


        Shape shape = new Circle(greenColor, 4);
        shape.paintShape();
        shape.setColor(redColor);
        shape.paintShape();
    }
}

package Structural.AdapterPattern;

/**
 * 1. Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * 2. Wrap an existing class with a new interface.
 * Impedance match an old component to a new system
 *
 * Problem
 * An "off the shelf" component offers compelling functionality that you would like to reuse,
 * but its "view of the world" is not compatible with the philosophy and architecture of the
 * system currently being developed
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}

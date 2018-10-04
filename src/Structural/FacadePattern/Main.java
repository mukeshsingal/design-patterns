package Structural.FacadePattern;

/**
 * ShapeFacade providers is a structural design pattern
 * which let you provide a simplified interface to
 * a complex system or classed library or frameworks
 */
public class Main {
    public static void main(String[] args) {
        /*Here Facade only expose required methods to client to simplify/control the usage */
        ShapeFacade shape = new ShapeFacade();
        shape.drawCircle();
        shape.drawRectangle();
    }
}

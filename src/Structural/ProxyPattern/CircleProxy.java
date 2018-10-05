package Structural.ProxyPattern;

public class CircleProxy implements Shape {

    private Circle circle;

    /*
        If actual have parameterized constructor then here also you
        should have parameterized constructor.
    */
    CircleProxy() {
        circle = new Circle();
    }

    @Override
    public void display() {
        System.out.println("Going via Proxy");
        System.out.println("Validating data");

        //delete to Actual Concrete implementation
        circle.display();
    }
}

package Structural.BridgePattern;

public class Circle extends Shape {

    private int radius;

    Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
        this.shapeType = "Circle";
    }

    @Override
    public void computerArea() {
        this.area = 2 * 3 * radius * radius;
    }

}

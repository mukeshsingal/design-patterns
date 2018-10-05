package Structural.BridgePattern;

abstract public class Shape {
    int area;
    String shapeType;
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    void setColor(Color color) {
        this.color = color;
    }

    int getArea() {
        return area;
    }

    public abstract void computerArea();

    void paintShape() {
        System.out.println("Painting " + shapeType + " with " + color.fillColor());
    }
}

package Structural.FacadePattern;

public class ShapeFacade {
    private ShapeSubsystem circle;
    private ShapeSubsystem rectangle;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawCircle() {
        circle.draw();
    }
}

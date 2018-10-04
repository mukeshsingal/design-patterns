package Structural.DecoratorPattern;

// 3. "Core" class with "is a" relationship
public class TextField implements Widget {
    int width;
    int height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Text field : width " + width + ", Height : " + height);
    }
}

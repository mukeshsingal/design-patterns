package Structural.DecoratorPattern;

//6. Create a Decorator derived class for each optional embellishment
public class BorderDecorator extends Decorator {
    public BorderDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        //7. Decorator derived classes delegate to base class AND add extra stuff
        super.draw();
        addBorder();
    }

    public void addBorder() {
        System.out.println("Added Border");
    }
}

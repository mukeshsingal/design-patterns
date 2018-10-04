package Structural.DecoratorPattern;

//6. Create a Decorator derived class for each optional embellishment
public class ScrollDecorator extends Decorator {
    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        //7. Decorator derived classes delegate to base class AND add extra stuff
        super.draw();
        addScroll();
    }

    public void addScroll() {
        System.out.println("Added Scroll");
    }
}

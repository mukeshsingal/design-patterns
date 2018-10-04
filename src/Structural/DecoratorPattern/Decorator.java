package Structural.DecoratorPattern;

//2. Create a second level base class for optional functionality
abstract public class Decorator implements Widget {
    // 4. "has a" relationship
    Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    //Decorator class delegates to the "has a" object
    @Override
    public void draw() {
        widget.draw();
    }
}

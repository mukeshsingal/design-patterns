package Behavioral.VisitorPattern;

abstract class ChessComponent {
    private String componentName;

    ChessComponent(String componentName) {
        this.componentName = componentName;
    }

    String getComponentName() {
        return componentName;
    }

    abstract void accept(Visitor visitor);
}

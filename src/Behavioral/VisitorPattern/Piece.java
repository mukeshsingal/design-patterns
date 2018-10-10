package Behavioral.VisitorPattern;

class Piece extends ChessComponent {
    private String color;

    Piece(String componentName, String color) {
        super(componentName);
        this.color = color;
    }

    String getColor() {
        return color;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitPiece(this);
    }
}

package Behavioral.VisitorPattern;

class BoardBlock extends ChessComponent {

    private String blockColor;

    private Piece piece;

    BoardBlock(String name, String blockColor, Piece piece) {
        super(name);
        this.blockColor = blockColor;
        this.piece = piece;
    }

    String getBlockColor() {
        return blockColor;
    }

    Piece getPiece() {
        return piece;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitBlock(this);
    }
}


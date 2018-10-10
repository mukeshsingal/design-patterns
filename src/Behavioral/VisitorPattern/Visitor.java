package Behavioral.VisitorPattern;

public interface Visitor {
    void visitPiece(Piece piece);

    void visitBlock(BoardBlock boardBlock);
}

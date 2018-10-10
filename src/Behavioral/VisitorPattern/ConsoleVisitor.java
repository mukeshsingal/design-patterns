package Behavioral.VisitorPattern;

public class ConsoleVisitor implements Visitor {
    @Override
    public void visitPiece(Piece piece) {
        System.out.println("Visiting Piece with name " + piece.getComponentName() + "and color  " + piece.getColor());
    }

    @Override
    public void visitBlock(BoardBlock boardBlock) {
        System.out.println("Visiting : " + boardBlock.getComponentName() +
                "\n     This board has      : " + boardBlock.getBlockColor() +
                "\n     Block has Piece name: " + boardBlock.getPiece().getComponentName() +
                "\n     Piece color is      : " + boardBlock.getPiece().getColor());
    }
}

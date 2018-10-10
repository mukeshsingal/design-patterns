package Behavioral.VisitorPattern;

/**
 * Visitor Design patter is a behavioral design pattern which
 * let your define a new operation without changing the classes
 * of the objects on which it operates.
 */
public class Main {
    public static void main(String[] args) {
        Piece rook = new Piece("rook", "black");
        BoardBlock block = new BoardBlock("Block", "white", rook);

        block.accept(new ConsoleVisitor());
    }
}

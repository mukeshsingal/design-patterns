package Creational.AbstractFactoryPattern.products;

public class DominosFurniture extends Furniture {
    public DominosFurniture(String watermark) {
        super(watermark);
    }

    @Override
    public void use() {
        System.out.println("Dominos Style Furniture");
    }
}

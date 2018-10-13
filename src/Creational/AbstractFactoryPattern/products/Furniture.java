package Creational.AbstractFactoryPattern.products;

/**
 * Step 1:  The first thing that Abstract Factory pattern suggests is to go over
 * all distinct products and force their variants to follow common interfaces.
 */
public abstract class Furniture {
    private String watermark;

    public Furniture(String watermark) {
        this.watermark = watermark;
    }

    public abstract void use();
}

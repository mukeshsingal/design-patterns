package Creational.AbstractFactoryPattern.products;

public abstract class Furniture {
    private String watermark;

    public Furniture(String watermark) {
        this.watermark = watermark;
    }

    public abstract void use();
}

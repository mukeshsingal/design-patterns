package AbstractFactoryPattern.products;

public class KfcStyleFurniture extends Furniture {
    public KfcStyleFurniture(String watermark) {
        super(watermark);
    }

    @Override
    public void use() {
        System.out.println("KFC Style Furniture");
    }
}

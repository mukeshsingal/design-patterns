package Creational.AbstractFactoryPattern.products;

public class KfcStyleFoodMenu extends FoodMenu {
    public KfcStyleFoodMenu(String menuStyle) {
        super(menuStyle);
    }

    @Override
    public void render() {
        System.out.println("KFC style Food Menu");
    }
}

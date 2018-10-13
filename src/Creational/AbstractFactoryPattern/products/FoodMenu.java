package Creational.AbstractFactoryPattern.products;

/**
 * Step 1:  The first thing that Abstract Factory pattern suggests is to go over
 * all distinct products and force their variants to follow common interfaces.
 */
public abstract class FoodMenu {
    private String menuStyle;

    public FoodMenu(String menuStyle) {
        this.menuStyle = menuStyle;
    }

    public String getMenuStyle() {
        return menuStyle;
    }

    public abstract void render();
}

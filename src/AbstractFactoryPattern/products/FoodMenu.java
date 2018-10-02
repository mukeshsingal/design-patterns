package AbstractFactoryPattern.products;

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

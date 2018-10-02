package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.FoodChainFactory;
import AbstractFactoryPattern.products.FoodMenu;
import AbstractFactoryPattern.products.Furniture;

public class RestaurantWithAbstractFactory {
    private FoodMenu foodMenu;
    private Furniture furniture;

    public RestaurantWithAbstractFactory(FoodChainFactory foodChainFactory) {
        this.foodMenu = foodChainFactory.createFoodMenu();
        this.furniture = foodChainFactory.createFurniture();
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void renderShop() {
        this.foodMenu.render();
        this.furniture.use();
    }
}

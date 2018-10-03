package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Factory.FoodChainFactory;
import Creational.AbstractFactoryPattern.products.FoodMenu;
import Creational.AbstractFactoryPattern.products.Furniture;

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

package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Factory.FoodChainFactory;
import Creational.AbstractFactoryPattern.products.FoodMenu;
import Creational.AbstractFactoryPattern.products.Furniture;

/**
 * Step 4. Client code has to work with factories and products only through their abstract interfaces.
 * This way you can alter the type of products used in client code by passing it a different factory object.
 */
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

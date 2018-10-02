package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.products.FoodMenu;
import AbstractFactoryPattern.products.Furniture;

public interface FoodChainFactory {

    FoodMenu createFoodMenu();

    Furniture createFurniture();
}

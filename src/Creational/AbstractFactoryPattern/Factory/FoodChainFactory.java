package Creational.AbstractFactoryPattern.Factory;

import Creational.AbstractFactoryPattern.products.FoodMenu;
import Creational.AbstractFactoryPattern.products.Furniture;

public interface FoodChainFactory {

    FoodMenu createFoodMenu();

    Furniture createFurniture();
}

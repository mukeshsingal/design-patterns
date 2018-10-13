package Creational.AbstractFactoryPattern.Factory;

import Creational.AbstractFactoryPattern.products.FoodMenu;
import Creational.AbstractFactoryPattern.products.Furniture;

/**
 * Step 2. The second step is to create the AbstractFactory, a base interface that
 * declares methods for creating all products that make a product family.
 * The important thing here is to make these methods to return abstract product types
 * represented by interfaces we extracted previously.
 */
public interface FoodChainFactory {

    FoodMenu createFoodMenu();

    Furniture createFurniture();
}

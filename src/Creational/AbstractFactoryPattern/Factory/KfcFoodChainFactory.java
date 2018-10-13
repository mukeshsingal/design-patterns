package Creational.AbstractFactoryPattern.Factory;

import Creational.AbstractFactoryPattern.products.FoodMenu;
import Creational.AbstractFactoryPattern.products.Furniture;
import Creational.AbstractFactoryPattern.products.KfcStyleFoodMenu;
import Creational.AbstractFactoryPattern.products.KfcStyleFurniture;

/**
 * Step 3. The third step is to implement concrete factories. Factories are
 * classes that return products of a particular kind.
 * All factories must follow the AbstractFactory interface while
 * creating the same variety of products
 */

public class KfcFoodChainFactory implements FoodChainFactory {
    @Override
    public FoodMenu createFoodMenu() {
        return new KfcStyleFoodMenu("KFC Style food menu");
    }

    @Override
    public Furniture createFurniture() {
        return new KfcStyleFurniture("KFC Style Furniture");
    }
}

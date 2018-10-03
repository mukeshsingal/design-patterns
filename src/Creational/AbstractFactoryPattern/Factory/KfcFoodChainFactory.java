package Creational.AbstractFactoryPattern.Factory;

import Creational.AbstractFactoryPattern.products.FoodMenu;
import Creational.AbstractFactoryPattern.products.Furniture;
import Creational.AbstractFactoryPattern.products.KfcStyleFoodMenu;
import Creational.AbstractFactoryPattern.products.KfcStyleFurniture;

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

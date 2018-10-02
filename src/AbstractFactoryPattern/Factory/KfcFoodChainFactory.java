package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.products.FoodMenu;
import AbstractFactoryPattern.products.Furniture;
import AbstractFactoryPattern.products.KfcStyleFoodMenu;
import AbstractFactoryPattern.products.KfcStyleFurniture;

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

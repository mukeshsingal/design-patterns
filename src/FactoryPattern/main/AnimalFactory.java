package FactoryPattern.main;

import FactoryPattern.products.Animal;

public interface AnimalFactory {
    Animal creatAnimal(String petName, String petType);
}

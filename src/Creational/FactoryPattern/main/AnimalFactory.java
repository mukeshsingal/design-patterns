package Creational.FactoryPattern.main;

import Creational.FactoryPattern.products.Animal;

public interface AnimalFactory {
    Animal creatAnimal(String petName, String petType);
}

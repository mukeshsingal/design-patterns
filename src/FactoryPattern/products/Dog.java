package FactoryPattern.products;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Wow Wow .. ");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + " dog is moving.. ");
    }
}

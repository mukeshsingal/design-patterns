package Creational.AbstractFactoryPattern;


public class Customer {
    RestaurantWithAbstractFactory restaurant;

    public Customer(RestaurantWithAbstractFactory restaurant) {
        this.restaurant = restaurant;
    }

    public void setRestaurant(RestaurantWithAbstractFactory restaurant) {
        this.restaurant = restaurant;
    }

    public void visitRestaurant() {
        this.restaurant.renderShop();
    }

}

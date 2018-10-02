package AbstractFactoryPattern;

/**
 * It is Creational pattern which provides an interface
 * which encapsulate object creation and lets you produce
 * families of related objects without specifying their
 * concrete classes
 */
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

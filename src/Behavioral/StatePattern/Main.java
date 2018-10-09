package Behavioral.StatePattern;

/**
 * State is a Behavioral Design Pattern that allows
 * 1. an object to alter its behavior when its internal
 * state changes.
 * 2. The object will appear to changes its class.
 */
public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();

        lightBulb.displayState();
        lightBulb.toggle();
        lightBulb.displayState();
    }
}


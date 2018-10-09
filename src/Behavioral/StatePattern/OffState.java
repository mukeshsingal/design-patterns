package Behavioral.StatePattern;

public class OffState implements State {
    private LightBulb bulb;

    OffState(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void transitionTo(State nextState) {
        this.bulb.setCurrentState(nextState);
    }

    @Override
    public void displayState() {
        System.out.println("Light bulb is turned off");
    }
}

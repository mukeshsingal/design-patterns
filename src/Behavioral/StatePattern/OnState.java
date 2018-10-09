package Behavioral.StatePattern;

public class OnState implements State {
    private LightBulb bulb;

    OnState(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void transitionTo(State nextState) {
        this.bulb.setCurrentState(nextState);
    }

    @Override
    public void displayState() {
        System.out.println("Light bulb is turned on");
    }
}

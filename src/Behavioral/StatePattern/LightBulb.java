package Behavioral.StatePattern;

import java.util.HashMap;
import java.util.Map;

class LightBulb {
    private State currentState;
    private Map<State, State> lightBulbStateMap = new HashMap<>();

    LightBulb() {
        State onState = new OnState(this);
        State offState = new OffState(this);

        lightBulbStateMap.put(onState, offState);
        lightBulbStateMap.put(offState, onState);

        currentState = offState;
    }

    void setCurrentState(State state) {
        currentState = state;
    }

    void displayState() {
        currentState.displayState();
    }

    void toggle() {
        this.currentState.transitionTo(lightBulbStateMap.get(currentState));
    }
}

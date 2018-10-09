package Behavioral.StrategyPattern;

public class FirstStrategy implements Strategy {
    @Override
    public String execute() {
        return "This is first strategy";
    }
}

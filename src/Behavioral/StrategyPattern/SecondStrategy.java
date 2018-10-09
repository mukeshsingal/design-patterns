package Behavioral.StrategyPattern;

public class SecondStrategy implements Strategy {
    @Override
    public String execute() {
        return "This is second strategy";
    }
}

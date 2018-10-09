package Behavioral.StrategyPattern;

class Context {
    private Strategy myStrategy;

    Context(Strategy strategy) {
        this.myStrategy = strategy;
    }

    void setMyStrategy(Strategy strategy) {
        this.myStrategy = strategy;
    }

    String doSomething() {
        return myStrategy.execute();
    }
}

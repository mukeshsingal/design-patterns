package Behavioral.StrategyPattern;

/**
 * Strategy is behavioral Design pattern that let you define family
 * of family of Algorithms encapsulate each one and make them
 * interchangeable. Strategy let the Algorithm vary independent from
 * the client that use it.
 */
public class Main {
    private Context context;

    public Main(Context context) {
        this.context = context;
    }

    public static void main(String[] args) {
        Context context = new Context(new SecondStrategy());
        Main main = new Main(context);
        main.execute();

        //Lets change the Strategy
        context.setMyStrategy(new FirstStrategy());
        main.execute();
    }

    private void execute() {
        //Do something using first strategy
        System.out.println(context.doSomething());
    }
}

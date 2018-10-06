package Behavioral.ChainOfResponsibiltyPattern;

public class Main {
    public static void main(String[] args) {
        Handler c1 = new NegativeNumberHandler();
        Handler c2 = new ZeroHandler();
        Handler c3 = new PostiveNumberHandler();
        c1.setNext(c2);
        c2.setNext(c3);

        //
        c1.process(new Number(90));
        c1.process(new Number(-50));
        c1.process(new Number(0));
        c1.process(new Number(91));
    }
}

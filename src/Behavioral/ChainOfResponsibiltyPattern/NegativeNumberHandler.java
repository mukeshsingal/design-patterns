package Behavioral.ChainOfResponsibiltyPattern;

public class NegativeNumberHandler implements Handler {
    private Handler nextInChain;

    @Override
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("Negative Number Processor processed " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }

    @Override
    public void setNext(Handler handler) {
        nextInChain = handler;
    }
}

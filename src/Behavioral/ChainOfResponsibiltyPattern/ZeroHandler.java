package Behavioral.ChainOfResponsibiltyPattern;

public class ZeroHandler implements Handler {
    private Handler nextInChain;

    @Override
    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("Zero Handler processed " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }

    @Override
    public void setNext(Handler handler) {
        nextInChain = handler;
    }
}

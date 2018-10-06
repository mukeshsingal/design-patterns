package Behavioral.ChainOfResponsibiltyPattern;

public class PostiveNumberHandler implements Handler {
    private Handler nextInChain;

    @Override
    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("Positive Number Handler");
        } else {
            nextInChain.process(request);
        }
    }

    @Override
    public void setNext(Handler handler) {
        nextInChain = handler;
    }
}

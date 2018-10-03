package Behavioral.CommandPattern.receiver;

public class LightReceiverImpl extends Receiver {
    public LightReceiverImpl(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Light is on");
    }

    @Override
    public void off() {
        System.out.println("Light is off");
    }
}

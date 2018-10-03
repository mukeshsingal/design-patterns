package Behavioral.CommandPattern.receiver;

public class MotorReceiverImpl extends Receiver {
    public MotorReceiverImpl(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Motor started");
    }

    @Override
    public void off() {
        System.out.println("Motor turned off");
    }
}

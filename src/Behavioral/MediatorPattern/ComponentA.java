package Behavioral.MediatorPattern;

public class ComponentA extends Component {

    ComponentA(Mediator mediator) {
        super("Component A", mediator);
    }

    @Override
    public void send() {
        String messgae = "I am good.";
        System.out.println("A is sending " + messgae);
        this.mediator.notify(this, messgae);
    }

    @Override
    public void receive(String message) {
        System.out.println("Component A got message " + message);
    }
}

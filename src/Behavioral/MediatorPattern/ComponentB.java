package Behavioral.MediatorPattern;

public class ComponentB extends Component {
    ComponentB(Mediator mediator) {
        super("Component B", mediator);
    }

    @Override
    public void send() {
        String messgae = "How are you.";
        System.out.println("B is sending " + messgae);
        this.mediator.notify(this, messgae);
    }

    @Override
    public void receive(String message) {
        System.out.println("Component B got message " + message);
    }


}

package CommandPattern.command;

import CommandPattern.receiver.Receiver;

public class TurnOnCommandImpl implements Command {
    private Receiver receiver;

    public TurnOnCommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}

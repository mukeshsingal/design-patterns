package CommandPattern;


import CommandPattern.command.Command;
import CommandPattern.command.TurnOnCommandImpl;
import CommandPattern.receiver.LightReceiverImpl;
import CommandPattern.receiver.MotorReceiverImpl;
import CommandPattern.receiver.Receiver;

import java.util.ArrayList;
import java.util.List;

/**
 * Command Design pattern is a behavioural design pattern which
 * let you convert a request into standalone object which is used
 * to parameterized object with different requests, queue or log
 * requests and support undoable operations.
 */
public class Main {
    private Invoker invoker;
    private List<Command> commandList = new ArrayList<>();

    public static void main(String[] args) {
        Main client = new Main();
        client.run();
    }

    public void run() {
        Receiver receiver1 = new LightReceiverImpl("Flash Light");
        Receiver receiver2 = new MotorReceiverImpl("Water Motor");

        Command command = new TurnOnCommandImpl(receiver1);
        Command command2 = new TurnOnCommandImpl(receiver2);

        commandList.add(command);
        commandList.add(command2);

        invoker = new Invoker(command);
        invoker.executeCommand();

        invoker = new Invoker(command2);
        invoker.executeCommand();

        commandList.forEach(commandBackup -> {
            invoker.setCommand(commandBackup);
            invoker.undoCommand();
        });
    }

}


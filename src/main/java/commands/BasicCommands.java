package commands;

import io.IO;

import java.util.HashMap;

public class BasicCommands implements CommandCollection {

    IO io;
    HashMap<String, Command> commands;

    public BasicCommands(IO io) {

        this.io = io;
        commands = new HashMap<String, Command>();

        commands.put("help", new Help(io));
        commands.put("exit", new Exit(io));
    }

    public Command getCommand(String readIn) {

        Command command = commands.get(readIn);
        if(command == null) {
            command = commands.get("help");
        }
        return command;
    }
}

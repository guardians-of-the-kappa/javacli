import commands.BasicCommands;
import io.IO;

public class UI {

    IO io;
    BasicCommands basicCommands;

    public UI(IO io) {

        this.io = io;
        basicCommands = new BasicCommands(io);
    }

    public void start() {

        boolean control = true;
        while(control) {
            io.write("");
            io.write("Type 'help' for a list of available basicCommands");

            String command = io.read("> ");
            control = basicCommands.getCommand(command).run();
        }
    }

}

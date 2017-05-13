import io.IO;
import commands.Commands;

public class UI
{

    IO io;
    Commands commands;

    public UI( IO io )
    {
        this.io = io;
        commands = new Commands( io );
    }

    public void start()
    {
        boolean control = true;
        while (control) {
            io.write( "" );
            io.write( "Type 'help' for a list of available commands" );

            String command = io.read( ">>> " );
            control = commands.get(command).run();
        }
    }

}

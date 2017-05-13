package commands;

import java.util.HashMap;
import io.IO;

public class Commands
{
    IO io;
    HashMap<String, Command> commands;

    public Commands( IO io )
    {
        this.io = io;
        commands = new HashMap<String, Command>();

        commands.put( "help", new Help( io ) );
        commands.put( "exit", new Exit( io ) );
    }

    public Command get( String readIn )
    {
        Command command = commands.get( readIn );
        if ( command == null )
        {
            command = commands.get( "help" );
        }
        return command;
    }
}

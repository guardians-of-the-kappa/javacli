package commands;

import io.IO;

public class Help
    implements Command
{

    IO io;

    public Help( IO io )
    {
        this.io = io;
    }

    @Override
    public boolean run()
    {
        io.write( "" );
        io.write( "List of available commands:" );
        io.write( "help - prints all the available commands" );
        io.write( "exit - quits the program" );

        return true;
    }
}

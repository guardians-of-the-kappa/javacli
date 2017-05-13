package commands;

import io.IO;

public class Exit
    implements Command
{
    IO io;

    public Exit( IO io )
    {
        this.io = io;
    }

    @Override
    public boolean run()
    {
        return false;
    }
}

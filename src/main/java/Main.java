import java.util.Scanner;
import io.ConsoleIO;

public class Main
{
    public static void main( String [] args )
    {
        new UI(new ConsoleIO(new Scanner(System.in))).start();
    }
}

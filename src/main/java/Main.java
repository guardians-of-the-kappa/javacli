import io.ConsoleIO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new UI(new ConsoleIO(new Scanner(System.in))).start();
    }
}

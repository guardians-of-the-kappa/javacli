package io;

import java.util.Scanner;

public class ConsoleIO implements IO {

    private Scanner in;

    public ConsoleIO(Scanner scanner) {

        this.in = scanner;
    }

    @Override
    public String read(String input) {

        System.out.print(input);
        return in.nextLine();
    }

    @Override
    public void write(String output) {

        System.out.println(output);
    }

}

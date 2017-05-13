import io.ConsoleIO;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleIOTest extends TestCase {

    public ConsoleIOTest(String testName) {

        super(testName);
    }

    public static Test suite() {

        return new TestSuite(ConsoleIOTest.class);
    }

    public void testConsoleIO() {

        ConsoleIO testIO = new ConsoleIO(new Scanner(System.in));

        String gachi = "swallow my cum";
        testIO.write(gachi);
        assertEquals(gachi, testIO.read(""));
    }
}

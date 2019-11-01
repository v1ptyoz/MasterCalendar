import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public static String getString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static void printString(String string) {
        System.out.println(string);
    }
}

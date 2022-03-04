package T5.Q8;

import java.io.Console;

public class UserPassword {
    public static void main(String[] args) {
        Console console = System.console();
        char[] password = console.readPassword();
        System.out.println(String.valueOf(password));
    }
}

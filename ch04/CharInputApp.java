package gr.aueb.cf.ch04;

import java.io.IOException;

/**
 * Διαβάζει έναν char με την
 * System.in.read()
 */
public class CharInputApp {

    public static void main(String[] args) throws IOException {
        char inputChar;

        System.out.println("Please insert an ASCII char");
        inputChar = (char) System.in.read();

        System.out.println("char: " + inputChar);
    }
}

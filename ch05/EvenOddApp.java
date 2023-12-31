package gr.aueb.cf.ch05;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένας int είναι
 * άρτιος ή περιττός.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        //boolean isEven = false;

        System.out.println("Please insert an int");
        num = in.nextInt();

        //isEven = EvenOddApp.isEven(num);

        System.out.println("Num "  + num + " is even: " + isEven(num));
    }

    /**
     * Evaluates an int if it is even or not.
     *
     * @param n     the number (int) to evaluate.
     * @return      true, if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

}

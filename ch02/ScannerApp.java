package gr.aueb.cf.ch02;

import java.util.Scanner;

/**
 * Διαβάζει από το std input (πληκτρολόγιο)
 * δύο ακεραίους και τους προσθέτει.
 */
public class ScannerApp {

    public static void main(String[] args) {
        // Δήλωση μεταβλητών και αρχικοποίηση
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.println("Please insert two ints");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}

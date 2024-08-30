package org.example;

import java.util.Scanner;

public class FibonacciChecker {

    public static boolean isFibonacci(int number) {
        int a = 0, b = 1;

        if (number == a || number == b) {
            return true;
        }

        int next = a + b;
        while (next <= number) {
            if (next == number) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is part of the Fibonacci sequence: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("The number " + number + " is part of the Fibonacci sequence.");
        } else {
            System.out.println("The number " + number + " is not part of the Fibonacci sequence.");
        }

        scanner.close();
    }

}

package org.example;

import java.util.Scanner;

public class LetterACounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The letter 'a' was found " + count + " times in the string.");
        } else {
            System.out.println("The letter 'a' was not found in the string.");
        }

        scanner.close();
    }

}

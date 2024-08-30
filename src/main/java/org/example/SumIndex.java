package org.example;

public class SumIndex {
    public static void main(String[] args) {
        int INDEX = 12, SUM = 0, K = 1;

        while (K < INDEX) {
            K = K + 1;
            SUM = SUM + K;
        }

        System.out.println("The final value of SUM is: " + SUM);
    }

}

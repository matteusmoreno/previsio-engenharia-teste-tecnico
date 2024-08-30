package org.example;

public class SequenceSolver {

    public static void main(String[] args) {
        // a) Sequence: 1, 3, 5, 7, ___
        int[] sequenceA = {1, 3, 5, 7};
        int nextA = sequenceA[sequenceA.length - 1] + 2; // Arithmetic progression with a difference of +2
        System.out.println("a) The next number is: " + nextA);

        // b) Sequence: 2, 4, 8, 16, 32, 64, ____
        int[] sequenceB = {2, 4, 8, 16, 32, 64};
        int nextB = sequenceB[sequenceB.length - 1] * 2; // Geometric progression (multiplying by 2)
        System.out.println("b) The next number is: " + nextB);

        // c) Sequence: 0, 1, 4, 9, 16, 25, 36, ____
        int[] sequenceC = {0, 1, 4, 9, 16, 25, 36};
        int nextC = (sequenceC.length) * (sequenceC.length); // Sequence of perfect squares
        System.out.println("c) The next number is: " + nextC);

        // d) Sequence: 4, 16, 36, 64, ____
        int[] sequenceD = {4, 16, 36, 64};
        int nextD = (sequenceD.length + 2) * (sequenceD.length + 2); // Sequence of squares of even numbers
        System.out.println("d) The next number is: " + nextD);

        // e) Sequence: 1, 1, 2, 3, 5, 8, ____
        int[] sequenceE = {1, 1, 2, 3, 5, 8};
        int nextE = sequenceE[sequenceE.length - 1] + sequenceE[sequenceE.length - 2]; // Fibonacci sequence
        System.out.println("e) The next number is: " + nextE);

        // f) Sequence: 2, 10, 12, 16, 17, 18, 19, ____
        int[] sequenceF = {2, 10, 12, 16, 17, 18, 19};
        int nextF = 20; // Sequence with consecutive numbers after 16
        System.out.println("f) The next number is: " + nextF);
    }
}



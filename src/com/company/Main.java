package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        // mazeWhile(keyboard);
        // mazeRecursive(keyboard);
        System.out.println(factorialRecursive(30));
    }

    public static void mazeWhile(Scanner inputDevice) {
        String response;
        // The user will continue to be prompted if they answer "left".
        do {
            System.out.println("You are in a scary maze. Do you want to go left or right?");
            response = inputDevice.next();
        } while (response.equals("left"));
        System.out.println("You fell in a pit; you lose.");
    }

    public static void mazeRecursive(Scanner inputDevice) {
        // Recursive methods call themselves.
        // Recursion is an approach in which we have a method call itself.
        String response;
        System.out.println("You are in a scary maze. Do you want to go left or right?");
        response = inputDevice.next();
        if (! response.equals("left")) { // This is the base case.
            System.out.println("You fell in a pit; you lose.");
        }
        else {
            mazeRecursive(inputDevice); // This step is the recursion.
        }
    }

    public static int factorialRecursive(int n){
        // The base case is n = 0.
        /* This is the case at which the values of the input variables
         * ensure no recursive calls.
         */
        if (n < 0) {
            throw new IllegalArgumentException("Factorial requires a non-negative argument.");
        }
        if (n == 0){
            return 1;
        }
        /* Define each recursive call so that we make progress toward a
         * base case.
         */
        return n * factorialRecursive(n-1);

    }
}
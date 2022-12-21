package main.java.com.devxschool;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /**
         * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
         * Calculate factorial and output result to the console.
         * ex: 5! = 5 * 4 * 3 * 2 * 1
         * 5! = 1 * 2* 3 * 4 * 5
         * Enter a number:
         * 5
         * Factorial result: 120
         */

        // TODO write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter valid number: ");

        } else {

            calculate(num);
        }


        // factor = 1, factor = 2, factor = 6  -> 6! = 1*2*3
    }

    public static void calculate(long number) {
        // TODO IMPLEMENT METHOD

        long factor = 1;
        for (long i = 1; i <= number; i++) {


            factor = factor * i;


        }
        System.out.println("Factorial result: " + factor);


    }
}
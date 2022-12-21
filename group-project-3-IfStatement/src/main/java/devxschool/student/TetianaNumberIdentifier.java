package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class TetianaNumberIdentifier {
    public static void main(String[] args) {

        /**
         *
         * Write a Java program that reads an integer and check whether it is negative, zero, or positive.
         *
         * example output:
         * Enter a number
         * 0
         * Your number "0" is zero
         */

        Scanner scanner;
        int number = 0;
        String value = "";

        //TODO implement your code here...

        scanner = new Scanner(System.in);

        System.out.println("Please choose a number: ");

        number = scanner.nextInt();


        if (number >= 1) {
            value = "positive";
        } else if (number == 0) {
            value = "zero";

        } else {
            value = "negative";
        }
        System.out.println(value);


    }
}










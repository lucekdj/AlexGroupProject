package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class DayIdentifier {

    public static void main(String[] args) {
        /**
         *
         * Write a Java program that keeps a number from the user between 1 and 7 and displays the name of the weekday.
         *
         * example output:
         * Enter a number to get day of the week
         * 1
         * You selected Monday!
         *
         * another output:
         * Enter a number to get day of the week
         * 8
         * 8
         * You selected Wrong day!
         *
         */

        Scanner scanner;
        int input = 0;
        String day = "";

        //TODO implement your code here...
        scanner = new Scanner(System.in);

        System.out.println("Enter a number to get day of the week;");
        input = scanner.nextInt();
        if (input <= 0 && input > 7){

        } else if (input == 1) {
            System.out.println("You selected Monday!");
        } else if (input == 2) {
            System.out.println("You selected Tuesday!");
        } else if (input == 3) {
            System.out.println("You selected Wednesday!");
        } else if (input == 4) {
            System.out.println("You selected Thursday!");
        } else if (input == 5) {
            System.out.println("You selected Friday!");
        } else if (input == 6) {
            System.out.println("You selected Saturday!");
        } else if (input == 7) {
            System.out.println("You selected Sunday!");

        } else {

            System.out.println(" You selected Wrong day! ");
        }

    }
}

package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class SamDayIdentifier {

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
         * You selected Wrong day!
         *
         */

        Scanner scanner;
        int input = 0;
        String day = "";

        //TODO implement your code here...
        scanner = new Scanner(System.in);

        System.out.println("Please enter a number to get day of week: ");
        input = scanner.nextInt();

        if(input >= 1 && input <= 7){
            if (input == 1 ){
                day = "Monday";
            } else if (input == 2 ){
                day = "Tuesday";
            } else if (input == 3 ) {
                day = "Wednesday";
            } else if (input == 4 ) {
                day = "Thursday";
            } else if (input == 5 ) {
                day = "Friday";
            } else if (input == 6 ) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }
        } else {
            day = "Wrong Day";
        }

        System.out.println(day);

        Validation.testDayIdentifier(input, day);
    }
}
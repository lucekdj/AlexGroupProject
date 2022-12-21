package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        /**
         *
         * A company decided to give a bonus of 3% if his/her year of service is more than 3 years inclusively and 5% to employee if his/her year of service is more than 5 years exclusively.
         * Ask user for their salary and year of service and print the net bonus amount.
         *
         * example output:
         * Enter you salary:
         * 100000
         * Enter years of service:
         * 3
         * Your bonus is 3000.0
         */
        Scanner  scanner;

        int salary = 0;
        int yearOfService = 0;
        double bonus = 0;
        scanner = new Scanner(System.in);

        //TODO implement your code here...


        System.out.println("Your bonus is " + bonus);


        //ignore this
        Validation.testBonus(salary, yearOfService, bonus);
    }
}

package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        /**
         *
         * Write Java program to allow the user to input his/her age.
         * Then the program will show if the person is eligible to vote.
         * A person who is eligible to vote must be older than or equal to 18 years old.
         *
         * example output:
         * Enter your age
         * 1
         * Eligible to vote: false
         */
        Scanner scanner;
        int age = 0;
        boolean isEligible = false;


        //TODO implement your code here...
        scanner = new Scanner(System.in);

        System.out.println(" Enter your age ");
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println(" isEligible");
        } else {
            System.out.println("Eligible to vote: " + isEligible);


            //ignore this...
            Validation.testVoter(age, isEligible);
        }
    }
}

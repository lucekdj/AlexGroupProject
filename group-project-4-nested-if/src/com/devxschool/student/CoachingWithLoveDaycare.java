package com.devxschool.student;

import com.devxschool.test.Validation;

import java.util.Scanner;

public class CoachingWithLoveDaycare {
    public static void main(String[] args) {

        /**
         *
         * Write a java program for Coaching with Love Daycare.
         * Follow acceptance criteria:
         * age should be older than 1.5 but younger than 6 (inclusively)
         * if age is less than 3 years -> class name is Star and fee is 2000
         * if age is less than 6 years -> class name is Sun and fee is 1500
         * if they agree with the price -> print child is accepted.
         * otherwise child should not have a class and print he/she is not accepted.
         *
         *
         *
         * 1)example output - positive:
         * Enter child's name
         * Elsa
         * Enter age:
         * 2
         * Daycare fee is 2000
         * Would you like to apply?
         * true
         * Congratulations! Elsa is accepted!
         * Elsa's class is Star
         *
         * 2)example output - negative:
         * Enter child's name
         * Anna
         * Enter age:
         * 3
         * Daycare fee is 1500
         * Would you like to apply?
         * false
         * Anna is not accepted.
         *
         * 3)example output - negative:
         * Enter child's name
         * Christoph
         * Enter age:
         * 1
         * Christoph is not accepted.
         *
         */


        Scanner scan = new Scanner(System.in);
        String name = "";
        double age = 0;
        int price = 0;
        String childClass = "";
        boolean agreement = false;


        // TODO WRITE YOUR CODE HERE
        System.out.println(" Please enter the child's name ");
        name = scan.next();

        System.out.println(" Enter the child's age ");
        age = scan.nextDouble();

        if (age > 1.5 && age <= 6) {
            if (age < 3) {
                childClass = "Star";
                price = 2000;
            } else {

                if (age < 6) {
                    childClass = "Sun";
                    price = 1500;
                    System.out.println(" Day care fee is: " + price);

                    System.out.println(" Would you like to apply? ");
                    agreement = scan.hasNextBoolean();


                    if (agreement) {
                        System.out.println(" Congratulations!" + name + "is accepted!. ");

                        System.out.println(name + " 's Class is" + childClass);
                    } else {
                        childClass = null;
                        System.out.println(name + "is not accepted. ");

                    }
                }else{
                    childClass = null;
                    System.out.println(name + "is not accepted. ");

                }


            }
        }
    }
}
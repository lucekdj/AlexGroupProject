package com.devxschool.student;

import com.devxschool.test.Validation;

import java.util.Scanner;

public class JoliesRestaurant {
    public static void main(String[] args) {
        /**
         *
         * Write a check to a customer based on their input
         * - how many people?
         * - what is the total amount?
         *      * automatically add 10% tax fee
         * - provide check together or split?
         *      * split - divide amount per person
         *      * together - one total amount for all
         * - how was the restaurant's service?
         *      * bad - 10%
         *      * ok - 15%
         *      * good - 20%
         *      * perfect - 25%
         *
         *
         * example output:
         * out: Welcome to Jolie's Restaurant!!!
         * out: Enter number of guests:
         *  in: 5
         * out: Enter a restaurant bill amount:
         *  in: 200
         * out: Is your check split?
         *  in: true
         * out: How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)
         *  in: perfect
         * out: Number of guests: 5
         * out: Total amount: $275.0
         * out: Total per guest: $55.0
         */

        Scanner scanner = new Scanner(System.in);
        int numberOfGuests = 0;
        double billAmount = 0;
        double taxFee = 0;
        boolean isSplit = false;
        String serviceQuality = "";
        double totalAmount = 0;
        double totalAmountPerGuest = 0;

        //TODO write your code here
        System.out.println("Welcome to Jolie's Restaurant!!!");
        System.out.println("Enter number of guests:");
        numberOfGuests = scanner.nextInt();
        System.out.println("Enter a restaurant bill amount:");
        billAmount = scanner.nextDouble();
        //taxFee = billAmount/10;
        System.out.println("Is your check split?");
        isSplit = scanner.nextBoolean();
        System.out.println("How was the restaurant's service?");
        serviceQuality = scanner.next();
        totalAmount = billAmount / 10 + billAmount;
        //totalAmount = taxFee+totalAmount*10;

    /*    switch (serviceQuality) {
            case "bad":
                System.out.println(totalAmount * 0.1);
                break;
            case "ok":
                System.out.println(totalAmount * 0.1);
                break;
            case "ok":
                System.out.println(totalAmount * 0.1);
                break;
            case "ok":
                System.out.println(totalAmount * 0.1);
                break;



                break;


            taxFee = billAmount / 10;
            // ignore this
            Validation.testBill(numberOfGuests, billAmount, isSplit, serviceQuality, totalAmount, totalAmountPerGuest);
*/
        }
    }


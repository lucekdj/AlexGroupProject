package com.devxschool;

import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        /**
         * Online Book Merchant offers premium customers 1 free book with every purchase of 5 or more books
         * and offers 2 free books with every purchase of 8 or more books.
         * It offers regular customers 1 free book with every purchase of 7 or more books
         * and offers 2 free books with every purchase of 12 or more books.
         *
         * Write a program to calculate number of free books.
         *
         *  sample output:
         * Are you a premium customer?
         * true
         * How many books for purchase?
         * 9
         * You qualify for 2 free books
         *
         */

        int freeBooks, numberOfBooksPurchased;
        boolean isPremiumCustomer;
        Scanner scanner = new Scanner(System.in);
        BookShop bookShop = new BookShop();

        //TODO write your code here
        //premium 1 free books  with >=5 books
        //premium 2 free books with >=8 books
        //regular 1 free with >=7 books
        //regular 2 free wit >=12

        System.out.println("Are you a premium customer?");
        isPremiumCustomer = scanner.nextBoolean();
        System.out.println("How many books for purchase?");
        numberOfBooksPurchased = scanner.nextInt();
        freeBooks = bookShop.countFreeBooks(isPremiumCustomer, numberOfBooksPurchased);
        System.out.println("You qualify for " + freeBooks + " free books");


    }

    public int countFreeBooks(boolean isPremiumCustomer, int numberOfBooks) {
        //TODO implement method

        if (isPremiumCustomer) {
            if (numberOfBooks >= 8) {
                return 2;
            } else if (numberOfBooks >= 5) {
                return 1;

            }
        }else {
            if (numberOfBooks >= 12) {
                return 2;
            } else if (numberOfBooks >= 7) {
                return 1;

            }
        }
        return -1;
    }
}
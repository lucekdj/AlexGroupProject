package com.devxschool;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /**
         * Write a java program to find out if the given year is leap or not
         *
         *  sample output:
         * Enter any calendar year : 2000
         * 2000 is a leap year
         */

        int year;
        Scanner scanner = new Scanner(System.in);
        LeapYear leapYear = new LeapYear();

        //TODO write your code here
        System.out.println("Enter Year to check if is leap year ");
        year = scanner.nextInt();
        leapYear.leapOrNot( year);



    }

    public boolean leapOrNot(int year) {
        //TODO IMPLEMENT METHOD
        if ((year % 4 == 0 && year % 100 !=0 ) || year%400==0) {
            System.out.println(" It is a leap year");
            return true;
        } else {
            System.out.println(" Entered year is NOT a leap year ");

        }
        return false;
    }
}


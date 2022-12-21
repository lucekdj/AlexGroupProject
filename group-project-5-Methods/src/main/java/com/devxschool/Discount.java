package com.devxschool;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {


        /**
         * Write a java program to calculate discount for a product
         *
         *  sample output:
         * Marked price:
         * 100
         * Discount rate:
         * 25
         * Amount after discount: 75.0
         */

        double markedPrice, discount, amount;
        Scanner scanner = new Scanner(System.in);
        Discount discountObj = new Discount();
        // in line 22 I'm creating an object named discountObj so that I can access
        // my nonstatic method calculateDiscount
        Discount  messageObj = new Discount();
        //in line 25 I'm creating an object named messageObj so that I can access
        // my nonstatic method printMessage
        //new is the keyword that indicates that our messageObj  object is new instance
        //of the class Discount



        //TODO WRITE YOUR CODE HERE


        System.out.println(" Enter markedPrice ");
        markedPrice = scanner.nextDouble();
        System.out.println(" Enter discount amount ");
        discount = scanner.nextDouble();


        amount = discountObj.calculateDiscount(markedPrice, discount);
        // method calculateDiscount gets called by referencing object named discountObj
        //and passing the values of variables markedPrice and discount (36)
        // as arguments

        messageObj.printMessage(amount);
    }

    public  double calculateDiscount(double markedPrice, double discount) {
        //TODO IMPLEMENT METHOD//
        //line 44 we define method  calculateDiscount
        //this method is non static
        //public is access identifier
        //double is return type
        //inside () we have parameters
        // our parameters store the values of the arguments that we passed to our method
        //upon calling it within the main method
        return markedPrice-(markedPrice*(discount/100));
        // line 54 we have our return statement ,return is a java keyword that indicates
        //what type of data our method will be returning

    }

    public  void printMessage(double amount ) {

        //void is an identifier which specifies that our method doesn't return any value
        // inside () is parameter which stores the value of the argument that we passed
        //to our method upon calling it within the main method


        //TODO IMPLEMENT METHOD


        System.out.println( " Your amount after discount: " + amount);
        // my method is performing the printing function using println method of the class System
    }



}




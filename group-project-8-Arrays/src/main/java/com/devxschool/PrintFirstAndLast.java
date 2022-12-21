package com.devxschool;

import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        /**
         * Given an array of String, iterate through each word
         * Print first and last letters of each element in a separate line
         */

        Scanner scanner = new Scanner(System.in);
        String[] words = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        printLetters(words);
    }

    public static void printLetters(String[] words) {
        //TODO IMPLEMENT THIS METHOD
        for (String singleword : words){
            System.out.println("" + singleword.charAt(0) + singleword.charAt(singleword.length()-1));

        }
    }
}
package com.devxschool;

import java.util.Scanner;

public class CountChars {

    public static void main(String[] args) {
        /**
         * Write a program to count number of vowels, consonants,
         * digits, special characters and whitespaces in the string
         *
         * Ex 1:
         *
         * Enter the string : This program is very easy
         * Vowels: 7
         * Consonants: 14
         * Digits: 0
         * White spaces: 4
         * Symbols : 0
         *
         * Ex 2:
         *
         * Enter the string : 123 this very ^^
         * Vowels: 2
         * Consonants: 6
         * Digits: 3
         * White spaces: 3
         * Symbols : 2
         */

        String line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        line = sc.nextLine();
        printCounts(line);

    }

    public static void printCounts(String word) {
        // TODO IMPLEMENT METHOD
        int countVowels = 0;
        int countConsonants = 0;
        int countDigits = 0;
        int countWhiteSpaces = 0;
        int countSymbols = 0;


        for (int i = 0; i < word.length(); i++){
            char a = word.charAt(i);

            if (a == 'a' || a == 'o'|| a == 'i'|| a == 'e'|| a == 'u' || a == 'A' || a == 'O'|| a == 'I'|| a == 'E'|| a == 'U'){
                countVowels++;
            } else if (a>='a' && a<='z' || a>='A' && a<='Z'){
                countConsonants++;
            } else if (a>='0' && a<='9') {
                countDigits++;
            } else if (a==' ') {
                countWhiteSpaces++;
            } else {
                countSymbols++;
            }
        }
        System.out.println("Vowels " + countVowels);
        System.out.println("Consonants " + countConsonants);
        System.out.println("Digits " + countDigits);
        System.out.println("White Spaces " + countWhiteSpaces);
        System.out.println("Symbols "+countSymbols);

    }
}
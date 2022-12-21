package com.devxschool.inclasswork;

import java.util.Scanner;

public class VowelOrConsonantSwitch {



        public static void main (String[]args){
            System.out.println("Input an alphabet: ");
            Scanner input = new Scanner(System.in);
            String enteredString = input.next();
           // checks whether an input has 1 letter
            if (enteredString.length() > 1) {
                System.out.println("Input length is longer than 1");
                System.exit(0);
            }
           // converts String to lower case char
            char toChar = enteredString.toLowerCase().charAt(0);


            String result = "";
           // checks if char is numeric or alphabetic
            if (Character.isAlphabetic(toChar)) {
                // TODO write your code here
                switch (toChar) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        result = "Vowel";
                        break;
                    default:
                        result = "Consonant";
                }
                System.out.println("Input letter is " + result);
            }

//ignore this...
//Validation.testAlphabet(toChar, result);
        }
    }




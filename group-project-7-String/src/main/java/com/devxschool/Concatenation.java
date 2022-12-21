package com.devxschool;

public class Concatenation {

    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the character's
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */

        //TODO WRITE YOUR CODE HERE
        String str1 = "abc", str2 = "xyz";

        System.out.println(concat(str1, str2));


    }

    public static String concat(String word1, String word2) {
        // TODO IMPLEMENT METHOD
        char a = word1.charAt(word1.length() - 1);
        char b = word2.charAt(0);

        if(a == b){
            return word1.concat(word2.substring(1));
        }
        return word1.concat(word2);
    }
}
package com.devxschool;

import java.util.ArrayList;
import java.util.List;

public class WordsFromString {
    /**
     *  Write a method that takes a string and returns a list of words from that string multiplied by the order of the words:
     *
     *  Ex input: "One Two Three"
     *  Output: ["One", "Two", "Two", "Three", "Three", "Three"]
     */

    public static void main(String[] args) {
        System.out.println(multiplyWords("One Two Three"));
    }

    public static List<String> multiplyWords(String input) {
        // TODO implement this method
        List<String> l = new ArrayList<>();
        String arr[] = input.split(" ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i + 1; j++){
                l.add(arr[i]);
            }
        }
        return l;


    }
}

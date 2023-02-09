package com.devxschool;

import java.util.*;

public class ConcordanceOfChars {

    /**Write a program which creates a concordance of characters occurring in a string
     * (i.e., which characters occur on which index in a string). Ignore spaces, but not special characters
     *
     * Ex input: Hello DevX
     * Output: {D=[6], e=[1, 7], v=[8], H=[0], X=[9], l=[2, 3], o=[4]}
     *
     * Ex input: three... two--
     * Output: {r=[2], t=[0, 9], e=[3, 4], w=[10], h=[1], -=[12, 13], .=[5, 6, 7], o=[11]}
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(showConcordance(sc.nextLine()));
    }


    public static Map<Character, Set<Integer>> showConcordance(String inputSentence) {
        // TODO implement this method
        Map<Character, Set<Integer>> showConcord = new HashMap<>();

        for(int i= 0; i < inputSentence.length(); i++  ){

            char c = inputSentence.charAt(i);

            if(c != ' '){
                if(showConcord.containsKey(c)){
                    Set<Integer> element = showConcord.get(c);
                    element.add(i);
                    showConcord.replace(c,element);

                }else {
                    Set<Integer> element1 = new HashSet<>();
                    element1.add(i);
                    showConcord.put(c,element1);
                }

            }
        }

        return showConcord;
    }
}
//public static Map<Character, Set<Integer>> showConcordance(String inputSentence) {
//        // TODO implement this method
//        Map<Character, Set<Integer>> concordance = new HashMap<Character, Set<Integer>>();
//
//        for (int i = 0; i < inputSentence.length(); i++) {
//            char charAt = inputSentence.charAt(i);
//            if (charAt == ' ') {
//                continue;
//            }
//            Set<Integer> set= concordance.get(charAt);
//            if (set == null) {
//                set= new HashSet<Integer>();
//            }
//            set.add(i);
//            concordance.put(charAt, set);
//        }
//
//        return concordance;
//    }
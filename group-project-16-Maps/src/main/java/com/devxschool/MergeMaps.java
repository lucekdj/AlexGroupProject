package com.devxschool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MergeMaps {

    public static void main(String[] args) {
        /**
         * Merge 2 maps into one so that you have all values from the first map
         */
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        map1.put(4, "Purple");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");

        MergeMaps mergeMaps = new MergeMaps();

        Map<Integer, String> mergedWithSecond = mergeMaps.merge(map1, map2);
        System.out.println(mergedWithSecond);
    }

    public Map<Integer, String> merge(Map<Integer, String> map1, Map<Integer, String> map2) {
        //TODO implement this method


        map2.putAll(map1);

        return map2;

    }
}

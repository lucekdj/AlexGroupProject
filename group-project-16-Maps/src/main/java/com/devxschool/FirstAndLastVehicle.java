package com.devxschool;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FirstAndLastVehicle {

    public static void main(String[] args) {
        /**
         * Create a map of cars, so they have orders
         * and print out first and last entry in the map
         * ex:
         * 5, "BMW"
         * 3, "Tesla"
         * 1, "Mercedes"
         * 4, "Audi"
         * 10, "Ford"
         *
         * print out:
         * 1, "Mercedes"
         * 10, "Ford"
         */

        FirstAndLastVehicle vehicle = new FirstAndLastVehicle();
        vehicle.print();

    }

    public void print() {
        //TODO implement this method
        Map<Integer, String> cars = new TreeMap<>();
        cars.put(5, "BMW");
        cars.put(3, "Tesla");
        cars.put(1, "Mercedes");
        cars.put(4, "Audi");
        cars.put(10, "Ford");


        Set<Map.Entry<Integer, String>> carsEntry = cars.entrySet();



        int first = 1;
        for(Map.Entry<Integer, String> car : carsEntry){
            if(first == 1){
                System.out.println(car);
            }
            if(first == carsEntry.size()){
                System.out.println(car);
            }
            first++;
        }

    }
}
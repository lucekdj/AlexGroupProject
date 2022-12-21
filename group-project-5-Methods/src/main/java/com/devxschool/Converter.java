package com.devxschool;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        /**
         *
         * Write a java program that calculates to metric system
         * if incorrect input print result as -1
         *
         * 1 lb = 0.45359237 kg
         * 1 oz = 28.34952 g
         *
         * 1 ft = 0.3048 m
         * 1 ft = 30.48 cm
         * 1 in = 2.54cm
         *
         * C = (F - 32) × 5/9
         *
         *
         * Example output:
         * Enter amount:
         * 1
         * Enter type:
         * in
         * To:
         * cm
         * Result: 2.54
         *
         */

        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        //TODO write your code here



        System.out.println("Enter amount?");
        double amount = scanner.nextDouble();
        System.out.println("Enter type?");
        String type = scanner.next();
        System.out.println("To");
        String to =scanner.next();
        double result =0;

        if(converter.isWeight(type) && converter.isWeight(to)){
            result = converter.calculateWeight(type, to, amount);
        }
        else if(converter.isLength(type) && converter.isLength(to)){
            result = converter.calculateLength(type, to, amount);
        }
        else if(converter.isTemperature(type) && converter.isTemperature(to)){
            result = converter.calculateTemperature(type, to, amount);
        }
        else{
            System.out.println("Check your parameters.");
        }

        converter.printResult(result);
    }


    public boolean isWeight(String type) {
        //TODO IMPLEMENT METHOD
        if (type.equals("lb") || type.equals("oz") || type.equals("kg") || type.equals("g")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLength(String type) {
        //TODO IMPLEMENT METHOD
        if (type.equals("ft") || type.equals("m") || type.equals("cm") || type.equals("in")) {
            return true;
        }
        return false;
    }

    public boolean isTemperature(String type) {
        //TODO IMPLEMENT METHOD
        if(type.equals("C") || type.equals("F")){

            return true;
        }
        return false;
    }

    public double calculateWeight(String type, String to, double amount) {
        //TODO IMPLEMENT METHOD
        if(isWeight(type) && isWeight(to)){
            switch(type){
                case "lb":
                    if (to.equals("kg")) {
                        return amount * 0.45359237;
                    }
                    else if(to.equals("g")){
                        return amount * 453.592;
                    }
                    else {
                        return -1;
                    }

                case "oz":
                    if(to.equals("g")){
                        return amount * 28.34952;
                    }
                    else if(to.equals("kg")){
                        return amount * 0.0283;
                    }
                    else{
                        return -1;
                    }
                case "kg":
                    if (to.equals("oz")) {
                        return amount * 35.274;
                    }
                    else if(to.equals("lb")){
                        return amount * 2.205;
                    }
                    else {
                        return -1;
                    }
                case "g":
                    if (to.equals("oz")) {
                        return amount / 28.35;
                    }
                    else if(to.equals("lb")){
                        return amount /453.6;
                    }
                    else {
                        return -1;
                    }


            }
        }

        return -1;
    }

    public double calculateLength(String type, String to, double amount) {
        //TODO IMPLEMENT METHOD
        if(isLength(type) && isLength(to)){
            switch(type){
                case "ft":
                    if (to.equals("m")) {
                        return amount * 0.3048;
                    }
                    else if(to.equals("cm")){
                        return amount * 30.48;
                    }
                    else {
                        return -1;
                    }
//
//                case "m":
//                    if(to.equals("cm")){
//                        return amount * 28.34952;
//                    }
//                    else if(to.equals("ft")){
//                        return amount * 0.0283;
//                    }
//                    else{
//                        return -1;
//                    }
//                case "cm":
//                    if (to.equals("in")) {
//                        return amount * 0.394;
//                    }
//                    else if(to.equals("m")){
//                        return amount * ;
//                    }
//                    else {
//                        return -1;
//                    }
                case "in":
                    if (to.equals("cm")) {
                        return amount * 2.54;
                    }
//                    else if(to.equals("ft")){
//                        return amount ;
//                    }
                    else {
                        return -1;
                    }


            }
        }
        return -1;
    }

    public double calculateTemperature(String type, String to, double amount) {
        // TODO IMPLEMENT METHOD
        if(isTemperature(type) && isTemperature(to)){
            switch(type){
                case "F":
                    if(to.equals("C")){
                        return amount *1.8 +32;
                    }
                case "C":
                    if(to.equals("F")){
                        return (amount -32) *(5/9);
                    }
            }
        }

        return -1;
    }

    public void printResult(double result) {

        // TODO IMPLEMENT METHOD
        System.out.println("Result " + result);
    }
}
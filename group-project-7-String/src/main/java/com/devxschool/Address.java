package com.devxschool;

public class Address {

    public static void main(String[] args) {

        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */

        String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        //TODO WRITE YOUR CODE HERE
        System.out.println(getStreetAddress(address));
        System.out.println(getCity(address));
        System.out.println(getState(address));
        System.out.println(getZipcode(address));
    }


    // TODO IMPLEMENT ALL METHODS
    public static String getStreetAddress(String address) {

         int a = address.indexOf(',');  // index of the ','


        return address.substring(0,a);
    }

    public static String getCity(String address) {

        int a =  address.indexOf(',') + 2 ;
        int b =  address.lastIndexOf(','); // last index of ' , '


        return address.substring( a , b );
    }

    public static String getState(String address) {

        int a = address.lastIndexOf(',')+2;
        int b = address.lastIndexOf(',')+4;

        return address.substring(a,b);



    }


    public static int getZipcode(String address) {

        int a = address.lastIndexOf(' ')+1;

        return Integer.parseInt(address.substring(a));
    }

}

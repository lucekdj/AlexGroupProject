package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class WeatherJeff {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        String weather;
        double temperature;
        String thingsToTake;
        //boolean sunglasses = false;
        //boolean umbrella = false;
        //boolean coat = false;
        System.out.println("Please enter whether the weather is rainy, snowy, or sunny: ");
        weather = sc.nextLine();
        System.out.println("Please enter temperature outside: ");
        temperature = Double.parseDouble(sc.nextLine());
        if ((temperature >= 50) && weather.equals("sunny")){
            thingsToTake = ("sunglasses");
            System.out.println("Please take some "+ thingsToTake);
        }else if(temperature >= 50 && weather.equals("snowy")) {
            thingsToTake = ("umbrella");
            System.out.println("Please take an "+ thingsToTake);
        }else if(temperature >= 50 && weather.equals("rainy")){
            thingsToTake = ("umbrella");
            System.out.println("Please take an "+ thingsToTake);
        }else if(temperature <= 50 && weather.equals("sunny")){
            thingsToTake = ("coat");
            System.out.println("Please take a "+ thingsToTake);
        } else {
            thingsToTake = ("umbrella and coat");
            System.out.println("Please take both an "+ thingsToTake);
        }



        Validation.testWeather(temperature, weather, thingsToTake);
    }
}
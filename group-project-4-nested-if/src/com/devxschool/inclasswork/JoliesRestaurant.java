package com.devxschool.inclasswork;
import java.util.Scanner;
public class JoliesRestaurant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfGuests = 0;
        double billAmount = 0;
        double taxFee = 0;
        boolean isSplit = false;
        String serviceQuality = "";
        double totalAmount = 0;
        double totalAmountPerGuest = 0;

        //TODO write your code here
        System.out.println("Welcome to Jolie's Restaurant!!!");
        System.out.println("Enter number of guests:");
        numberOfGuests = scanner.nextInt();
        System.out.println("Enter a restaurant bill amount:");
        billAmount = scanner.nextDouble();
        taxFee=(billAmount/10);
        System.out.println("Is your check split?");
        isSplit=scanner.nextBoolean();
        System.out.println("how was the restaurant's service?");
        serviceQuality= scanner.next();
        totalAmount=taxFee + billAmount;
        switch (serviceQuality){
            case "bad":
                totalAmount+=totalAmount*0.1;
                break;
            case "ok":
                totalAmount+=totalAmount*0.15;
                break;
            case "good":
                totalAmount+=totalAmount*0.20;
                break;
            case "perfect":
                totalAmount+=totalAmount*0.25;


        }
        System.out.println("Number of guests:"+numberOfGuests);
        System.out.println("Total amount: "+totalAmount);
        if(isSplit){
            totalAmountPerGuest=totalAmount/numberOfGuests;
            System.out.println("Total per guest: "+totalAmountPerGuest);

        }










    }
}

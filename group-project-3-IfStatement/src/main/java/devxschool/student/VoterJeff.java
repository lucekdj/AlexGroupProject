package main.java.devxschool.student;

import java.util.Scanner;

public class VoterJeff {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int age = 0;
        boolean isEligible; //= false;
        System.out.println("Please enter your age");
        age = sc.nextInt();
        isEligible = age >= 18;
        if(isEligible) {
            System.out.println("You are 18 or older");
        }else{
            System.out.println("You are not yet 18");
        }

        System.out.println("Therefore it is " + isEligible+ " "+"to say that you are eligible to vote.");


    }
}


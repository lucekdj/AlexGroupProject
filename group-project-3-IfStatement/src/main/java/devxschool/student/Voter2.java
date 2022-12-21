package main.java.devxschool.student;

import java.util.Scanner;

public class Voter2 {
    public static void main(String[] args) {

        boolean isEligible = false;
        int age =0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age");
         age = sc.nextInt();

         if (age>=18) {
             isEligible = true;
             System.out.println("You Are Eligible To Vote");
         }else{
             isEligible = false;
             System.out.println("You Are Not Eligible To Vote");
         }



    }
}

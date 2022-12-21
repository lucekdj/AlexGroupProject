package main.java.devxschool.student;
import java.util.Scanner;
public class VoterMariaO {
    public static void main(String[] args) {

        Scanner scanner;
//TODO implement your code here...
        scanner = new Scanner(System.in);
        int age = 0;
        boolean isEligible = false;


        System.out.println("Please enter your age:");
        age = scanner.nextInt();

        if (age >= 18) {
            isEligible = true;

        } else {
        }
        System.out.println("Eligible to vote: " + isEligible);

    }
}
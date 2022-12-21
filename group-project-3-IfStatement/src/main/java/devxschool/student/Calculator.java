package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String DIVIDE = "/";
    private static final String MULTIPLY = "*";

    public static void main(String[] args) {

        /**
         *
         * Write a calculator program
         * if there is an invalid operator return result as -1
         *
         * Example output:
         *  Enter your first number:
         *  1
         *   Enter your operator:
         *  /
         *  Enter your second number:
         *  0
         *  Your result is Infinity
         */

        // if operator is invalid -> if
        // if operator is "+"  result=(num1+num2)
        // if operator is "-"  result=(num1-num2)
        // if operator is "*"  result=(num1*num2)
        // if operator is "/"  result=(num1/num2)

        Scanner scanner = new Scanner(System.in);

        double number1 = 0;
        double number2 = 0;
        String operator = "";
        double result = 0;


        System.out.println("Please enter the first nr:");
        number1 = scanner.nextDouble();
        System.out.println("Please enter the operator:");
        operator = scanner.next(); // if you do scanner.nextline -automaticly jump to _enter second nr
        System.out.println("Please enter the second nr:");
        number2 = scanner.nextDouble();


        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            result = number1 / number2;
        } else {
            result = -1;
           // System.out.println(" the result is: " + result); it has to be outside code2
        }
        System.out.println(" the result is: " + result);
    }

    //TODO implement your code here...


}


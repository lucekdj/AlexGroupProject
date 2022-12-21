package com.devxschool;

import java.util.Scanner;

public class Hakeem {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //TODO WRITE YOUR CODE HERE
        for (String items: createList(scanner)){
            System.out.print(items + ",");
            {

            }

        }
    }

    public static String[] createList(Scanner scanner) {
        // TODO IMPLEMENT THIS METHOD
        System.out.println("How many items do you want to add?");
        int itemSize = scanner.nextInt();

        String items []= new String [itemSize];
        scanner.nextLine();   int index= 1;
        for (int i = 0; i < itemSize; i++) {
            System.out.println("item #"+ index);
            index++;
            items[i]= scanner.nextLine();

        }
        return items;
    }
}



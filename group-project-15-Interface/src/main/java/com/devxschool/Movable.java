package com.devxschool;

public interface Movable {

    String message = "This animal can move";

    void move();

    default String getMessage(){
        return message;
    }

    static void printMessage(){
        System.out.println(message + " - Hi, I am a movable and this is a STATIC method");
    }

}

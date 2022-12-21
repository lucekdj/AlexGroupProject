package com.devxschool;

// TODO CONFIGURE THE CLASS
public class Cat implements Movable, Soundable{

    public static final String message = "This message is from Cat";

    @Override
    public void move() {
        System.out.println("Cat can run 30 mph");
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    static void printMessage(){
        System.out.println("Hi, I am a Cat and this is a STATIC method\"");
    }
}

package com.devxschool;

// TODO CONFIGURE THE CLASS
public class Dog implements Movable, Soundable {

    @Override
    public void move() {
        System.out.println("Dogs can run from 15 mph and greyhound can reach is 45 mph");
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }

}

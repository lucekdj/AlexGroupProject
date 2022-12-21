package com.devxschool;

// TODO SETUP THE CLASS
public class Horse extends AnimalData {
    public void printSpeedAndGroup(double avgSpeed){
        if(avgSpeed > 60){
            System.out.println("Super fast");
        } else if ( avgSpeed > 40 ) {
            System.out.println("Fast");
        } else if (avgSpeed > 20 ) {
            System.out.println("Midium");
        }else{
            System.out.println("Slow");
        }
        this.setMoveType("Run")
    }

}

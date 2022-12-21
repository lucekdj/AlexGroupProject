package com.devxschool;

import java.util.Random;

// TODO SETUP THIS CLASS
public class UIConfig extends TestBase {

    Random ran = new Random();
    private int testId = ran.nextInt(100);
    private String configurations = "UI Test Configurations";

    @Override

    public void initializeTestConfigurations(){

        System.out.println(configurations);
        System.out.println("Here I would add some cool UI configurations for browser");
    }

    @Override

    public int hashCode(){

        return testId;

    }
    @Override

    public String toString(){
        return  "\napp name: " + getAppName()+
                "\ntest id: " + testId + "Here I would add some cool UI configurations for browser"+
                "\nconfig: " +  configurations;


    }
    public int getTestId(){
        return this.testId;
    }

}
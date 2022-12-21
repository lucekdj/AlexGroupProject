package com.devxschool;

// TODO SETUP THIS CLASS
public class TestBase {

    private String appName = "DevXSchool Application Test Base";


    public String configurations = "Base Test Configurations" ;

    protected int testId = 100;

    public String getAppName(){
             return appName;

    }

    public void initializeTestConfigurations() {

        System.out.println(configurations);

    }

    public int hashCode(){

        return testId;

    }
    public int getTestId(){

        return this.testId;
    }



}

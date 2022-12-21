package com.devxschool;

import javax.xml.transform.sax.SAXResult;

// TODO SETUP THIS CLASS
public class BackendConfig extends TestBase {

    String configurations = "Backend Test Configurations";

    @Override

    public void initializeTestConfigurations(){
        System.out.println(configurations);
        System.out.println("Here I would add some backend configurations for database and other connections");
    }
    @Override
    public int hashCode(){
        return testId;

    }

    @Override
    public String toString() {
        return  "\napp name" + getAppName()+
                "\ntest id: " + testId +
                "\nconfig: " + configurations;
    }


}


package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.DriverUtilities;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        //Here we are initializing the properties object inside of the ConfigReader class we created
        ConfigReader.initializeProperties();
        DriverUtilities.createDriver(scenario);
    }
    @After
    public void tearDown(Scenario scenario){
        DriverUtilities.quitDriver(scenario);
    }
}

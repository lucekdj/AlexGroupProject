package exercises;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

import java.time.Duration;

public class Menus {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        menusOne();
        menusTwo();
        menusThree();
        menusFour();
        menusFive();
    }

    public static void driverSetup(String browser, String URL) {
        DriverUtils.createDriver(browser);
        driver = DriverUtils.getDriver();
        driver.get(URL);
    }

    //TODO implement all methods
    public static void menusOne() throws InterruptedException {

    }

    public static void menusTwo() throws InterruptedException {

    }

    public static void menusThree() throws InterruptedException {

    }

    public static void menusFour() {

    }

    public static void menusFive() throws InterruptedException {

    }
}

package pages;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverUtilities;

import java.time.Duration;

public class NewSavingAccountPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Create Savings')]")
    WebElement createSavings;
    @FindBy(id = "Savings")
    WebElement savingsBtn;

    @FindBy(id = "Individual")
    WebElement individualBtn;

    @FindBy(id = "name")
    WebElement accountNameBtn;

    @FindBy(id = "openingBalance")
    WebElement openingBalance;

    @FindBy(id = "newSavingsSubmit")
    WebElement newSavingsSubmit;
    String expectedBalance = "100.00";


    public void verifyUserIsOnNewSavingsAccountPage() {
        Assert.assertTrue("user is not on a New Savings Account page", createSavings.isDisplayed());
    }

    public void entersValidInformationOnNewSavingsAccountPage() {
        savingsBtn.click();
        individualBtn.click();
        accountNameBtn.sendKeys("John Johnson");
        openingBalance.sendKeys(expectedBalance);

    }
    public void clickSubmitButton(){
        newSavingsSubmit.click();
    }

}

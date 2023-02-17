package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy (xpath = "//li[@class='active']")
    WebElement welcomeMessage;

    @FindBy(id = "checking-menu")
    WebElement checkingMenu;
    @FindBy(id = "new-checking-menu-item")
    WebElement newChecking;

    @FindBy(id="savings-menu")
    WebElement savingsMenu;

    @FindBy(id = "new-savings-menu-item")
    WebElement newSavings;

    public void verifyPage(){
        Assert.assertTrue("Welcome message not visible, could be in wrong page", welcomeMessage.isDisplayed());
    }

    public void clickCheckingMenu(){
        checkingMenu.click();
    }

    public void verifyNewCheckingButton(){
        Assert.assertTrue("New checking button is not displayed",newChecking.isDisplayed());
    }

    public void clickNewCheckingButton(){
        newChecking.click();
    }

    public void clickSavingsMenu(){
        savingsMenu.click();
    }

    public void clickNewSavingsButton(){
        newSavings.click();
    }


    public boolean isSavingsButtonDisplayed() {
       return newSavings.isDisplayed();

    }
}

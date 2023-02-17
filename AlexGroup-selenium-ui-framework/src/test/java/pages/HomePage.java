package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{



    @FindBy(xpath = "//li[@class='active']")
            WebElement welcomeMessage;

    @FindBy(id="savings-menu")
    WebElement savingsMenu;

    @FindBy(id = "new-savings-menu-item")
    WebElement newSavings;

    public void verifyPage(){
        Assert.assertTrue("Welcome test message not visible could be on wrong page",
                welcomeMessage.isDisplayed());
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

package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{



    @FindBy(xpath = "//li[@class='active']")
            WebElement welcomeTestMessage;

    @FindBy(id = "savings-menu")
    WebElement savingMenu;

    @FindBy(id = "new-savings-menu-item")
    WebElement newSavingMenu;

    public void verifyHomePage(){
        Assert.assertTrue("Welcome test message not visible could be on wrong page",
                welcomeTestMessage.isDisplayed());
    }
    public void clickOnSavingsButton() throws InterruptedException {
        savingMenu.click();
        Thread.sleep(3000);
    }

    public void clickOnNewSavings() throws InterruptedException {
        newSavingMenu.click();
        Thread.sleep(3000);
    }

}

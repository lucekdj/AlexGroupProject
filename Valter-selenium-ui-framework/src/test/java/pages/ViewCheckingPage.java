package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingPage extends BasePage{

    @FindBy(xpath = "//*[@id='new-account-msg']")
    WebElement successfulMessage;

    public void verifySuccessfulMessage(){
        Assert.assertTrue("Successful message not displayed",successfulMessage.isDisplayed());
    }
}

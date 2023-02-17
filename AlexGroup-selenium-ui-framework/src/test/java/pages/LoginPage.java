package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage{

    @FindBy (id="username")
    WebElement usernameInput;

    @FindBy (id="password")
    WebElement passwordInput;

    @FindBy (id="submit")
    WebElement submitBtn;

    @FindBy (xpath = "//a[@href='/bank/signup']")
    WebElement signUpBtn;

    @FindBy(xpath = "//*[contains(text(), 'Registration')]")
    WebElement registrationSuccessful;

    public void enterValidLoginInfo(String username, String password) {

        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
    }


    public void clickSignInBtn(){
         submitBtn.click();
    }

    public void clickSignUpBtn(){
        signUpBtn.click();
    }

    public void verifyRegistrationIsSuccessful() throws InterruptedException {
        Assert.assertTrue("Successful message is not displayed", registrationSuccessful.isDisplayed());
        Thread.sleep(3000);
    }


}

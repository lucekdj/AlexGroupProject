package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void enterValidLoginInfo(){

        usernameInput.sendKeys("devx123@gmail.com");
        passwordInput.sendKeys("Devx123!");
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

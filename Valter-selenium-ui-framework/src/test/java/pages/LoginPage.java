package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage{
    //takes in a type of locator and the actual locator String itself in order to find and initialize
    //that element to the WebElement variable we created below it
    @FindBy (id = "username")
    WebElement usernameInput;

    @FindBy (id = "password")
    WebElement passwordInput;

    @FindBy (id = "submit")
    WebElement submitBtn;

    @FindBy (xpath = "//a[@href='/bank/signup']")
    WebElement signUpBtn;

    public void enterValidLoginInfo(){

        usernameInput.sendKeys("usernametesting@gmail.com");
        passwordInput.sendKeys("Password.2023");

    }
    public void enterValidLoginInfo(String username, String password){

        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));

    }

    public void clickSignInBtn(){

        submitBtn.click();
    }

    public void clickSignUpBtn(){
        signUpBtn.click();
    }
}

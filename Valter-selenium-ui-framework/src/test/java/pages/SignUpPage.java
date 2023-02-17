package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


public class SignUpPage extends BasePage{

    @FindBy (id = "title")
    WebElement pleaseSelect;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(xpath="//input[@id='gender' and @value='M']")
    WebElement gender;

    @FindBy(xpath="//*[@id='dob']")
    WebElement dateOfBirth;

    @FindBy(xpath="//*[@id='ssn']")
    WebElement ssn;

    @FindBy(xpath="//*[@id='emailAddress']")
    WebElement emailAddress;

    @FindBy(xpath="//*[@id='password']")
    WebElement password;

    @FindBy(xpath="//*[@id='confirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath="//*[contains(text(), 'Next')]")
    WebElement clickNext;

    @FindBy(xpath="//*[@id='address']")
    WebElement streetAddress;

    @FindBy(xpath="//*[@id='locality']")
    WebElement locality;

    @FindBy(xpath="//*[@id='region']")
    WebElement region;

    @FindBy(xpath="//*[@id='postalCode']")
    WebElement postalCode;

    @FindBy(xpath="//*[@id='country']")
    WebElement country;

    @FindBy(xpath="//*[@id='homePhone']")
    WebElement homePhone;

    @FindBy(xpath="//*[@id='mobilePhone']")
    WebElement mobilePhone;

    @FindBy(xpath="//*[@id='workPhone']")
    WebElement workPhone;

    @FindBy(xpath="//*[@id='agree-terms']")
    WebElement agreeAndPolicy;

    @FindBy(xpath="//*[contains(text(), 'Register')]")
    WebElement registerBtn;

    @FindBy(xpath = "//span[contains(text(),'Registration Successful. Please Login.')]")
    WebElement successfulMessage;

    public void verifyUserIsOnFirstSignUpPage(){
        Assert.assertTrue("User is not on the first Sign Up page", pleaseSelect.isDisplayed());

    }
    public static int generate9DigitRandomNumber() {
        Random random = new Random();
        return 100000000 + random.nextInt(900000000);
    }


    public void enteringInformationOnFirstPage() throws InterruptedException {





        Select title = new Select(pleaseSelect);
        title.selectByVisibleText("Mr.");

        firstName.sendKeys("Michael");
        lastName.sendKeys("Scott");
        gender.click();
        dateOfBirth.sendKeys("05/15/1975");
        ssn.sendKeys(faker.idNumber().ssnValid());

        emailAddress.sendKeys(faker.internet().emailAddress());
        password.sendKeys("Dunder.mifflin2023");
        confirmPassword.sendKeys("Dunder.mifflin2023");
        Thread.sleep(15000);


    }
    public void clickNextBtn(){
        clickNext.click();

    }

    public void verifyUserIsOnSecondPage(){


        Assert.assertTrue("User is not on Second Page", streetAddress.isDisplayed());
    }

    public void userEntersInfoOnSecondPage(){
        streetAddress.sendKeys("123 Devx Street");
        locality.sendKeys("Scranton");
        region.sendKeys("Pennsylvania");
        postalCode.sendKeys("45447");
        country.sendKeys("US");
        homePhone.sendKeys("123-132-3210");
        mobilePhone.sendKeys("456-444-8870");
        workPhone.sendKeys("987-852-3650");
        agreeAndPolicy.click();
    }

    public void clicksOnRegisterBtn(){
        registerBtn.click();
    }

    public void verifyUserIsOnTheLoginPageWithRegistrationSuccessfulMessageShown(){
             Assert.assertTrue("Welcome Successful Message not displayed",successfulMessage.isDisplayed());

    }


}

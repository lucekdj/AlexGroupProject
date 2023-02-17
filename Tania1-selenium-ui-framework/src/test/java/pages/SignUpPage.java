package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class SignUpPage extends BasePage {

    @FindBy(id = "title")
    WebElement titleSelect;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='gender' and @value='F']")
    WebElement gender;

    @FindBy(xpath = "//*[@id='dob']")
    WebElement dateOfBirth;

    @FindBy(xpath = "//*[@id='ssn']")
    WebElement ssn;

    @FindBy(xpath = "//*[@id='emailAddress']")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id='confirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//*[contains(text(), 'Next')]")
    WebElement clickNext;

    @FindBy(xpath = "//*[@id='address']")
    WebElement streetAddress;

    @FindBy(xpath = "//*[@id='locality']")
    WebElement locality;

    @FindBy(xpath = "//*[@id='region']")
    WebElement region;

    @FindBy(xpath = "//*[@id='postalCode']")
    WebElement postalCode;

    @FindBy(xpath = "//*[@id='country']")
    WebElement country;

    @FindBy(xpath = "//*[@id='homePhone']")
    WebElement homePhone;

    @FindBy(xpath = "//*[@id='mobilePhone']")
    WebElement mobilePhone;

    @FindBy(xpath = "//*[@id='workPhone']")
    WebElement workPhone;

    @FindBy(xpath = "//*[@id='agree-terms']")
    WebElement agreeAndPolicy;

    @FindBy(xpath = "//*[contains(text(), 'Register')]")
    WebElement registerBtn;



    public void verifyUserIsOnFirstSignUpPage() {
        Assert.assertTrue("User isn't on a first Sign Up page", titleSelect.isDisplayed());
    }
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    public static int generate9DigitRandomNumber() {
        Random random = new Random();
        return 100000000 + random.nextInt(900000000);
    }


    public void entersValidInformationOnPageOne(String title) throws InterruptedException {
        int SSN = generate9DigitRandomNumber();

        Select select = new Select(titleSelect);
        select.selectByVisibleText(title);

        firstName.sendKeys("Ali");
        lastName.sendKeys("Smith");
        gender.click();
        dateOfBirth.sendKeys("12/12/1990");
        ssn.sendKeys(String.valueOf(SSN));
        emailAddress.sendKeys(getSaltString()+"@gmail.com");
        password.sendKeys("123458Ww");
        confirmPassword.sendKeys("123458Ww");
        Thread.sleep(3000);

    }

    public void clickOnNextButton() {
        clickNext.click();
    }

    public void verifyUserIsOnSecondPage() {
        Assert.assertTrue("second page is not displayed", streetAddress.isDisplayed());
    }

    public void entersValidInformationOnSecondPage(){
        streetAddress.sendKeys("101 Washington St.");
        locality.sendKeys("Chicago");
        region.sendKeys("Illinois");
        postalCode.sendKeys("99889");
        country.sendKeys("US");
        homePhone.sendKeys("1233421234");
        mobilePhone.sendKeys("321-000-0000");
        agreeAndPolicy.click();
    }

    public void clicksRegisterButton(){
        registerBtn.click();
    }



}

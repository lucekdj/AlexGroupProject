package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsPage extends BasePage {



    @FindBy(xpath = "//h1[contains(text(), 'Savings')]")
    WebElement cartTitle;

    @FindBy(xpath = "//input[@id='Standard Checking']")
    WebElement savingsBtn;

    @FindBy(xpath = "//input[@id='Individual']")
    WebElement individualSavingsBtn;

    @FindBy(xpath = "//input[@id='name']")
    WebElement accountSavingsName;

    @FindBy(xpath = "//input[@id='openingBalance']")
    WebElement openingBalance;

    @FindBy(id = "newSavingsSubmit")
    WebElement submitBtn;


    @FindBy(xpath = "//h1[text()='View Savings Accounts']")
    WebElement viewSavAccTitle;



    String expectedDeposit;
    public void setActualDeposit(String deposit) {
        this.expectedDeposit = deposit;


    }
    public String getExpectedDeposit()  {
        return expectedDeposit;
    }





    public boolean isSavingsPageDisplayed() {
        return cartTitle.isDisplayed();
    }


    public void selectAccountType(String account) {
        String type;
        type = account;
        String accountType = String.format("//input[@id='%s']", type);

        WebElement accountElement = driver.findElement(By.xpath(accountType));
        accountElement.click();

    }

    public void selectInitialDeposit(String deposit) {

        String initDeposit;
        initDeposit = deposit;
        String initialDeposit = String.format("//input[@id='%s']", initDeposit);


        WebElement initDeposit1 = driver.findElement(By.xpath(initialDeposit));
        initDeposit1.click();
    }


    public void enterNameAndDeposit() {


    }

    public void clickOnSubmitBtn() {
        submitBtn.click();
    }

    public boolean verifyNewSavingIsVisible() {
        return viewSavAccTitle.isDisplayed();

    }


}
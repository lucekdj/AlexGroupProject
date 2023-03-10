package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsPage extends BasePage{

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






    public boolean isSavingsPageDisplayed() {
        return cartTitle.isDisplayed();
    }

    public void  selectAccountType(String account){
        String type;
        type = account;

        String accountType = String.format("//input[@id='%s']",type);
        WebElement accountElement = driver.findElement(By.xpath(accountType));
        accountElement.click();
    }

    public void setInitialDeposit(String deposit){

        String initdeposit;
        initdeposit = deposit;
        //this.initdeposit = deposit ----- _this._is from class to the method(but we moved to the method so is //

        String initialDeposit = String.format("//input[@id='%s']",initdeposit);
        WebElement initDeposit1 = driver.findElement(By.xpath(initialDeposit));
        initDeposit1.click();
    }



}

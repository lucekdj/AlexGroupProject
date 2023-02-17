package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCheckingPage extends BasePage{


    @FindBy(xpath = "//h1[contains(text(), 'Checking')]")
    WebElement cartTitle;

    @FindBy(xpath = "//input[@id='Standard Checking']")
    WebElement standardCheckingBtn;

    @FindBy(xpath = "//input[@id='Individual']")
    WebElement individualBtn;

    @FindBy(xpath = "//input[@id='name']")
    WebElement accountName;

    @FindBy(xpath = "//input[@id='openingBalance']")
    WebElement openingBalance;

    @FindBy(xpath = "//button[@id='newCheckingSubmit']")
    WebElement newCheckingSubmitBtn;


    public void verifyCreateNewCheckingPage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("Create new checking page is not displayed", cartTitle.isDisplayed());
    }

    public void enteringValidInformation(){
        standardCheckingBtn.click();
        individualBtn.click();
        accountName.sendKeys("kristo123");
        openingBalance.sendKeys("150.00");


    }
    public void clickSubmitBtn(){
        newCheckingSubmitBtn.click();
    }

}

package pages;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewSavingsAccountsPage extends BasePage {
    @FindBy(id = "new-account-msg")
    WebElement newAccountMessage;
    @FindBy(xpath = "//div[@class='h4 m-0'][1]")
    List<WebElement> listOfNames;
    @FindBy(xpath = "//div[@class='col-md-6 col-lg-3']//div[3]")
    List<WebElement> ownerShip;
    @FindBy(xpath = "//div[@class='col-md-6 col-lg-3']//div[7]")
    List<WebElement> listOfBalances;
    public void verifyUserIsOnViewSavingsAccountsPage() {
        Assert.assertTrue("New Saving account was not created", newAccountMessage.isDisplayed());
    }
    public void makeSureBalanceIsCorrect() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1300).build().perform();
        Assert.assertTrue("Name is incorrect", listOfNames.get(listOfNames.size()-1).
                getText().contains("John Johnson"));
        Assert.assertTrue("Ownership is incorrect", ownerShip.get(ownerShip.size() - 1).
                getText().contains("Individual"));
        Assert.assertTrue("Balance is not correct", listOfBalances.get(listOfBalances.size() - 1).
                getText().contains("100.00"));
        Thread.sleep(3000);
    }
}

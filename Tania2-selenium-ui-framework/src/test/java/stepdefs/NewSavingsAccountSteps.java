package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.NewSavingAccountPage;
import pages.ViewSavingsAccountsPage;
import utilities.DriverUtilities;

import java.time.Duration;

public class NewSavingsAccountSteps {


    @Given("user is on a Home page")
    public void user_is_on_a_home_page() {
        HomePage homePage = new HomePage();
        homePage.verifyHomePage();
          
    }

    @Given("click on Savings button")
    public void click_on_savings_button() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnSavingsButton();
    }

    @Then("click on New Savings")
    public void click_on_new_savings() throws InterruptedException {
         HomePage homePage = new HomePage();
         homePage.clickOnNewSavings();
    }

    @Then("verify user is on New Savings Account page")
    public void verify_user_is_on_new_savings_account_page() {
        NewSavingAccountPage newSavingAccountPage = new NewSavingAccountPage();
        newSavingAccountPage.verifyUserIsOnNewSavingsAccountPage();
    }

    @When("user enters valid information on New Savings Account page")
    public void user_enters_valid_information_on_new_savings_account_page() {
        NewSavingAccountPage newSavingAccountPage = new NewSavingAccountPage();
        newSavingAccountPage.entersValidInformationOnNewSavingsAccountPage();

    }

    @When("click Submit button")
    public void click_submit_button() {
        NewSavingAccountPage newSavingAccountPage = new NewSavingAccountPage();
        newSavingAccountPage.clickSubmitButton();

    }


}

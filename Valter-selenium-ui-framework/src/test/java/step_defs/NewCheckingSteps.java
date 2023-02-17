package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.NewCheckingPage;
import pages.ViewCheckingPage;

public class NewCheckingSteps {

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        NewCheckingPage newCheckingPage = new NewCheckingPage();
        ViewCheckingPage viewCheckingPage = new ViewCheckingPage();
    
        @Given("user is logged in")
        public void user_is_logged_in() {
            loginPage.enterValidLoginInfo();
            loginPage.clickSignInBtn();
        }

        @Given("user is on the homepage")
        public void user_is_on_the_homepage() {
            homePage.verifyPage();
        }

        @When("user clicks on checking menu")
        public void user_clicks_on_checking_menu() {
            homePage.clickCheckingMenu();
        }

        @Then("verify new checking button is displayed")
        public void verify_new_checking_button_is_displayed() {
            homePage.verifyNewCheckingButton();
        }

        @When("user clicks on new checking button")
        public void user_clicks_on_new_checking_button() {
            homePage.clickNewCheckingButton();
        }

        @Then("verify user is on Create Checking page")
        public void verify_user_is_on_create_checking_page() throws InterruptedException {
                newCheckingPage.verifyCreateNewCheckingPage();
        }

        @When("user enters the valid information")
        public void user_enters_the_valid_information() {
            newCheckingPage.enteringValidInformation();
        }

        @When("user clicks on submit button")
        public void user_clicks_on_submit_button() {
            newCheckingPage.clickSubmitBtn();
        }

        @Then("verify Successfully Created message is displayed")
        public void verify_successfully_created_message_is_displayed() {
            viewCheckingPage.verifySuccessfulMessage();
        }

}

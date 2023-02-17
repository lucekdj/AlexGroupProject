package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.NewSavingsPage;

public class NewSavingsSteps{


    @When("user clicks on savings menu")
    public void user_clicks_on_savings_menu() {
        HomePage homePage = new HomePage();
        homePage.clickSavingsMenu();
    }

    @Then("verify new savings button is displayed")
    public void verify_new_savings_button_is_displayed() {
        HomePage homePage = new HomePage();

        Assert.assertTrue("New savings button is not displayed",homePage.isSavingsButtonDisplayed());
    }

    @When("user clicks on new savings button")
    public void user_clicks_on_new_savings_button() {
        HomePage homePage = new HomePage();
        homePage.clickNewSavingsButton();
    }

    @Then("verify user is on Create Savings page")
    public void verify_user_is_on_create_savings_page() {
        NewSavingsPage newSavingsPage = new NewSavingsPage();
        Assert.assertTrue("user is not on Create Savings page",newSavingsPage.isSavingsPageDisplayed());
    }
    @When("user selects Savings Account Type {string}")
    public void user_selects_savings_account_type(String string) {
        NewSavingsPage newSavingsPage = new NewSavingsPage();
        newSavingsPage.selectAccountType(string);
    }

    @When("user selects the account ownership {string}")
    public void user_selects_the_account_ownership(String string) {
        NewSavingsPage newSavingsPage = new NewSavingsPage();
        newSavingsPage.selectInitialDeposit(string);
    }


    @When("user enters the account name {string} and the initial deposit {string}")
    public void user_enters_the_account_name_testAccount_and_the_initial_deposit_3000() {

    }

    @When("user clicks on submit button to create the savings account")
    public void user_clicks_on_submit_button_to_create_the_savings_account() {
        
    }

    @Then("verify Successfully Created message for the savings account is displayed")
    public void verify_successfully_created_message_for_the_savings_account_is_displayed() {
        
    }

    @Then("verify that the amount displayed is the same as the amount entered by the user")
    public void verify_that_the_amount_displayed_is_the_same_as_the_amount_entered_by_the_user() {
        
    }

}

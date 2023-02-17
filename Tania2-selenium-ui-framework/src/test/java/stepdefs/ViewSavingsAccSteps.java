package stepdefs;

import io.cucumber.java.en.Then;
import pages.ViewSavingsAccountsPage;

public class ViewSavingsAccSteps {

    @Then("verify user is on a View Savings Accounts page")
    public void verify_user_is_on_a_view_savings_accounts_page()  {
        ViewSavingsAccountsPage viewSavingsAccountsPage = new ViewSavingsAccountsPage();
        viewSavingsAccountsPage.verifyUserIsOnViewSavingsAccountsPage();
    }

    @Then("make sure balance is correct")
    public void make_sure_balance_is_correct() throws InterruptedException{
        ViewSavingsAccountsPage viewSavingsAccountsPage = new ViewSavingsAccountsPage();
        viewSavingsAccountsPage.makeSureBalanceIsCorrect();


    }
}

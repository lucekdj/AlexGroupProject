package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        loginPage.enterValidLoginInfo(username, password);
    }

    @When("user click on Sing In button")
    public void user_click_on_sing_in_button() {
        loginPage.clickSignInBtn();

    }

    @Then("verify user id successfully logged in to the account")
    public void verify_user_id_successfully_logged_in_to_the_account() {
        homePage.verifyHomePage();
    }

    @Given("user click on Sign Up button")
    public void user_click_on_sign_up_button() {
        loginPage.clickSignUpBtn();
    }

    @Then("verify user is back to a login page and successful message is displayed")
    public void verify_user_is_back_to_a_login_page_and_successful_message_is_displayed() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.verifyRegistrationIsSuccessful();
        Thread.sleep(5000);
    }
    //#################################### Homework ##################################################

    @Given("user enters invalid {string} and {string}")
    public void user_enters_invalid_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.enterInvalidLoginInfo(username, password);

    }

    @When("user click on Sing In button after he put invalid credential")
    public void userClickOnSingInButtonAfterHeShePutInvalidCredential() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickSignInBtnWithInvalidInfo();
    }

    @Then("verify user id unsuccessfully logged in to the account")
    public void verify_user_id_unsuccessfully_logged_in_to_the_account() {
        LoginPage loginPage = new LoginPage();
        loginPage.verifyUserUNSuccessfullyLogin();
    }
}



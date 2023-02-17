package step_defs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpSteps {
    SignUpPage signUpPage = new SignUpPage();
    LoginPage loginPage = new LoginPage();




    @Given("user clicks on Sign Up button")
    public void user_clicks_on_sign_up_button() {
        loginPage.clickSignUpBtn();
        
    }
    @Then("user is on the first Sign Up page")
    public void user_is_on_the_first_sign_up_page() {
        signUpPage.verifyUserIsOnFirstSignUpPage();

    }
    @When("user enters information")
    public void user_enters_information() throws InterruptedException {
        signUpPage.enteringInformationOnFirstPage();

    }
    @When("user clicks on Next button")
    public void user_clicks_on_next_button() {
        signUpPage.clickNextBtn();

    }
    @Then("verify user is on second Sign Up page")
    public void verify_user_is_on_second_sign_up_page() {
        signUpPage.verifyUserIsOnSecondPage();

    }
    @When("user enters additional information")
    public void user_enters_additional_information() {
        signUpPage.userEntersInfoOnSecondPage();

    }
    @When("user clicks Register button")
    public void user_clicks_register_button() {
        signUpPage.clicksOnRegisterBtn();

    }
    @Then("verify user is back on login page")
    public void verify_user_is_back_on_login_page() {
        signUpPage.verifyUserIsOnTheLoginPageWithRegistrationSuccessfulMessageShown();

    }


}
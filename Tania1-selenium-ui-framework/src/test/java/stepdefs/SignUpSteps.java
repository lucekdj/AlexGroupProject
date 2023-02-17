package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpSteps {



    @Then("verify user is on first Sign Up page")
    public void verify_user_is_on_first_sign_up_page() {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.verifyUserIsOnFirstSignUpPage();
    }

    @When("user enters valid information for gender {string}")
    public void user_enters_valid_information_for_gender(String title) throws InterruptedException{
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.entersValidInformationOnPageOne(title);


    }

    @When("user click on Next button")
    public void user_click_on_next_button() {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.clickOnNextButton();
    }

    @Then("verify user is on a second page")
    public void verify_user_is_on_a_second_page() {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.verifyUserIsOnSecondPage();
    }

    @When("user enters valid information on a second page")
    public void user_enters_valid_information_on_a_second_page() {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.entersValidInformationOnSecondPage();
    }

    @When("user clicks Register button")
    public void user_clicks_register_button() {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.clicksRegisterButton();
    }


}

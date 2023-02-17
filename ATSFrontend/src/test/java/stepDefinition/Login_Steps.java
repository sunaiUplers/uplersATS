package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;


public class Login_Steps {
    @Given("^I want to go on Uplers$")
    public void i_want_to_go_on_Uplers() throws Throwable {
        LoginPage.launchUrl();
    }

    @When("^I verify the Email id and Password are displayed$")
    public void i_verify_the_Email_id_and_Password_are_displayed() throws Throwable {
        LoginPage.emailFieldIsDisplayed();
        LoginPage.PasswordIsDisplayed();
    }

    @When("^I enter the Email id and Password$")
    public void i_enter_the_Email_id_and_Password() throws Throwable {
        LoginPage.EnterEmailId();
        LoginPage.EnterPassword();
    }
    @Then("^I click on Login Button$")
    public void i_click_on_Login_Button() throws Throwable {
        LoginPage.LoginButton();
        Thread.sleep(5000);
    }



}

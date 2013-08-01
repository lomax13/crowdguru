package org.crowdguru.acceptance.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.crowdguru.acceptance.pages.HomePage;
import org.crowdguru.acceptance.pages.LoginPage;
import org.crowdguru.acceptance.pages.RegistrationPage;

public class RegistrationTests {
    private HomePage homePage = HomePage.getInstance();
    private LoginPage loginPage = LoginPage.getInstance();
    private RegistrationPage regPage = RegistrationPage.getInstance();


    @Given("^I access the crowdguru home page$")
    public void I_access_the_crowdguru_home_page() throws Throwable {
       homePage.load();

    }

    @And("^I navigate to login/register page through Sign in/register button$")
    public void I_navigate_to_login_register_page_through_Sign_in_register_button() throws Throwable {
       homePage.signInOrRegisterButton().click();
    }

    @And("^I navigate to registration page by clicking on register button$")
    public void I_navigate_to_registration_page_by_clicking_on_register_button() throws Throwable {
       loginPage.registerButton().click();

    }

    @And("^I give email as \"([^\"]*)\"$")
    public void I_give_email_as(String emailID) throws Throwable {

        regPage.emailInputField().sendKeys(emailID);

    }

    @Given("^I give password as \"([^\"]*)\"$")
    public void I_give_password_as_password_(String password) throws Throwable {
        regPage.passwordInputField().sendKeys(password);
    }

    @When("^I save the details of registration for later$")
    public void I_save_the_details_of_registration_for_later() throws Throwable {
        regPage.saveDetailsAndContinueRegLaterButton().click();
    }

    @Then("^I should see the user$")
    public void I_should_see_the_user() throws Throwable {
        System.out.println("Test this works");
    }


}

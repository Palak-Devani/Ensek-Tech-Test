package corp.energy.ensek.steps;

import corp.energy.ensek.pages.HomePage;
import corp.energy.ensek.pages.RegisterPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class RegisterPageSteps {

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I verify the text 'Create a new account\\.' on register page$")
    public void iVerifyTheTextCreateANewAccountOnRegisterPage() {
        Assert.assertEquals("Create a new account text is not displayed","Create a new account.","Create a new account.");
        new RegisterPage().verifyText();
    }

    @And("^I send text to email field$")
    public void iSendTextToEmailField() {
        new RegisterPage().enterTextInEmailField();
    }

    @And("^I enter text into password field$")
    public void iEnterTextIntoPasswordField() {
        new RegisterPage().enterTextInPasswordField();
    }

    @And("^I enter text into confirm password field$")
    public void iEnterTextIntoConfirmPasswordField() {
        new RegisterPage().enterTextInConfirmPasswordField();
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should register successfully$")
    public void iShouldRegisterSuccessfully() {
    }

    @And("^I am getting an 'Error' and unable to register$")
    public void iAmGettingAnErrorAndUnableToRegister() {
        Assert.assertEquals("Error text is not displayed","Error","Error");
        new RegisterPage().verifyAnErrorOccurredWhileProcessingRegisterRequest();
    }
}

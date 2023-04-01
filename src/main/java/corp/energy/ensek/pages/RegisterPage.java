package corp.energy.ensek.pages;

import corp.energy.ensek.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static corp.energy.ensek.browserfactory.ManageBrowser.driver;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h4[contains(text(),'Create a new account.')]")
    WebElement verifyTextCreateANewAccount;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//input[@value ='Register']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Error')]")
    WebElement verifyError;


    public String verifyText() {
        log.info("Verify Create a new account text on registration page" + verifyTextCreateANewAccount.toString());
        return getTextFromElement(verifyTextCreateANewAccount);
    }

    public void enterTextInEmailField() {
        log.info("Enter text in email field" + emailField.toString());
        sendTextToElement(emailField, "p"+generateRandomNumber()+".d@gmail.com");
    }

    public void enterTextInPasswordField() {
        log.info("Enter text in password field" + passwordField.toString());
        sendTextToElement(passwordField, "Palak@123");
    }

    public void enterTextInConfirmPasswordField() {
        log.info("Enter text in confirm password field" + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, "Palak@123");
    }

    public void clickOnRegisterButton() {
        log.info("Click on Register button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyAnErrorOccurredWhileProcessingRegisterRequest() {
        log.info("Verify an error occurred while processing register request" + verifyError.toString());
        return getTextFromElement(verifyError);
    }


}

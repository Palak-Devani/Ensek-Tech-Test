package corp.energy.ensek.pages;
//Pages package consists of all different page classes with their objects and methods

import corp.energy.ensek.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "registerLink")
    WebElement registerLink;

    @CacheLookup
    @FindBy(linkText = "Buy energy »")
    WebElement buyEnergyLink;

    public void clickOnRegisterLink() {
        log.info("Click On Register Link on homepage" + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnBuyEnergyLink() {
        log.info("Click on buy energy link on homepage" + buyEnergyLink.toString());
        clickOnElement(buyEnergyLink);
    }

}

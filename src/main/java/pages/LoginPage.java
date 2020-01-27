package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends ParentPage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

   @FindBy(xpath = "//div[@data-gender='f']")
    WebElement femalePhoto;

    @FindBy(xpath = "//div[@data-gender='m']")
    WebElement malePhoto;

    @FindBy(xpath = "//div[@data-next=\"slide-03-f\"]/img[@alt='Темные']")
    WebElement femalePhotoDarkHair;

    @FindBy(xpath = "//div[@data-next=\"slide-03-f\"]/img[@alt='Светлые']")
    WebElement femalePhotoLightHair;

    @FindBy(xpath = "//div[@data-next=\"slide-03-m\"]/img[@alt='Темные']")
    WebElement malePhotoDarkHair;

    @FindBy(xpath = "//div[@data-next=\"slide-03-m\"]/img[@alt='Светлые']")
    WebElement malePhotoLightHair;

    @FindBy(xpath = "//div[@data-next=\"slide-04-f\"]/img[@alt='Темные']")
    WebElement femalePhotoDarkEyes;

    @FindBy(xpath = "//div[@data-next=\"slide-04-f\"]/img[@alt='Светлые']")
    WebElement femalePhotoLightEyes;

    @FindBy(xpath = "//div[@data-next=\"slide-04-m\"]/img[@alt='Темные']")
    WebElement malePhotoDarkEyes;

    @FindBy(xpath = "//div[@data-next=\"slide-04-m\"]/img[@alt='Светлые']")
    WebElement malePhotoLightEyes;

    @FindBy(xpath = "//div[@data-next=\"slide-05\"]/img[@alt='С формами']")
    WebElement femalePhotoCurvy;

    @FindBy(xpath = "//div[@data-next=\"slide-05\"]/img[@alt='Стройная']")
    WebElement femalePhotoSlim;

    @FindBy(xpath = "//div[@data-next=\"slide-05\"]/img[@alt='Спортивная']")
    WebElement malePhotoAthletic;

    @FindBy(xpath = "//div[@data-next=\"slide-05\"]/img[@alt='Обычная']")
    WebElement malePhotoNormal;

    @FindBy(xpath = "//form[@name='reg-form']")
    WebElement registrationForm;

    public void openLoginPage() {
        try{
            webDriver.get("https://m.hitwe.com/landing/inter?p=15276");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.error("Cannot open Login Page");
            Assert.fail("Cannot open Login Page");
        }
    }

    public void clickOnFemalePhoto() {
        actionsWithOurElements.clickOnElement(femalePhoto);
    }

    public void clickOnMalePhoto() {
        actionsWithOurElements.clickOnElement(malePhoto);
    }

    public void clickFemalePhotoDarkHair() {
        actionsWithOurElements.clickOnElement(femalePhotoDarkHair);
    }

    public void clickFemalePhotoLightHair() {
        actionsWithOurElements.clickOnElement(femalePhotoLightHair);
    }

    public void clickFemalePhotoDarkEyes() {
        actionsWithOurElements.clickOnElement(femalePhotoDarkEyes);
    }

    public void clickFemalePhotoLightEyes() {
        actionsWithOurElements.clickOnElement(femalePhotoLightEyes);
    }

    public void clickFemalePhotoCurvy() {
        actionsWithOurElements.clickOnElement(femalePhotoCurvy);
    }

    public void clickFemalePhotoSlim() {
        actionsWithOurElements.clickOnElement(femalePhotoSlim);
    }

    public boolean isRegisterFormDisplayed() {
        return actionsWithOurElements.isElementDisplayed(registrationForm);
    }
}

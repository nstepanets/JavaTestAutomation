package libs;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActionsWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait waitLow;

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        waitLow = new WebDriverWait(webDriver, 1);
//        waitHigh = new WebDriverWait(webDriver, 30);
    }

    public void enterTextIntoElement(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info("Value " + text + " was entered into field");
        } catch (Exception e) {
            logger.error("Cannot work with element" + e);
            Assert.fail("Cannot work with element" + e);
        }
    }

    public void clickOnElement(WebElement element) {
        try {
            waitLow.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            logger.error("Cannot work with element" + e);
            Assert.fail("Cannot work with element" + e);
        }
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            waitLow.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception e) {
            logger.info("Element not found");
            return false;
        }
    }
}
package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class BasePage {
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    public void click(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
    public void sendKeys(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public void clearAndSendKeys(WebElement element, String txt){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(txt);
    }
    public void sendKeysAndEnter(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);
    }
    public void selectByVisibleText(WebElement dropDown, String visibleText){
        Select slc = new Select(dropDown);
        slc.selectByVisibleText(visibleText);
    }
    public void selectByIndex(WebElement dropDown, int index){
        Select slc = new Select(dropDown);
        slc.selectByIndex(index);
    }
    public Boolean isDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        if(element.isDisplayed()){
            return true;
        }else {
            return false;
        }
    }
    public void wait(int sec) throws InterruptedException{
        Thread.sleep((sec*1000));
    }
    public void moveToElement(WebElement element){
        Actions a = new Actions(driver);
        a.moveToElement(element).perform();
    }
    public void rollUntilFindElementAndClick(WebElement element){
        Boolean elemFound = false;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while (!elemFound){
            js.executeScript("window.scrollBy(0,350)", "");
            if (isClickable(element)){
                elemFound = true;
                click(element);
            }
        }
    }
    public void rollUntilFindElement(WebElement element){
        Boolean elemFound = false;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while (!elemFound){
            js.executeScript("window.scrollBy(0,350)", "");
            if (isClickable(element)){
                elemFound = true;
            }
        }
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }
    public Boolean isClickable(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        if(isDisplayed(element)){
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }else {
            return false;
        }
    }
}

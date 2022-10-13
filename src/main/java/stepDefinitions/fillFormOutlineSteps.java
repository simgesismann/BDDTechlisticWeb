package stepDefinitions;

import PageObjectModel.FormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class fillFormOutlineSteps {
    WebDriver driver;
    FormPage formPage = new FormPage();
    @Given("navigate to website")
    public void navigateToWebsite() {
        driver = Driver.getDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        //driver.navigate().refresh();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }
    @And("fill name {string}")
    public void fillName(String name) {
        formPage.fillNameOutline(name);
    }
    @And("fill lastname {string}")
    public void fillLastname(String surname) {
        formPage.fillSurnameOutline(surname);
    }
    @And("send date {string}")
    public void sendDate(String date) {
        formPage.typeDateOutline(date);
    }
}

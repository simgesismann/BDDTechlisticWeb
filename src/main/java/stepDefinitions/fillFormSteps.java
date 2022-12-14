package stepDefinitions;

import PageObjectModel.FormPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import utilities.Driver;

public class fillFormSteps extends FormPage{
    FormPage formPage = new FormPage();
    WebDriver driver;
    @Given("user is on formPage")
    public void user_is_on_form_page() {
        driver = Driver.getDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
    }
    @Given("fill name")
    public void fill_name() {
        formPage = new FormPage();
        formPage.fillName();
    }
    @Given("fill surname")
    public void fill_surname() {
        formPage.fillSurname();
    }
    @Given("choose gender")
    public void choose_gender() {
        formPage.chooseGender();
    }
    @Given("choose years of experience")
    public void choose_years_of_experience() {
        formPage.chooseYearsOfExperience();
    }
    @Given("type date")
    public void type_date() {
        formPage.typeDate();
    }
    @Given("choose profession")
    public void choose_profession() {
        formPage.chooseExperienceAutomationTester();
    }
    @Given("choose automation tool")
    public void choose_automation_tool() {
        formPage.chooseAutomationTools();
    }
    @Given("select continents")
    public void select_continents() {
        formPage.selectContinent();
    }
    @Given("select selenium commands")
    public void select_selenium_commands() {
        formPage.selectSeleniumCommand();
    }
    @And("upload sample file")
    public void uploadSampleFile() {
        formPage.uploadFile();
    }
    @Then("press button")
    public void pressButton() {
        rollUntilFindElement(SubmitButtonLocator);
        formPage.clickSubmitButton();
    }
    @AfterTest
    public void quit() throws InterruptedException {
        wait(2);
        Driver.quitDriver();
    }
    @After
    public void close() throws InterruptedException {
        wait(2);
        Driver.closeDriver();
    }
}

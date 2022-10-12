package utilities;

import PageObjectModel.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPageConstants extends BasePage {
    @FindBy(name = "firstname")
    public WebElement NameLocator;
    @FindBy(name = "lastname")
    public WebElement SurnameLocator;
    @FindBy(xpath = "//input[contains(@id,\"sex\")]")
    public WebElement GenderRadioButtonsLocator ;
    @FindBy(xpath = "//input[contains(@id,\"exp\")]")
    public WebElement YearsOfExperienceRadioButtonsLocator;
    @FindBy(css = "#datepicker")
    public WebElement DateTextLocator;
    @FindBy(xpath =  "//input[@value=\"Automation Tester\"]")
    public WebElement ExperienceAutomationTesterLocator;
    @FindBy(xpath = "//input[starts-with(@id,\"tool-1\")]")
    public WebElement AutomationToolProtractorLocator;
    @FindBy(xpath = "//input[starts-with(@id,\"tool-2\")]")
    public WebElement AutomationToolSeleniumLocator;
    @FindBy(xpath = "//select[@id=\"continents\"]")
    public WebElement ContinentSelectButtonLocator;
    @FindBy(id = "selenium_commands")
    public WebElement SeleniumCommandsSelectButtonLocator;
    @FindBy(id = "photo")
    public WebElement FileUploadButtonLocator;
    @FindBy(name = "submit")
    public WebElement SubmitButtonLocator;

}

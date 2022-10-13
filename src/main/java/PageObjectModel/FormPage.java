package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.FormPageConstants;

public class FormPage extends FormPageConstants {
    WebDriver driver;
    public FormPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    public void fillName(){
        scrollDown();
        sendKeys(NameLocator,"simge");
    }
    public void fillNameOutline(String name){
        scrollDown();
        sendKeys(NameLocator,name);
    }
    public void fillSurname(){
        sendKeys(SurnameLocator,"sisman");
    }
    public void fillSurnameOutline(String surname){
        sendKeys(SurnameLocator,surname);
    }
    public void chooseGender(){
        click(GenderRadioButtonsLocator);
    }
    public void chooseYearsOfExperience(){
        click(YearsOfExperienceRadioButtonsLocator);
    }
    public void typeDate(){
        rollUntilFindElement(DateTextLocator);
        sendKeys(DateTextLocator,"12.10.2022");
    }
    public void typeDateOutline(String date){
        rollUntilFindElement(DateTextLocator);
        sendKeys(DateTextLocator,date);
    }
    public void chooseExperienceAutomationTester(){
        click(ExperienceAutomationTesterLocator);
    }
    public void chooseAutomationTools(){
        click(AutomationToolProtractorLocator);
        click(AutomationToolSeleniumLocator);
    }
    public void selectContinent(){
        selectByVisibleText(ContinentSelectButtonLocator,"Australia");
    }
    public void selectSeleniumCommand(){
        selectByIndex(SeleniumCommandsSelectButtonLocator,0);
        selectByIndex(SeleniumCommandsSelectButtonLocator,1);
    }
    public void uploadFile(){
        sendKeys(FileUploadButtonLocator,"//Users/simgesisman/ornek.png");
    }
    public void clickSubmitButton(){
        click(SubmitButtonLocator);
    }


}

# BDDTechlisticWeb

## Scenario:

* Navigate to Techlistic Selenium Practice Form Page
* Fill name and surname
* Choose gender and years of experience radio buttons
* Type date
* Choose profession and automation tools radio buttons
* Select continents from dropdown
* Select selenium commands from dropdown
* Upload an image from desktop
* Press button

## Used Technologies
* Java 
* Selenium
* POM
* BDD

## Install

You can get the project to your computer:
```
git clone https://github.com/simgesismann/BDDTechlisticWeb.git 
```
## Project Packages: 

### PageObjectModel 
Package includes ***BasePage*** for base functions, another class ***FormPage*** to create related functions to use in scenario steps.

### stepDefinitions
Package includes a class ***fillFormSteps*** for feature's scenario steps as methods.

### utilities
Package includes ***Driver*** class to call ChromeDriver, I have used WebDriverManager to work with.
Also it includes ***FormPageConstants*** to see each elements' locator. ***FormPage*** uses variables from ***FormPageConstants*** by extension.
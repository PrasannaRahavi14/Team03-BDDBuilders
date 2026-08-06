package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverFactory.DriverFactory;
import Utilities.BaseLogger;
import Utilities.ConfigReader;
import Utilities.ElementsUtil;

public class ProgramPage extends BaseLogger {
	WebDriver driver = DriverFactory.getDriver();
	 ElementsUtil elementsUtil = new ElementsUtil(driver);
	 String url = ConfigReader.getProperty("baseurl");
	 private By Username = By.xpath("//input[@id='username']");
	 private By Password = By.xpath("//input[@id='password']");
	 private By SelectRole = By.xpath("//div[@id='mat-select-value-1']//span[contains(text(),'Select the role')]");
	 private By RoleName = By.xpath("//span[contains(text(), ' Admin ')]");
	 private By Loginbutton = By.xpath("//button[@id='login']");
	 private By HomePage = By.xpath("//span[contains(text(), ' LMS - Learning Management System ')]");
	 private By ProgramMenu = By.xpath("//span[contains(text(), 'Program')]");
	 private By ManageProgram = By.xpath("//div[contains(text(), ' Manage Program')]");
	 private By AddNewProgram = By.xpath("//button[contains(text(), 'Add New Program')]");
	 private By LeftDeletebutton = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	 private By SearchBox = By.xpath("//input[@id='filterGlobal']");
	 private By SearchPlaceholder = By.xpath("//input[@placeholder='Search...']");
	 
	 public ProgramPage(WebDriver driver) {
	        this.driver = driver;
	        this.elementsUtil = new ElementsUtil(driver);
	    } 
	 
	 public void DoLogin()
	 {
		 driver.get(url);
	        elementsUtil.doSendKeys(Username, "Lmshackathon@gmail.com");
	        elementsUtil.doSendKeys(Password, "lmsAug@2026");
	        elementsUtil.doClick(SelectRole);
	        elementsUtil.doClick(RoleName);
	        elementsUtil.doClick(Loginbutton);
	 }
	  
	 public boolean OnHomepage()
	 {
		 return elementsUtil.isElementDisplayed(HomePage);
	 }
	 public void ClickProgramMenu()
	 {
		 elementsUtil.doClick(ProgramMenu);
	 }
	 
	 public boolean GetManageProgram()
	 { 
		 return elementsUtil.isElementDisplayed(ManageProgram);
	 }
	 
	 public String AddNewProgramMenu()
	 {
		 return elementsUtil.doGetText(AddNewProgram);
	 }
	 
	 public String GetProgramTitle() 
	 {
		 return elementsUtil.doGetText(ManageProgram);
	 }
	 
	 public boolean isManageProgramLeftAligned()
	 {
		 WebElement ProgramHeading = elementsUtil.waitForElementToBeVisible(ManageProgram);
		 int heading = ProgramHeading.getLocation().getX();
		 int Threshold = 500; //Threshold value for the top left alignment
		 if (Threshold<=500) {
		        log.info("Manage Program heading is left-aligned : " + heading);
		    } else {
		        log.info("Manage Program heading is not left-aligned : " + heading);
		    }
		 return false;
		}
	 
	 public boolean isDeletebuttonLeftDisabled()
	 {
		 return elementsUtil.isElementDisplayed(LeftDeletebutton);
	 }
	 
	 public boolean isSearchBoxDisplay()
	 {
	     return elementsUtil.isElementDisplayed(SearchBox);
	 }
	 
	 public boolean Searchplaceholdertext()
	 {
		 return elementsUtil.isElementDisplayed(SearchPlaceholder);
	 }

	
}


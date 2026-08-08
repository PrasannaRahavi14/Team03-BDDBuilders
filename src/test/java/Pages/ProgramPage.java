package Pages;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	 private By ProgramNameColumn = By.xpath("//th[@psortablecolumn='programName']");
	 private By ProgramDescriptionColumn = By.xpath("//th[@psortablecolumn='programDescription']");
	 private By ProgramStatusColumn = By.xpath("//th[@psortablecolumn='programStatus']");
	 private By EditDeleteColumn = By.xpath("//th[contains(text(), ' Edit / Delete ')]");
	 private By ProgramNameCheckbox = By.xpath("//div[@class='p-checkbox-box']");
	 private By ProgramNameSortIcon = By.xpath("//th[@ng-reflect-field='programName']//i[contains(@class,'p-sortable-column-icon')]");
	 private By ProgramDescriptionSortIcon = By.xpath("//th[@ng-reflect-field='programDescription']//i[contains(@class,'p-sortable-column-icon')]");
	 private By ProgramStatusSortIcon = By.xpath("//th[@ng-reflect-field='programStatus']//i[contains(@class,'p-sortable-column-icon')]");
	 private By Paginationshowingentries = By.xpath("//span[@class= 'p-paginator-current ng-star-inserted']");
	 private By PaginationDoubleLeftIcon = By.xpath("//span[@class= 'p-paginator-icon pi pi-angle-double-left']");
	 private By PaginationSingleLeftIcon = By.xpath("//span[@class= 'p-paginator-icon pi pi-angle-left']");
	 private By PaginationPages = By.xpath("//span[@class= 'p-paginator-pages ng-star-inserted']");
	 private By PaginationSingleRightIcon = By.xpath("//span[@class= 'p-paginator-icon pi pi-angle-right']");
	 private By PaginationDoubleRightIcon = By.xpath("//span[@class= 'p-paginator-icon pi pi-angle-double-right']");
	 
	 
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

	 public String GetDataTableHeader(String Columnheader)
	 {
		if(Columnheader.equalsIgnoreCase("Program Name")) {
			elementsUtil.doGetText(ProgramNameColumn);
			log.info("Admin is able to see the header name as : "+ Columnheader);
		}
		else if(Columnheader.equalsIgnoreCase("Program Description"))
		{
			elementsUtil.doGetText(ProgramDescriptionColumn);
			log.info("Admin is able to see the header name as : "+ Columnheader);
		}
		else if(Columnheader.equalsIgnoreCase("Program Status"))
		{
			elementsUtil.doGetText(ProgramStatusColumn);
			log.info("Admin is able to see the header name as : "+ Columnheader);
		}
		else if(Columnheader.equalsIgnoreCase("Edit/Delete"))
		{
			elementsUtil.doGetText(EditDeleteColumn);
			log.info("Admin is able to see the header name as : "+ Columnheader);
		}
        else {
            throw new IllegalArgumentException("Unknown Columnheader : " + Columnheader);
        }
		return Columnheader;	 
	 }
	 
	 public boolean isProgramNameCheckboxdisplay()
	 {
		 return elementsUtil.isElementDisplayed(ProgramNameCheckbox);
	 }
	 
	 public boolean isProgramNameCheckboxUnchecked()
	 {
		 WebElement checkbox = elementsUtil.waitForElementToBeVisible(ProgramNameCheckbox);
		 String ariaChecked = checkbox.getAttribute("aria-checked");
	     String classAttribute = checkbox.getAttribute("class");
	        if (ariaChecked != null) {
	            return "false".equalsIgnoreCase(ariaChecked);      
	        }
	        return classAttribute == null || !classAttribute.contains("p-highlight");
	 }
	 
	 public boolean isSortIconPresent()
	 {
		 List<WebElement> ProgramNameIcon = elementsUtil.waitForElementsToBeVisible(ProgramNameSortIcon);
		 boolean isProgramNameIconPresent = ProgramNameSortIcon != null && !ProgramNameIcon.isEmpty();
		 log.info("Sort icon beside Program Name is present: {}", isProgramNameIconPresent);
		 
		 List<WebElement> ProgramDescriptionIcon = elementsUtil.waitForElementsToBeVisible(ProgramDescriptionSortIcon);
		 boolean isProgramDescriptionIconPresent = ProgramDescriptionSortIcon != null && !ProgramDescriptionIcon.isEmpty();
		 log.info("Sort icon beside Program Description is present: {}", isProgramDescriptionIconPresent);
		 
		 List<WebElement> ProgramStausIcon = elementsUtil.waitForElementsToBeVisible(ProgramStatusSortIcon);
		 boolean isProgramStatusIconPresent = ProgramStatusSortIcon != null && !ProgramStausIcon.isEmpty();
		 log.info("Sort icon besdie Program Status is present: {}", isProgramStatusIconPresent);
		 
         return isProgramNameIconPresent && isProgramDescriptionIconPresent && isProgramStatusIconPresent;
         
	 }	 
	 
	 
	 
	 
}

	 

	



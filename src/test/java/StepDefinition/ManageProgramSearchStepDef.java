package StepDefinition;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverFactory.DriverFactory;
import Pages.ProgramPage;
import Utilities.BaseLogger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageProgramSearchStepDef extends BaseLogger{
	WebDriver driver = DriverFactory.getDriver();
    ProgramPage programpage = new ProgramPage(driver);
    
    @Given("Admin is on the ProgramPage")
    public void admin_is_on_the_program_page() {
    	programpage.DoLogin();
	    programpage.ClickProgramMenu();
	    programpage.GetManageProgram();
    }

    @When("Admin enters the {string} in search box")
    public void admin_enters_the_in_search_box(String TestCaseID) {
        programpage.searchProgramByTestCaseId(TestCaseID);
    }

    @Then("Admin should  see Program name, description, and status for searched program name")
    public void admin_should_see_program_name_description_and_status_for_searched_program_name() {
    	boolean isValid = programpage.isSearchedProgramDetailsValid();
        Assert.assertTrue(isValid, "program details (Name, Description, Status)");
    }
    
    @When("Admin enters the {string} in searchbox")
    public void admin_enters_the_in_searchbox(String TestCaseID) {
    	 programpage.searchProgramByTestCaseId(TestCaseID);
    }

    @Then("Admin should  see Program name, description, and status for searched program description")
    public void admin_should_see_program_name_description_and_status_for_searched_program_description() {
    	boolean isValid = programpage.isSearchedProgramDetailsValid();
        Assert.assertTrue(isValid, "program details (Name, Description, Status)");
    }
}

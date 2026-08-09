package StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverFactory.DriverFactory;
import Pages.ProgramPage;
import Utilities.BaseLogger;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramStepDef extends BaseLogger {
	
	WebDriver driver = DriverFactory.getDriver();
    ProgramPage programpage = new ProgramPage(driver);
    
	@Given("Admin is on home page after Login")
	public void admin_is_on_home_page_after_login() {
	    programpage.DoLogin();
	    boolean HomePageTitle = programpage.OnHomepage();
	    log.info("HomePage is displayed : "+HomePageTitle);
	  
	}

	@When("Admin clicks Program on the navigation bar")
	public void admin_clicks_program_on_the_navigation_bar() {
	    programpage.ClickProgramMenu();
	    
	}

	@Then("Admin should be navigated to Program page")
	public void admin_should_be_navigated_to_program_page() {
	    boolean isDisplayed = programpage.GetManageProgram();
	    Assert.assertTrue(isDisplayed);
		log.info("Manage Program page is displayed : "+isDisplayed);
	    
	}

	@Then("Admin should see sub menu in menu bar as {string}")
	public void admin_should_see_sub_menu_in_menu_bar_as(String ExpectedSubMenu) {
		String ActualSubMenu = programpage.AddNewProgramMenu();
		Assert.assertEquals(ExpectedSubMenu, ActualSubMenu);
		log.info("Expected SubMenu is : "+ActualSubMenu);
	    
	}

	@Then("Admin should see the heading {string}")
	public void admin_should_see_the_heading(String ExpectedHeading) {
	    String ActualHeading = programpage.GetProgramTitle();
	    Assert.assertEquals(ExpectedHeading, ActualHeading);
		log.info("Expected Heading is : "+ActualHeading);
	}

	@Then("Admin should see manage program heading aligned on the left side")
	public void admin_should_see_manage_program_heading_aligned_on_the_left_side() {
	    boolean isLeftAligned = programpage.isManageProgramLeftAligned();
	    Assert.assertTrue(isLeftAligned);
	    log.info("Manage Program Heading is LeftAligned  : "+ isLeftAligned);
	}

	@Then("Admin should see a Delete button in left top is disabled")
	public void admin_should_see_a_delete_button_in_left_top_is_disabled() {
		boolean isDeletebuttondisabled = programpage.isDeletebuttonLeftDisabled();
	    Assert.assertTrue(isDeletebuttondisabled);
	    log.info("Delete Button on top left is disabled : "+ isDeletebuttondisabled);
	    
	}

	@Then("Admin should see Search bar")
	public void admin_should_see_search_bar() {
		boolean isSearchBardisplayed = programpage.isSearchBoxDisplay();
	    Assert.assertTrue(isSearchBardisplayed);
	    log.info("Search Bar is displayed : "+ isSearchBardisplayed);
	    
	}

	@Then("Admin should see search... placeholder text")
	public void admin_should_see_search_placeholder_text() {
		boolean isSearchplaceholderdisplayed = programpage.Searchplaceholdertext();
	    Assert.assertTrue(isSearchplaceholderdisplayed);
	    log.info("Search PlaceHolder is displayed : "+ isSearchplaceholderdisplayed);
	    
	}

	@Then("Admin should see data table with {string} on Manage Program Page")
	public void admin_should_see_data_table_with_on_manage_program_page(String ExpectedColumnHeading) {
		String ActualColumnHeading = programpage.GetDataTableHeader(ExpectedColumnHeading);
	    Assert.assertEquals(ExpectedColumnHeading, ActualColumnHeading);
		log.info("Expected Heading is : "+ActualColumnHeading);
	}

	@Then("Admin should see checkbox default state as unchecked beside Program Name column header")
	public void admin_should_see_checkbox_default_state_as_unchecked_beside_program_name_column_header() {
	    boolean isProgramHeaderCheckboxdisplayed = programpage.isProgramNameCheckboxUnchecked();
	    Assert.assertTrue(isProgramHeaderCheckboxdisplayed);
	    log.info("Program Header Checkbox is in default state as unchecked : "+ isProgramHeaderCheckboxdisplayed);
	}

	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
		boolean isSortIconDisplayed = programpage.isSortIconPresent();
	  Assert.assertTrue(isSortIconDisplayed);
      log.info("Sort Icon is Present : "+ isSortIconDisplayed);
	}

	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	    
	    
	}
	
	@Then("Admin should see the following pagination controls below the table:")
	public void admin_should_see_the_following_pagination_controls(DataTable dataTable) {
	    List<String> ExpectedControls = dataTable.asList(String.class);
	    List<String> ActualControls = programpage.GetPaginationControls(ExpectedControls);
	    Assert.assertEquals(ActualControls, ExpectedControls,
	            "Pagination controls not displayed as expected");
	    log.info("Admin verified all pagination controls: " + ExpectedControls);
	}	
	
	@Then("Admin should see the footer as {string}")
	public void admin_should_see_the_footer_as(String ExpectedFooter) {
		String ActualFooter= programpage.getFooter();
		Assert.assertEquals(ExpectedFooter, ActualFooter);
		log.info("Expected Footer is : "+ ActualFooter);
	    
	}
	
	@Given("Admin is on Program Page")
	public void admin_is_on_program_page() {
	    programpage.DoLogin();
	    programpage.ClickProgramMenu();
	    programpage.GetManageProgram();
	    
	}

	@When("Admin clicks on Add New Program under the Program menu bar")
	public void admin_clicks_on_add_new_program_under_the_program_menu_bar() {
	    programpage.AddNewProgramMenu();
	    programpage.ClickAddNewProgram();
	    
	}

	@Then("Admin should see Program Details dialog box")
	public void admin_should_see_program_details_dialog_box() {
		boolean isProgramDetailsDialogBoxDisplayed = programpage.isProgramDetailsDiaplogBoxDisplayed();
		Assert.assertTrue(isProgramDetailsDialogBoxDisplayed);
	    log.info("Program Details dialog Box is Present : "+ isProgramDetailsDialogBoxDisplayed);
	}

	@Then("Admin should see  title as {string}")
	public void admin_should_see_title_as(String ExpectedTitle) {
	    String ActualTitle = programpage.GetProgramDetailsText();
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
		log.info("Expected Title is : "+ ActualTitle);
	    
	}

	@Then("Admin should see red  asterisk mark beside mandatory field {string}")
	public void admin_should_see_red_asterisk_mark_beside_mandatory_field(String fieldName) {
		boolean isDisplayed = programpage.isRedAsterikdisplayed(fieldName);
	    Assert.assertTrue(isDisplayed, "Red asterisk not displayed for mandatory field: " + fieldName);
	    log.info("Verified mandatory asterisk for field: " + fieldName);
	    
	}

	@Then("Admin should see the {string}")
	public void admin_should_see_the(String FieldTextBox) {
		boolean isDisplayed = programpage.isTextBoxDisplayed(FieldTextBox);
	    Assert.assertTrue(isDisplayed, "Input Text Box is not avaialble : " + FieldTextBox);
	    log.info("Admin is able to see : " + FieldTextBox);
	}

	@Then("Admin should see {string} radio buttons")
	public void admin_should_see_radio_buttons(String Options) {
		boolean isDisplayed = programpage.isRadioButtonDisplayed(Options);
	    Assert.assertTrue(isDisplayed, "Radio button not displayed: " + Options);
	    log.info("Verified radio button is displayed: " + Options);
	    
	}
}


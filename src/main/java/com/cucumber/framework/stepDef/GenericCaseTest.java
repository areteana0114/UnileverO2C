package com.cucumber.framework.stepDef;

import org.apache.log4j.Logger;

import com.cucumber.framework.PageObjects.GenericCasePage;
import com.cucumber.framework.PageObjects.Pulse;
import com.cucumber.framework.TestBase.TestBase;
import com.cucumber.framework.helper.Logger.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericCaseTest {
	
	private final Logger log = LoggerHelper.getLogger(GenericCaseTest.class);

	GenericCasePage genericcasepage;
	
	
	
	@Given("Select {string} from search results dropdown")
	public void select_from_search_results_dropdown(String value) {
		genericcasepage=new GenericCasePage(TestBase.getDriver());
		genericcasepage.sendGenericCaseObject(genericcasepage);
		genericcasepage.selectCustomersFromdropdown(value);
	}

	@Given("Enter {string} into search field")
	public void enter_into_search_field(String customernumber) throws Exception {
		genericcasepage.enterCustomerNumberIntoSearchField(customernumber);
	}

	@When("click on Search icon")
	public void click_on_Search_icon() throws Exception {
		genericcasepage.clickSearchIconbtn();
	}

	@Then("search results corresponding to {string} should be displayed")
	public void search_results_corresponding_to_should_be_displayed(String expectedvalue) throws Exception {
		genericcasepage.verifyResult(expectedvalue);
	}

	@When("Click on three dots button")
	public void click_on_three_dots_button() throws Exception {
		genericcasepage.clickOnThreeDots();
	}

	@When("Click on start research button")
	public void click_on_start_research_button() throws Exception {
		genericcasepage.clickOnStartResearchbtn();
	}
	
	@When("Hover On Add Task button Pops")
	public void hover_On_Add_Task_button_Pops() throws Exception {
		genericcasepage.hoverOnAddtaskBtn();
	}

	
	@Given("Click on Add Task button in OtoC")
	public void click_on_Add_Task_button_in_OtoC() throws Exception {
		genericcasepage.clickOnAddTaskbtn();
	}


	@When("Select the required {string}")
	public void select_the_required(String servicecase) throws Exception {
		genericcasepage.clickOnServiceCase(servicecase);
	}

	@When("Click on the Add Tasks button")
	public void click_on_the_Add_Tasks_button() throws Exception {
		genericcasepage.clickOnAddTasksbtn();
	}

	@Given("Select values from {string} and {string} dropdown")
	public void select_values_from_and_dropdown(String typeonevalue, String typetwovalue) {
		genericcasepage.selectTypeOneAndTypetwoValues(typeonevalue, typetwovalue);
	}

	@Given("Click on Parties and Organization tab")
	public void click_on_Parties_and_Organization_tab() throws Exception {
		genericcasepage.clickOnPartiesAndOrganizationTab();
	}
	
	@Given("Select values from {string} and {string}")
	public void select_values_from_and(String salesorg, String distchannel) {
		genericcasepage.selectSalesOrgAndDistChannel(salesorg, distchannel);
	}

	@Given("Click on Save button")
	public void click_on_Save_button() throws Exception {
		genericcasepage.clickOnSaveButton();
	}

	@Then("Verify the Generic case is created")
	public void Verify_the_Generic_case_is_created() throws Exception {
		genericcasepage.verifyGenericCaseCreated();
	}


	@Then("Click on Edit button")
	public void click_on_Edit_button() throws Exception {
		genericcasepage.clickOnEditButton();
	}

	@Then("Click on OtherActions button")
	public void click_on_OtherActions_button() throws Exception {
		genericcasepage.clickOnOtherActionsButton();
	}
	
	@Then("Click on UpdateStatus link")
	public void click_on_UpdateStatus_link() throws Exception {
		genericcasepage.clickOnUpdateStatusLink();
	}
	@Then("Select status as {string}")
	public void select_status_as(String statusvalue) throws Exception {
		genericcasepage.selectUpdateStatusValueFromDropdown(statusvalue);
		
	}

	@Then("Click on Submit button in update status pop up")
	public void click_on_Submit_button_in_update_status_pop_up() throws Exception {
		genericcasepage.clickOnSubmitButtonInUpdateStatus();
	}

	@Then("Click on Follow button")
	public void click_on_Follow_button() throws Exception {
		genericcasepage.clickOnFollowButton();
	}

	/* Advance search Generic Case Creation */
	
	@Then("Click on customer search icon in Advance search screen")
	public void click_on_customer_search_icon_in_Advance_search_screen() throws Exception {
		genericcasepage=new GenericCasePage(TestBase.getDriver());
		genericcasepage.sendGenericCaseObject(genericcasepage);
		genericcasepage.clickOnCustomerSearchIcon();
	}
	
	@When("Enter {string} into customer number field in Advance search screen")
	public void enter_into_customer_number_field_in_Advance_search_screen(String customernumber) throws Exception {
		genericcasepage.sendAdvanceSearchCustomerNumber(customernumber);
	}

	@When("Click on Search button in Advance search screen")
	public void click_on_Search_button_in_Advance_search_screen() throws Exception {
		genericcasepage.clickOnAdvanceSearchButton();
	}

	@When("Click on two dots button in Advance search screen")
	public void click_on_two_dots_button_in_Advance_search_screen() throws Exception {
		genericcasepage.clickOnTwoDotsButton();
	}

	@When("Click on start research button in Advance search screen")
	public void click_on_start_research_button_in_Advance_search_screen() throws Exception {
		genericcasepage.clickOnAdvacneStartResearch();
		System.out.println("Clicked on Start Research");
	}


	
	
}

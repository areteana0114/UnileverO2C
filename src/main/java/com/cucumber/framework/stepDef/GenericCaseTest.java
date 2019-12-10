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
	public void select_from_search_results_dropdown(String value) throws Exception {
		genericcasepage=new GenericCasePage(TestBase.getDriver());
		genericcasepage.sendGenericCaseObject(genericcasepage);
		genericcasepage.closeCaseIdTab();	
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
	
	  @Then("Select status as {string}") public void select_status_as(String statusvalue) throws Exception {
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
		genericcasepage.clickOnAdvanceStartResearch();
		System.out.println("Clicked on Start Research button");
	}

	@When("Click on create generic case button in Advance search screen")
	public void click_on_create_generic_case_button_in_Advance_search_screen() throws Exception {
		genericcasepage.clickOnAdvanceCreateGenericCaseButton();
		System.out.println("Clicked on create generic case button");
	}
	
	@Given("Select values from {string} and {string} dropdown in create generic case")
	public void select_values_from_and_dropdown_in_create_generic_case(String typeonevalue, String typetwovalue) {
		genericcasepage.selectTypeOneAndTypetwoValuesInCreateGenericCase(typeonevalue, typetwovalue);
	}
	@Given("Select status as {string} in the Create Generic Case\"")
	public void select_status_as_in_the_Create_Generic_Case(String statusvalue) throws Exception {
		genericcasepage.selectUpdateStatusValueFromCGCDropdown(statusvalue);
	}

	@Given("Verify the CFS and CP using {string} and {string} and {string} and {string} in generic case")
	public void verify_the_CFS_and_CP_using_and_in_generic_case(String cfs, String cp,String cfsflag,String cpflag) throws Exception {
	  genericcasepage.verifyCFSAndCP(cfs, cp, cfsflag, cpflag);
	}

	@Given("Verify the updated case status as {string}")
	public void verify_the_updated_case_status_as_using_xpath(String expectedupdatestatus) throws Exception {
		genericcasepage.verifyUpdatedCaseStatus(expectedupdatestatus);
	}
	
	@Given("Click on SendMail link")
	public void click_on_SendMail_link() throws Exception {
		genericcasepage.clickOnsendMailLink();
	}

	@Given("Click on Contact Person button")
	public void click_on_Contact_Person_button() throws Exception {
		genericcasepage.clickOnContactPersonBtn();
	}

	@Given("Select Contact Person checkbox")
	public void select_Contact_Person_checkbox() throws Exception {
		genericcasepage.clickOnContactPersonChkbox();
	}

	@Given("Click on Contact Person Submit button")
	public void click_on_Contact_Person_Submit_button() throws Exception {
		genericcasepage.clickOnContactPersonSubmitBtn();
	}

	

	@Given("Select purpose of email {string}")
	public void select_purpose_of_email(String purposeofemail) throws Exception {
		genericcasepage.clickOnPurposeOfEmailBtn(purposeofemail);
	}
	
	@Given("Select email destination {string} from dropdown")
	public void select_email_destination_from_dropdown(String emaildestination) throws Exception {
		genericcasepage.selectEmailDestination(emaildestination);
	}
	@Given("Click on sendmail button")
	public void click_on_sendmail_button() throws Exception {
		genericcasepage.clickOnSendEmailBtn();
	}

	@When("Click on three dots button in search with case id")
	public void click_on_three_dots_button_in_search_with_case_id() throws Exception {
		genericcasepage.clickOnThreeDotsInSearchCaseId();
	}
	
	@When("Click on Email Information tab")
	public void click_on_email_information_tab() throws Exception {
		genericcasepage.clickOnEmailInformationTab();
	}
	
	@When("Verify the reply email attachment is present for {string}")
	public void verify_the_reply_email_attachment_is_present(String caseid) throws Exception {
		genericcasepage.verifyEmailSubjectForRE(caseid);
	}
	
	@When("Verify the message case cannot be created {string}")
	public void verify_the_message_case_cannot_be_created(String message) throws Exception {
		genericcasepage.verifyCaseCanNotCreate(message);
	}
	

	@Then("Click on Assign To button")
	public void click_on_assign_to_button() throws Exception {
		genericcasepage.clickOnAssignToButton();
	}

	@Then("Click on Assign To CFS button")
	public void click_on_assign_to_cfs_button() throws Exception {
		genericcasepage.clickOnAssignToCFSButton();
	}
	
	@Then("Click on case id in My Cases tab")
	public void click_on_case_id_in_my_cases_tab() throws Exception {
		genericcasepage=new GenericCasePage(TestBase.getDriver());
		genericcasepage.sendGenericCaseObject(genericcasepage);
		genericcasepage.clickOnCaseIdLinkInMyCasesTab();
	}
	@Then("Click on Assign To Previous Assignee")
	public void click_on_assign_to_previous_assignee() throws Exception {
		genericcasepage.clickOnAssignToPreviousAssigneeButton();
	}
	
	@Then("Close the browser")
	public void close_the_browser() throws Exception {
		genericcasepage.closeBrowser();
	}
	
	@Then("Click on Assign To New Assignee")
	public void click_on_assign_to_new_assignee() throws Exception {
		genericcasepage.clickOnAssignToNewAssigneeButton();
	}
	@Then("Select the previous Assignee {string} and click on submit")
	public void select_the_previous_assignee_and_click_on_submit(String previousassignee) throws Exception {
		genericcasepage.selectPreviousAssigneeFromDropdown(previousassignee);
	}
	@Then("Select the New Assignee {string} and click on submit")
	public void select_the_new_assignee_and_click_on_submit(String newassignee) throws Exception {
		genericcasepage.selectnewAssigneeFromDropdown(newassignee);
	}
	
	@Then("Click on Assign To Workbasket link")
	public void click_on_assign_to_workbasket_link() throws Exception {
		genericcasepage.clickOnAssignToWBLink();
	}
	@Then("Click on My Workbasket tab in Home page")
	public void click_on_my_workbasket_tab_in_home_page() throws Exception {
		genericcasepage=new GenericCasePage(TestBase.getDriver());
		genericcasepage.sendGenericCaseObject(genericcasepage);
		genericcasepage.clickOnWBTab();
	}
	@Then("Select workbasket {string} from view Queue for dropdown and click on case id {string}")
	public void select_workbasket_from_view_queue_for_dropdown_and_click_on_case_id(String workbasketname,String caseid) throws Exception {
		genericcasepage.clickOnViewQueueForDropdown(workbasketname);
		genericcasepage.clickOnCaseIdLinkInMyWB_ViewQueueForResultsTab(caseid);
	}
}

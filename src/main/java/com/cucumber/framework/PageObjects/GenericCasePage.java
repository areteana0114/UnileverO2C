package com.cucumber.framework.PageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.framework.CS.CustomerServ;
import com.cucumber.framework.helper.Logger.LoggerHelper;

public class GenericCasePage extends CustomerServ implements GenericCasePageLoc {
	private final Logger log = LoggerHelper.getLogger(GenericCasePage.class);
	GenericCasePage genericcasepage;

	public GenericCasePage(WebDriver driver) {
		super(driver);
	}
	
	public void sendGenericCaseObject(GenericCasePage genericcasepage) {
		this.genericcasepage=genericcasepage;
	}
	
	public void selectCustomersFromdropdown(String value) {
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_searchcustomer_dd, value);
	}
	
	public void enterCustomerNumberIntoSearchField(String customernumber) throws Exception {
		xpath_GenericMethod_Sendkeys(xpath_customernumber_textbox, customernumber);
	}
	
	public void clickSearchIconbtn() throws Exception {
		xpath_GenericMethod_Click(xpath_searchicon_btn);
	}
	
	public void verifyResult(String expectedresult) throws Exception {
		boolean b=xpath_Genericmethod_VerifyTextEquals("//tbody/tr[@id='$PpySearchResults$ppxResults$l1']/td/div/span[text()='"+expectedresult+"']", expectedresult);
		Assert.assertTrue(b, "Expected result :"+expectedresult+"is not same as actual result");
	}
	
	public void clickOnThreeDots() throws Exception {
		xpath_GenericMethod_Click(xpath_threedots_btn);
	}
	
	public void clickOnStartResearchbtn() throws Exception {
		xpath_GenericMethod_Click(xpath_startresearch_btn);
	}
	public void hoverOnAddtaskBtn() throws Exception {
		try {
		xpath_GenericMethod_HoverOnDemoScreenPops(xpath_Addtask_btn1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void clickOnAddTaskbtn() throws Exception {
		waitFor(2);
		xpath_GenericMethod_Click(xpath_addtask_btn);
	}
	
	public void clickOnServiceCase(String servicecase) throws Exception {
		waitFor(3);
		xpath_GenericMethod_Click("//a[text()='"+servicecase+"']");
	}
	
	public void clickOnAddTasksbtn() throws Exception {
		xpath_GenericMethod_Click(xpath_addtasks_btn);
	}
	
	public void selectTypeOneAndTypetwoValues(String typeone,String typetwo) {
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_type1_dd, typeone);
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_type2_dd, typetwo);
	}
	
	public void clickOnPartiesAndOrganizationTab() throws Exception {
		xpath_GenericMethod_Click(xpath_parties_Org_tab);
	}
	
	public void selectSalesOrgAndDistChannel(String salesorg,String distchannel) {
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_salesorg_dd, salesorg);
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_distchnl_dd, distchannel);
	}
	
	public void clickOnSaveButton() throws Exception {
		
		xpath_GenericMethod_Click(xpath_save_btn);
		waitFor(2);
		try {
		driver.switchTo().alert().accept();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void verifyGenericCaseCreated() throws Exception {
		boolean caseid=xpath_Genericmethod_verifyElementPresent(xpath_genericcase_id);
		String caseid_value=xpath_Genericmethod_getElementText(xpath_genericcase_id);
		System.out.println(caseid_value);
		Assert.assertTrue(caseid, "Generic case has not been created");
	}
	
	public void clickOnEditButton() throws Exception {
		xpath_GenericMethod_Click(xpath_edit_btn);
	}
	
	public void clickOnOtherActionsButton() throws Exception {
		xpath_GenericMethod_Click(xpath_otheractions_btn);
	}
	
	public void clickOnUpdateStatusLink() throws Exception {
		xpath_GenericMethod_Click(xpath_updatestatus_link);
	}
	
	public void selectUpdateStatusValueFromDropdown(String statusvalue) throws Exception {
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_updatestatus_dd, statusvalue);
		xpath_GenericMethod_Sendkeys(xpath_remarksinupdatestatus_textbox, statusvalue);

	}
	
	public void clickOnSubmitButtonInUpdateStatus() throws Exception {
		xpath_GenericMethod_Click(xpath_updatestatus_submit_btn);
	}
	
	public void clickOnFollowButton() throws Exception {
		xpath_GenericMethod_Click(xpath_follow_button);
	}
	
	public void clickOnCustomerSearchIcon() throws Exception {
		try {
			waitFor(3);
			xpath_GenericMethod_HoverOnDemoScreenPops(xpath_advancecustomersearch_icon_hover);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		xpath_GenericMethod_Click(xpath_advancecustomersearch_icon_link);
		
	}
	public void sendAdvanceSearchCustomerNumber(String customernumber) throws Exception {
		xpath_GenericMethod_Sendkeys(xpath_advancecustomernumber_textbox, customernumber);
	}
	
	public void clickOnAdvanceSearchButton() throws Exception {
		xpath_GenericMethod_Click(xpath_advancecustomersearch_button);
	}
	
	public void clickOnTwoDotsButton() throws Exception {
		driver.switchTo().defaultContent();
		waitFor(2);
		driver.switchTo().frame("PegaGadget0Ifr");
		driver.findElement(By.xpath("(//*[contains(@id,'$PD_CustomerSearch')]/td[13])[1]")).click();
		//List<WebElement> eles=driver.findElements(By.xpath("//*[contains(@id,'$PD_CustomerSearch')]/td[2]"));
		//System.out.println(eles.size());
		//eles.get(0).click();
		waitFor(2);
		//xpath_GenericMethod_Click(xpath_advancetwodots_button);
		driver.switchTo().defaultContent();
	}
	
	public void clickOnAdvanceStartResearch() throws Exception {
		waitFor(3);
		xpath_GenericMethod_Click(xpath_advancestartresearch_btn);
		
	}
	
	public void clickOnAdvanceCreateGenericCaseButton() throws Exception {
		
		xpath_GenericMethod_Click(xpath_advancecreategenericcase_btn);
		waitFor(2);
		}
	
	public void selectTypeOneAndTypetwoValuesInCreateGenericCase(String typeone,String typetwo) {
try {
	xpath_GenericMethod_Click(xpath_casedesc_cgc_textbox);
}catch(Exception e) {
	System.out.println(e.getMessage());
}
	waitFor(3);
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_type1_cgc_dd, typeone);
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_type2_cgc_dd, typetwo);

	}
	
	public void selectUpdateStatusValueFromCGCDropdown(String statusvalue) throws Exception {
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_updatestatus_cgc_dd, statusvalue);
		xpath_GenericMethod_Sendkeys(xpath_remarksinupdatestatus_cgc_textbox, statusvalue);

	}
	
}

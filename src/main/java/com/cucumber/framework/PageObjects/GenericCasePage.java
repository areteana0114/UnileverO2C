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
		String acustno=xpath_Genericmethod_getElementText(xpath_custno_element);
		System.out.println(acustno);
		if(expectedresult.equalsIgnoreCase(acustno)) {
			System.out.println("Both are same");
		}
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
		waitFor(2);
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
	
	public void verifyCFSAndCP(String cfs, String cp, String cfsflag, String cpflag) throws Exception {
		String actualcfs;
		String actualcp;	
		try {
		waitFor(2);
		actualcfs = xpath_Genericmethod_getFirstSelectedValueFromDropdown(xpath_cfs_dd);
		System.out.println("Actual CFS is :"+actualcfs);
		waitFor(1);
		}catch(Exception e) {
			actualcfs="";
		}
		
		try {
			waitFor(2);
		    actualcp = xpath_Genericmethod_getFirstSelectedValueFromDropdown(xpath_cp_dd);
		    System.out.println("Actual CP is :"+actualcp+".");
		    waitFor(1);
		}catch(Exception e) {
			actualcp="";
		}
		/*
		 * if((cfs.equalsIgnoreCase(actualcfs))&&(cp.equalsIgnoreCase(actualcp))){
		 * System.out.println("Expected CFS :"+" "+cfs+"Actual CFS :"+" "+actualcfs+" "
		 * +"are same");
		 * System.out.println("Expected CP :"+" "+cp+"Actual CP :"+" "+actualcp+" "
		 * +"are same"); }else { System.out.println("CFS or CP data is invalid"); }
		 */
		if ((cfsflag.equalsIgnoreCase("Yes") && (cpflag.equalsIgnoreCase("Yes")))) {
			Assert.assertFalse(xpath_Genericmethod_verifyElementPresent(xpath_no_cfs_assigned),
					"Element is present, but expected is element should not be present");
			Assert.assertFalse(xpath_Genericmethod_verifyElementPresent(xpath_cfs_default_NotAvailable),
					"Element is present, but expected is element should not be present");
			Assert.assertEquals(actualcfs, cfs, "CFS data doesn't match");
			Assert.assertEquals(actualcp, cp, "CP data doesn't match");
			System.out.println("Data Matched for CFS & CP Flag :" + " " + cfsflag + " " + cpflag);
		} else if ((cfsflag.equalsIgnoreCase("Yes") && (cpflag.equalsIgnoreCase("No")))) {
			Assert.assertFalse(xpath_Genericmethod_verifyElementPresent(xpath_no_cfs_assigned),
					"Element is present, but expected is element should not be present");
			Assert.assertFalse(xpath_Genericmethod_verifyElementPresent(xpath_cfs_default_NotAvailable),
					"Element is present, but expected is element should not be present");
			Assert.assertEquals(actualcfs, cfs, "CFS data doesn't match");
			Assert.assertEquals(actualcp, cp, "CP data doesn't match");
			System.out.println("Data Matched for CFS & CP Flag :" + " " + cfsflag + " " + cpflag);
		} else if ((cfsflag.equalsIgnoreCase("No") && (cpflag.equalsIgnoreCase("Yes")))) {
			Assert.assertFalse(xpath_Genericmethod_verifyElementPresent(xpath_no_cfs_assigned),
					"Element is present, but expected is element should not be present");
			Assert.assertTrue(xpath_Genericmethod_verifyElementPresent(xpath_cfs_default_NotAvailable),
					"Element is not present, but expected is element should be present");
			Assert.assertEquals(actualcfs, cfs, "CFS data doesn't match");
			Assert.assertEquals(actualcp, cp, "CP data doesn't match");
			System.out.println("Data Matched for CFS & CP Flag :" + " " + cfsflag + " " + cpflag);
		} else if ((cfsflag.equalsIgnoreCase("No") && (cpflag.equalsIgnoreCase("No")))) {
			Assert.assertFalse(xpath_Genericmethod_verifyElementPresent(xpath_no_cfs_assigned),
					"Element is present, but expected is element should not be present");
			Assert.assertTrue(xpath_Genericmethod_verifyElementPresent(xpath_cfs_default_NotAvailable),
					"Element is not present, but expected is element should be present");
			Assert.assertEquals(actualcfs, cfs, "CFS data doesn't match");
			Assert.assertEquals(actualcp, cp, "CP data doesn't match");
			System.out.println("Data Matched for CFS & CP Flag :" + " " + cfsflag + " " + cpflag);
		}else {
			System.out.println("No CFS Assigned to this customer, so assigning organization default CFS");
			Assert.assertFalse(xpath_Genericmethod_verifyElementPresent(xpath_cfs_default_NotAvailable),
					"Element is present, but expected is element should not be present");
			Assert.assertTrue(xpath_Genericmethod_verifyElementPresent(xpath_no_cfs_assigned),
					"Element is not present, but expected is element should be present");
			Assert.assertEquals(actualcfs, cfs, "CFS data doesn't match");
			Assert.assertEquals(actualcp, cp, "CP data doesn't match");
			System.out.println("Data Matched for CFS & CP Flag :" + " " + cfsflag + " " + cpflag);
		}

	}
	
	public void verifyUpdatedCaseStatus(String expectedupdatedcasestatus) throws Exception {
		String updatedstatusxpath="//a[text()='  "+expectedupdatedcasestatus+"  ']";
		boolean casestatus=xpath_Genericmethod_VerifyTextEquals(updatedstatusxpath, expectedupdatedcasestatus);
		Assert.assertTrue(casestatus,"Status of the case is not equal");
		
	}
	
	public void clickOnsendMailLink() throws Exception {
		xpath_GenericMethod_Click(xpath_sendmail_link);
	}
	
	public void clickOnContactPersonBtn() throws Exception {
		xpath_GenericMethod_Click(xpath_selectcp_btn);
	}
	
	public void clickOnContactPersonChkbox() throws Exception {
		Assert.assertTrue(xpath_Genericmethod_verifyElementPresent(xpath_selectcp_chkbox), "Element checkbox for CP is not present");
		xpath_GenericMethod_Click(xpath_selectcp_chkbox);
	}
	
	public void clickOnContactPersonSubmitBtn() throws Exception {
		xpath_GenericMethod_Click(xpath_cp_submit_btn);
	}
	
	public void clickOnPurposeOfEmailBtn(String purposeofemail) throws Exception {
		if(purposeofemail.equalsIgnoreCase("Information Only")) {
		xpath_GenericMethod_Click("//label[contains(@for,'"+purposeofemail+"')]");
		}else if(purposeofemail.equalsIgnoreCase("Pending Response")){
		xpath_GenericMethod_Click("//label[contains(@for,'"+purposeofemail+"')]");
		}else {
			System.out.println("No purpose of email is present");
		}
	}
	
	public void selectEmailDestination(String emaildestination) throws Exception {
		if(xpath_Genericmethod_verifyElementPresent(xpath_email_destination_dd)) {
		xpath_GenericMethod_selectFromDropdownUsingVisibleTextbyclickingOnDropdown(xpath_email_destination_dd, emaildestination);
		}else {
			System.out.println("No Email Destination Field is available");
		}
	}
	
	public void clickOnSendEmailBtn() throws Exception {
		xpath_GenericMethod_Click(xpath_sendemail_btn);
	}
	
	
	
	
}

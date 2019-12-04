package com.cucumber.framework.PageObjects;

public interface GenericCasePageLoc {
	
	String xpath_searchcustomer_dd="//select[@data-test-id='201610190747440120129777']";
	String xpath_customernumber_textbox="//input[@data-test-id='2015052504543705231680']";
    String xpath_searchicon_btn="//i[@name='CPMSearchInHeader_pyDisplayHarness_3']";
    String xpath_threedots_btn="//button[@name='SearchResultsBUGrid_pySearchResults.pxResults(1)_152']";
    String xpath_startresearch_btn="//span[@class='menu-item-title' and text()='Start research']";
    String xpath_addtasks_btn="//button[text()='Add tasks']";
    String xpath_closebtn="//button[@title='Close']";
    String xpath_Addtask_btn1="//div[@class='panelOverFlowClass']";
    String xpath_addtask_btn="//button[@title='Add Task']";
    String xpath_type1_dd="//select[@id='2f904b11']"; 
    String xpath_type2_dd="//select[@id='c7bd997f']";
    String xpath_parties_Org_tab="//h1[text()='Parties & Organization']";
    String xpath_salesorg_dd="//select[@id='66905d38']";
    String xpath_distchnl_dd="//select[@id='02b682c3']";
    String xpath_save_btn="//button[@name='ViewClaimDetailsGC_pyWorkPage_75' and text()='Save']";
    String xpath_genericcase_id="//span[@data-test-id='20160210082412023111408' and contains(text(),'GC-')]";
    String xpath_edit_btn="//button[text()='Edit']";
    String xpath_otheractions_btn="//button[@title='Other actions']";
    String xpath_updatestatus_link="//a/span[@class='menu-item-title-wrap']/span[text()='Update Status']";
    String xpath_updatestatus_dd="//select[@id='c83ab417']"; 
    String xpath_remarksinupdatestatus_textbox="//textarea[@id='9b497c2a' and @data-test-id='20190822121749096547629']";
    String xpath_updatestatus_submit_btn="//button[@id='ModalButtonSubmit' and text()='  Submit ']";
    String xpath_follow_button="//button[@name='pyActionLabelDisplaySection_pyWorkPage_11' and text()='Follow']";
    //Advance customer search xpaths
    String xpath_advancecustomersearch_icon_hover="//li[@title='Customer Search']";
    String xpath_advancecustomersearch_icon_link="//span[@class='menu-item-title' and text()='Customer Search']";
    String xpath_advancecustomernumber_textbox="//input[@id='45bb12ca' and @title='Search case ID']";
    String xpath_advancecustomersearch_button="//button[@title='Search']";
    String xpath_advancetwodots_button="(//*[contains(@id,'$PD_CustomerSearch')]/td[13])[1]";
    String xpath_advancestartresearch_btn="//ul[starts-with(@id,'pyNavigation')]/li[2]/a";
    String xpath_advancecreategenericcase_btn="//ul[starts-with(@id,'pyNavigation')]/li[1]/a";
    //Advance search create generic case xpaths
    String xpath_casedesc_cgc_textbox="//input[@id='28b55c1b']";
    String xpath_type1_cgc_dd="//select[@id='0960fcdd']";
    String xpath_type2_cgc_dd="//select[@id='49313c1e']";
    String xpath_updatestatus_cgc_dd="//select[@id='fa702c8a']";
    String xpath_remarksinupdatestatus_cgc_textbox="//textarea[@id='bdb9cbe6' and @data-test-id='20190822121749096547629']";
    
    //CFS and CP determination xpaths
    String xpath_custno_element="//tbody/tr[@id='$PpySearchResults$ppxResults$l1']/td[1]";
    String xpath_cfs_dd="//select[@id='37faae9b']";
    String xpath_cp_dd="//select[@id='37d826bb']";
    String xpath_cfs_default_NotAvailable="//div[text()='Customer does not have CFS by default  please contact the CFS administrator']";
    String xpath_no_cfs_assigned="//div[text()='Customer does not have CFS  assigned to  please contact the CFS administrator']";
    
    //Email Inbound and Outbound xpaths
    
    String xpath_sendmail_link="//a/span[@class='menu-item-title-wrap']/span[text()='Send mail']";
    String xpath_selectcp_btn="//button[text()='Select CP']";
    String xpath_selectcp_chkbox="//input[@id='39926e3f']";
    String xpath_cp_submit_btn="//button[text()='  Submit ']";
    //String xpath_informationonly_btn="//label[contains(@for,'Information Only')]";
    //String xpath_pendingresponseonly_btn="//label[contains(@for,'Pending Response')]";
    String xpath_email_destination_dd="//select[@id='33701bc1']";
    String xpath_sendemail_btn="//button[text()='Send Email']";
    
    
}

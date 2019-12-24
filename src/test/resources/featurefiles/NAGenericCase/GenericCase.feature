Feature: Generic Case NA

  #Author U.Ramakrishna
  @Smoke_GC_NA @GC_NA_TC1 @Demo
  Scenario Outline: Create a Generic case manually from start search customer using Start research.
    Given Open the browser and navigate to the url
    When I enter username as "<Username>"
    And I enter password as "<Password>"
    And I click on Login button
    Then Login should be successful
    And Select "<Value>" from search results dropdown
    And Enter "<CustomerNumber>" into search field
    When click on Search icon
    Then search results corresponding to "<CustomerNumber>" should be displayed
    When Click on three dots button
    And Click on start research button
    And Hover On Add Task button Pops
    And Click on Add Task button in OtoC
    And Select the required "<ServiceCase>"
    And Click on the Add Tasks button
    And Select values from "<type1>" and "<type2>" and "<type3>" dropdown
    And Click on Parties and Organization tab
    And Select values from "<SalesOrg>" and "<DistChannel>" and "<Division>"
    And Verify the CFS and CP using "<ExpectedCFS>" and "<ExpectedCP>" in generic case
    And Click on Save button
    Then Verify the Generic case is created
    And Click on Edit button
    And Click on OtherActions button
    And Click on UpdateStatus link
    And Select status as "<UpdateStatus>"
    And Click on Submit button in update status pop up
    And Click on Save button
    And Verify the updated case status as "<UpdateStatus>"
    And Verify the remarks updated under Case Status Remarks tab "<UpdateStatus>"
    And Click on Follow button
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username   | Password  | Value     | CustomerNumber | ServiceCase  | type1       | type2 | type3                   | SalesOrg | DistChannel | Division | ExpectedCFS           | ExpectedCP          | UpdateStatus       |
      | SivaNA.CFS | pEGA@1234 | Customers |     0030004423 | Generic Case | Order Entry | RDD   | RDD Change - Compliance | 0001-    | 10-         | 40-      | abhinash kotikalapudi | Manikumar Kosireddi | Resolved-Completed |

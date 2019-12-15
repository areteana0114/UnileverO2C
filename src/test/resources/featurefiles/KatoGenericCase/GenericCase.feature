Feature: Generic Case Creation

  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC1
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
  And Select values from "<type1>" and "<type2>" dropdown
  And Click on Parties and Organization tab
  And Select values from "<SalesOrg>" and "<DistChannel>"
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
  And Click on Follow button
  When I click on Logout button
  And I click on Logout
  Then Logout should be successful
   Examples:
     | Username                             | Password  | Value     | CustomerNumber | ServiceCase  | type1       | type2            | SalesOrg                  | DistChannel           | Division           | ExpectedCFS                   | ExpectedCP | UpdateStatus       |
     | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | 10-Common Division | abhinash kotikalapudi | Mani Kumar            | Resolved-Completed |
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Resolved-Withdrawn |
  #| manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress |
  #| Mohan.Akula@Areteanstech.com | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH      | Pending-Response |
  #
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | New                |
  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC2
  Scenario Outline: Create a Generic case manually from Advance search customer using Start Research.
  Given Open the browser and navigate to the url
  When I enter username as "<Username>"
  And I enter password as "<Password>"
  And I click on Login button
  Then Login should be successful
  And Click on customer search icon in Advance search screen
  And Enter "<CustomerNumber>" into customer number field in Advance search screen
  When Click on Search button in Advance search screen
  #Then search results corresponding to "<CustomerNumber>" should be displayed
  When Click on two dots button in Advance search screen
  And Click on start research button in Advance search screen
  And Hover On Add Task button Pops
  And Click on Add Task button in OtoC
  And Select the required "<ServiceCase>"
  And Click on the Add Tasks button
  And Select values from "<type1>" and "<type2>" dropdown
  And Click on Parties and Organization tab
  And Select values from "<SalesOrg>" and "<DistChannel>"
  And Click on Save button
  Then Verify the Generic case is created
  And Click on Edit button
  And Click on OtherActions button
  And Click on UpdateStatus link
  And Select status as "<UpdateStatus>"
  And Click on Submit button in update status pop up
  And Click on Save button
  And Verify the updated case status as "<UpdateStatus>"
  And Click on Follow button
  When I click on Logout button
  And I click on Logout
  Then Logout should be successful
  Examples:
  | Username                             | Password  | Value     | CustomerNumber | ServiceCase  | type1       | type2            | SalesOrg                  | DistChannel           | UpdateStatus       |
  | manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Resolved-Completed |
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Resolved-Withdrawn |
  #| manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress |
  #
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Pending-Response   |
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | New                |
  #Author U.Ramakrishna
  #@Smoke_GC_Kato @GC_Kato_TC3
  Scenario Outline: Create a Generic case manually from Advance search customer using Create Generic Case.
  Given Open the browser and navigate to the url
  When I enter username as "<Username>"
  And I enter password as "<Password>"
  And I click on Login button
  Then Login should be successful
  And Click on customer search icon in Advance search screen
  And Enter "<CustomerNumber>" into customer number field in Advance search screen
  When Click on Search button in Advance search screen
  # Then search results corresponding to "<CustomerNumber>" should be displayed
  When Click on two dots button in Advance search screen
  And Click on create generic case button in Advance search screen
  And Select values from "<type1>" and "<type2>" dropdown in create generic case
  # And Click on Parties and Organization tab
  # And Select values from "<SalesOrg>" and "<DistChannel>"
  And Click on Save button
  Then Verify the Generic case is created
  And Click on Edit button
  And Click on OtherActions button
  And Click on UpdateStatus link
  Given Select status as "<UpdateStatus>" in the Create Generic Case"
  And Click on Submit button in update status pop up
  And Click on Save button
  And Verify the updated case status as "<UpdateStatus>"
  And Click on Follow button
  When I click on Logout button
  And I click on Logout
  Then Logout should be successful
  Examples:
  | Username                     | Password    | Value     | CustomerNumber | ServiceCase  | type1            | type2                           | SalesOrg                  | DistChannel | UpdateStatus       |
  | manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Resolved-Completed |
  #| Mohan.Akula@Areteanstech.com | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH      | Resolved-Withdrawn |
  #
  #| manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress |
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Pending-Response   |
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | New                |
  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC4
  Scenario Outline: Determine the CFS and CP for Generic case created manually from start search customer using Start research.
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
  And Select values from "<type1>" and "<type2>" dropdown
  And Click on Parties and Organization tab
  And Select values from "<SalesOrg>" and "<DistChannel>"
  And Verify the CFS and CP using "<CFS>" and "<CP>" and "<CFSFlag>" and "<CPFlag>" in generic case
  And Click on Save button
  Then Verify the Generic case is created
  And Click on Edit button
  And Click on OtherActions button
  And Click on UpdateStatus link
  And Select status as "<UpdateStatus>"
  And Click on Submit button in update status pop up
  And Click on Save button
  And Verify the updated case status as "<UpdateStatus>"
  And Click on Follow button
  When I click on Logout button
  And I click on Logout
  Then Logout should be successful
  Examples:
  | Username                             | Password  | Value     | CustomerNumber | ServiceCase  | type1       | type2            | SalesOrg                  | DistChannel           | Division           | CFS                   | CP | UpdateStatus       | CFSFlag | CPFlag |
     | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | 10-Common Division | abhinash kotikalapudi | Mani Kumar            | Resolved-Completed | Yes     | Yes    |
  #   | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 22-OOH                | 10-Common Division | manikumar kosireddi   | Abhinash Kotikalapudi | Resolved-Completed | No      | No     |
  #| manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0001001769 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | 10-Common Division | abhinash kotikalapudi |    | New                | No      | No     |
  #| manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0001001769 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 21-Foodsolutions      | 10-Common Division | Sofie Dummy           |    | Resolved-Completed |         |        |
  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC6
  Scenario Outline: Email Outbound for Generic case created manually from start search customer using Start research.
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
  And Select values from "<type1>" and "<type2>" dropdown
  And Click on Parties and Organization tab
  And Select values from "<SalesOrg>" and "<DistChannel>"
  And Verify the CFS and CP using "<CFS>" and "<CP>" and "<CFSFlag>" and "<CPFlag>" in generic case
  And Click on Save button
  Then Verify the Generic case is created
  And Click on Edit button
  And Click on OtherActions button
  And Click on SendMail link
  And Click on Contact Person button
  And Select Contact Person checkbox
  And Click on Contact Person Submit button
  And Select purpose of email "<PurposeOfEmail>"
  And Select email destination "<EmailDestination>" from dropdown
  And Click on sendmail button
  And Click on Save button
  And Verify the updated case status as "<UpdateStatus>"
  And Click on Follow button
  When I click on Logout button
  And I click on Logout
  Then Logout should be successful
   Examples:
   | Username                             | Password  | Value     | CustomerNumber | ServiceCase  | type1       | type2            | SalesOrg                  | DistChannel | Division           | CFS                   | CP         | UpdateStatus     | CFSFlag | CPFlag | PurposeOfEmail   | EmailDestination |
    | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000511172 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 22-OOH      | 10-Common Division | abhinash kotikalapudi | Mani Kumar | New              | No      | No     | Information Only |                  |
   | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000511172 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 22-OOH      | 10-Common Division | abhinash kotikalapudi | Mani Kumar | Pending-Response | No      | No     | Pending Response | Customer         |
  #  | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 22-OOH                | 10-Common Division | manikumar kosireddi   | Abhinash Kotikalapudi | New          | No      | No     |
  # | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0001001769 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | 10-Common Division | abhinash kotikalapudi |    | New | No      | No     |
  # | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0001001769 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 21-Foodsolutions      | 10-Common Division | Sofie Dummy           |    | New |         |        |
  #Author U.Ramakrishna
  #@Smoke_GC_Kato @GC_Kato_TC7
  #Scenario Outline: Email Inbound for Generic case created manually from start search customer using Start research.
  #Given Open the browser and navigate to the url
  #When I enter username as "<Username>"
  #And I enter password as "<Password>"
  #And I click on Login button
  #Then Login should be successful
  #And Select "<Value>" from search results dropdown
  #And Enter "<CaseId>" into search field
  #When click on Search icon
  #Then search results corresponding to "<CaseId>" should be displayed
  #When Click on three dots button in search with case id
  #And Click on start research button
  #And Verify the updated case status as "<UpdateStatus>"
  #And Click on Email Information tab
  #And Verify the reply email attachment is present for "<CaseId>"
  #When I click on Logout button
  #And I click on Logout
  #Then Logout should be successful
  #Examples:
  #| Username                             | Password  | Value | CaseId  | UpdateStatus       |
  #| manikumar.kosireddi@Areteanstech.com | Rules@123 | Cases | GC-3808 | Pending-InProgress |
  #| manikumar.kosireddi@Areteanstech.com | Rules@123 | Cases | GC-3807 | Pending-Response   |
  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC5
  Scenario Outline: Verify Message "Case can`t be created" when no CFS is assigned
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
  And Verify the message case cannot be created "<Message>"
  When I click on Logout button
  And I click on Logout
  Then Logout should be successful
  Examples:
  | Username                             | Password  | Value     | CustomerNumber | ServiceCase  | Message |
  | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0090003099 | Generic Case | Case can`t be created. Customer does not have any CFS assigned, please contact the CFS administrator        |
  #Author U.Ramakrishna
  #@Smoke_GC_Kato @GC_Kato_TC8
  #Scenario Outline: Case Status and Case responsible verification for Generic Case.
  #Given Open the browser and navigate to the url
  #When I enter username as "<Username1>"
  #And I enter password as "<Password1>"
  #And I click on Login button
  #Then Login should be successful
  #And Select "<Value>" from search results dropdown
  #And Enter "<CustomerNumber>" into search field
  #When click on Search icon
  #Then search results corresponding to "<CustomerNumber>" should be displayed
  #When Click on three dots button
  #And Click on start research button
  #And Hover On Add Task button Pops
  #And Click on Add Task button in OtoC
  #And Select the required "<ServiceCase>"
  #And Click on the Add Tasks button
  #And Select values from "<type1>" and "<type2>" dropdown
  #And Click on Parties and Organization tab
  #And Select values from "<SalesOrg>" and "<DistChannel>"
  #And Click on Save button
  #Then Verify the Generic case is created
  #And Click on Edit button
  #And Click on OtherActions button
  #And Click on UpdateStatus link
  #And Select status as "<UpdateStatus1>"
  #And Click on Submit button in update status pop up
  #And Click on Save button
  #And Verify the updated case status as "<UpdateStatus1>"
  #And Click on Edit button
  #And Click on Assign To button
  #And Click on Assign To CFS button
  #When I click on Logout button
  #And I click on Logout
  #Then Logout should be successful
  #When I enter username as "<Username2>"
  #And I enter password as "<Password2>"
  #And I click on Login button
  #Then Login should be successful
  #And Click on case id in My Cases tab
  #And Click on Edit button
  #And Click on OtherActions button
  #And Click on UpdateStatus link
  #And Select status as "<UpdateStatus2>"
  #And Click on Submit button in update status pop up
  #And Click on Save button
  #And Verify the updated case status as "<UpdateStatus2>"
  #And Click on Edit button
  #And Click on Assign To button
  #And Click on Assign To Previous Assignee
  #And Select the previous Assignee "<PrevoiusAssignee>" and click on submit
  #When I click on Logout button
  #And I click on Logout
  #Then Logout should be successful
  #When I enter username as "<Username1>"
  #And I enter password as "<Password1>"
  #And I click on Login button
  #Then Login should be successful
  #And Click on case id in My Cases tab
  #And Click on Edit button
  #And Click on OtherActions button
  #And Click on UpdateStatus link
  #And Select status as "<UpdateStatus3>"
  #And Click on Submit button in update status pop up
  #And Click on Save button
  #And Verify the updated case status as "<UpdateStatus3>"
  #And Click on Edit button
  #And Click on Assign To button
  #And Click on Assign To New Assignee
  #When I click on Logout button
  #And I click on Logout
  #Then Logout should be successful
  #
  #Examples:
  #| Username1                            | Password1 | Value     | CustomerNumber | ServiceCase  | type1       | type2            | SalesOrg                  | DistChannel           | UpdateStatus1      | Username2                              | Password2 | UpdateStatus2    |
  #| manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress | abhinash.kotikalapudi@Areteanstech.com | Pega1234$ | Pending-Response |
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Resolved-Withdrawn |
  #| manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress |
  #| Mohan.Akula@Areteanstech.com | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH      | Pending-Response |
  #
  #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | New                |
  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC9
  Scenario Outline: Generic case Routing to CFS using Assign To CFS option.
    Given Open the browser and navigate to the url
    When I enter username as "<Username1>"
    And I enter password as "<Password1>"
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
    And Select values from "<type1>" and "<type2>" dropdown
    And Click on Parties and Organization tab
    And Select values from "<SalesOrg>" and "<DistChannel>"
    And Click on Save button
    Then Verify the Generic case is created
    And Click on Edit button
    And Click on OtherActions button
    And Click on UpdateStatus link
    And Select status as "<UpdateStatus>"
    And Click on Submit button in update status pop up
    And Click on Save button
    And Verify the updated case status as "<UpdateStatus>"
    And Click on Edit button
    And Click on Assign To button
    And Click on Assign To CFS button
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful
    When I enter username as "<Username2>"
    And I enter password as "<Password2>"
    And I click on Login button
    Then Login should be successful
    And Click on case id in My Cases tab
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username1                            | Password1 | Value     | CustomerNumber | ServiceCase  | type1       | type2            | SalesOrg                  | DistChannel           | UpdateStatus       | Username2                              | Password2 |
      | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress | abhinash.kotikalapudi@Areteanstech.com | Pega1234$ |

  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC10
  Scenario Outline: Generic case Routing to Previous Assignee using Assign to Previous Assignee Option.
    Given Open the browser and navigate to the url
    When I enter username as "<Username1>"
    And I enter password as "<Password1>"
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
    And Select values from "<type1>" and "<type2>" dropdown
    And Click on Parties and Organization tab
    And Select values from "<SalesOrg>" and "<DistChannel>"
    And Click on Save button
    Then Verify the Generic case is created
    And Click on Edit button
    And Click on OtherActions button
    And Click on UpdateStatus link
    And Select status as "<UpdateStatus1>"
    And Click on Submit button in update status pop up
    And Click on Save button
    And Verify the updated case status as "<UpdateStatus1>"
    And Click on Edit button
    And Click on Assign To button
    And Click on Assign To CFS button
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful
    When I enter username as "<Username2>"
    And I enter password as "<Password2>"
    And I click on Login button
    Then Login should be successful
    And Click on case id in My Cases tab
    And Click on Edit button after launching case from Mycases or MyWorkBasket tab
    And Click on OtherActions button
    And Click on UpdateStatus link
    Given Select status as "<UpdateStatus2>" in the Create Generic Case"
    And Click on Submit button in update status pop up
    And Click on Save button
    And Verify the updated case status as "<UpdateStatus2>"
    And Click on Edit button after launching case from Mycases or MyWorkBasket tab
    And Click on Assign To button
    And Click on Assign To Previous Assignee
    And Select the previous Assignee "<PrevoiusAssignee>" and click on submit
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful
    When I enter username as "<Username1>"
    And I enter password as "<Password1>"
    And I click on Login button
    Then Login should be successful
    And Click on case id in My Cases tab
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username1                            | Password1 | Value     | CustomerNumber | ServiceCase  | type1       | type2            | SalesOrg                  | DistChannel           | UpdateStatus1      | Username2                              | Password2 | UpdateStatus2    | PrevoiusAssignee                     |
      | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress | abhinash.kotikalapudi@Areteanstech.com | Pega1234$ | Pending-Response | manikumar.kosireddi@Areteanstech.com |

  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC11 @Reg
  Scenario Outline: Generic case Routing to New Assignee using Assign to New Assignee Option.
    Given Open the browser and navigate to the url
    When I enter username as "<Username1>"
    And I enter password as "<Password1>"
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
    And Select values from "<type1>" and "<type2>" dropdown
    And Click on Parties and Organization tab
    And Select values from "<SalesOrg>" and "<DistChannel>"
    And Click on Save button
    Then Verify the Generic case is created
    And Click on Edit button
    And Click on OtherActions button
    And Click on UpdateStatus link
    And Select status as "<UpdateStatus1>"
    And Click on Submit button in update status pop up
    And Click on Save button
    And Verify the updated case status as "<UpdateStatus1>"
    And Click on Edit button
    And Click on Assign To button
    And Click on Assign To New Assignee
    And Select the New Assignee "<NewAssignee>" and click on submit
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful
    When I enter username as "<Username2>"
    And I enter password as "<Password2>"
    And I click on Login button
    Then Login should be successful
    And Click on case id in My Cases tab
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username1                            | Password1 | Value     | CustomerNumber | ServiceCase  | type1       | type2            | SalesOrg                  | DistChannel           | UpdateStatus1      | Username2                              | Password2 | UpdateStatus2    | NewAssignee                            |
      | manikumar.kosireddi@Areteanstech.com | Rules@123 | Customers |     0000088243 | Generic Case | Order Entry | Additional Order | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress | abhinash.kotikalapudi@Areteanstech.com | Pega1234$ | Pending-Response | abhinash.kotikalapudi@Areteanstech.com |

  #Author U.Ramakrishna
  #@Smoke_GC_Kato @GC_Kato_TC11 @Reg
  #Scenario Outline: Generic case Routing Verify the case is routed to correct New Assignee worklist.
  #Given Open the browser and navigate to the url
  #When I enter username as "<Username2>"
  #And I enter password as "<Password2>"
  #And I click on Login button
  #Then Login should be successful
  #And Click on case id in My Cases tab
  #When I click on Logout button
  #And I click on Logout
  #Then Logout should be successful
  #
  #Examples:
  #| Username2                              | Password2 |
  #| abhinash.kotikalapudi@Areteanstech.com | Pega1234$ |
  #
  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC12 @Reg
  Scenario Outline: Generic case Routing to Workbasket using Assign to Workbasket Option.
    Given Open the browser and navigate to the url
    When I enter username as "<Username1>"
    And I enter password as "<Password1>"
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
    And Select values from "<type1>" and "<type2>" dropdown
    And Click on Parties and Organization tab
    And Select values from "<SalesOrg>" and "<DistChannel>"
    And Click on Save button
    Then Verify the Generic case is created
    And Click on Edit button
    And Click on OtherActions button
    And Click on UpdateStatus link
    And Select status as "<UpdateStatus1>"
    And Click on Submit button in update status pop up
    And Click on Save button
    And Verify the updated case status as "<UpdateStatus1>"
    And Click on Edit button
    And Click on Assign To button
    And Click on Assign To Workbasket link
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful
    When I enter username as "<Username2>"
    And I enter password as "<Password2>"
    And I click on Login button
    Then Login should be successful
    And Click on My Workbasket tab in Home page
    And Select workbasket "<WorkBasket>" from view Queue for dropdown and click on case id "<CaseId>"
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username1                              | Password1 | Value     | CustomerNumber | ServiceCase  | type1            | type2         | SalesOrg                  | DistChannel           | UpdateStatus1      | Username2                            | Password2 | UpdateStatus2    | WorkBasket                         |
      | abhinash.kotikalapudi@Areteanstech.com | Pega1234$ | Customers |     0000431023 | Generic Case | Customer Billing | Output Issues | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress | manikumar.kosireddi@Areteanstech.com | Rules@123 | Pending-Response | UnileverO2C:Process control basket |
  #Author U.Ramakrishna
  #@Smoke_GC_Kato @GC_Kato_TC13 @Reg
  #Scenario Outline: Generic case Routing Verify the case is routed to correct workbasket.
    #Given Open the browser and navigate to the url
    #When I enter username as "<Username1>"
    #And I enter password as "<Password1>"
    #And I click on Login button
    #Then Login should be successful
    #And Click on My Workbasket tab in Home page
    #And Select workbasket "<WorkBasket>" from view Queue for dropdown and click on case id "<CaseId>"
    #When I click on Logout button
    #And I click on Logout
    #Then Logout should be successful
#
    #Examples: 
      #| Username1                            | Password1 | WorkBasket                         | CaseId  |
      #| manikumar.kosireddi@Areteanstech.com | Rules@123 | UnileverO2C:Process control basket | GC-3935 |


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
    And Click on Save button
    Then Verify the Generic case is created
    And Click on Edit button
    And Click on OtherActions button
    And Click on UpdateStatus link
    And Select status as "<UpdateStatus>"
    And Click on Submit button in update status pop up
    And Click on Save button
    And Click on Follow button
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username                             | Password    | Value     | CustomerNumber | ServiceCase  | type1            | type2                           | SalesOrg                  | DistChannel           | UpdateStatus       |
     # | manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Resolved-Completed |
      | Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Resolved-Withdrawn |
      #| manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress |
      #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Pending-Response   |
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
   # Then search results corresponding to "<CustomerNumber>" should be displayed
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
    And Click on Follow button
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username                             | Password    | Value     | CustomerNumber | ServiceCase  | type1            | type2                           | SalesOrg                  | DistChannel           | UpdateStatus       |
      #| manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Resolved-Completed |
      #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Resolved-Withdrawn |
      #| manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress |
      #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Pending-Response   |
      | Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | New                |

  #Author U.Ramakrishna
  @Smoke_GC_Kato @GC_Kato_TC3
  Scenario Outline: Create a Generic case manually from Advance search customer using Create Generic Case.
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
    And Click on create generic case button in Advance search screen
    And Select values from "<type1>" and "<type2>" dropdown in create generic case
    #And Click on Parties and Organization tab
    #And Select values from "<SalesOrg>" and "<DistChannel>"
    And Click on Save button
    Then Verify the Generic case is created
    And Click on Edit button
    And Click on OtherActions button
    And Click on UpdateStatus link
    Given Select status as "<UpdateStatus>" in the Create Generic Case"
    And Click on Submit button in update status pop up
    And Click on Save button
    And Click on Follow button
    When I click on Logout button
    And I click on Logout
    Then Logout should be successful

    Examples: 
      | Username                             | Password    | Value     | CustomerNumber | ServiceCase  | type1            | type2                           | SalesOrg                  | DistChannel           | UpdateStatus       |
      | manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Resolved-Completed |
      #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Resolved-Withdrawn |
      #| manikumar.kosireddi@Areteanstech.com | Rules@123   | Customers |     0000088243 | Generic Case | Order Entry      | Additional Order                | 1300-MSO Unilever Germany | 20-Sales Transactions | Pending-InProgress |
      #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | Pending-Response   |
      #| Mohan.Akula@Areteanstech.com         | Rules@12345 | Customers |     0000431023 | Generic Case | Order Validation | Order Modification - Item Level | 1300-MSO Unilever Germany | 22-OOH                | New                |

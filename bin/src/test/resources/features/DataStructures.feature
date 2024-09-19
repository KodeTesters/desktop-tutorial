@DataStructureFeature
Feature: DataStructure Testing


Scenario: 
    Given The user is on the DsAlgo Signin Page
    When The user enter valid "kodetester" and "numpyninja24"
    Then The user click on login button

  Scenario: User signs in successfully
    Given The user is on the DsAlgo Signin Page
    When The user enter valid "kodetester" and "numpyninja24"
    Then The user click on login button
    

  Scenario: DataStructure Module
    Given The user is on the DsAlgo Home Page
    When user clicks Getting Started button in DataStructures module
    Then user should be directed to DataStructures overview Page

  Scenario: DataStructure Module-Time Complexity
    When user clicks Time Complexity
    Then user is redirected to Time Complexity page
    Then user clicks Try Here button

  Scenario: The user runs the code in tryEditor with valid input for Time Complexity in DataStructures page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('DataStructure Time Complexity')"
    And user click on Run button
    Then The user should be presented with the Run

  Scenario: The user runs the code in tryEditor with invalid input for Time Complexity in DataStructures page
    When The user Enter invalid python code in tryEditor from sheet "print(DataStructure Time Complexity)"
    And user click on a Run button
    Then The user get the error message  

  Scenario: Alert Window in Time Complexity
    When The user enters incomplete code in the tryEditor
    And The user clicks the run button
    Then The user should be presented with an alert window

  Scenario: Clearing the alert window
    When The user clicks the OK button in the alert window
    Then The alert window should be cleared
    Then Theuser should be able to enter the correct code in the tryEditor
  

  Scenario: Practice Questions in DataStructures
    Given The user is on the Data Structures Introduction Page
    When The user clicks on the Practice Questions button
    Then The user should be redirected to the Practice Questions Page
    

 Scenario:The user navigates through Dropdown
    Given The user is on the Data Structures Introduction Page
    When The user clicks on the DataStructures Introduction dropdown
    Then The modules in the dropdown should be displayed

Scenario: The user navigates to Stack from dropdown
    When The user clicks on the Stack module
    Then The user should be redirected to the Stack module

Scenario: The user navigates to Queue from dropdown
    When The user clicks on the Queue module
    Then The user should be redirected to the Queue module
    
Scenario: The user navigates to Linked List from dropdown
    When The user clicks on the Linked List module
    Then The user should be redirected to the Linked List module
    
Scenario: The user navigates to Tree from dropdown
    When The user clicks on the Tree module
    Then The user should be redirected to the Tree module

Scenario: The user navigates to Graph from dropdown
    When The user clicks on the Graph module
    Then The user should be redirected to the Graph module
    
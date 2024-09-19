@StackFeature
Feature: Stack Testing


  Scenario: 
    Given The user is on the DsAlgo Signin Page
    When The user enter valid "kodetester" and "numpyninja24"
    Then The user click on login button

  Scenario: User signs in successfully
    Given The user is on the DsAlgo Signin Page
    When The user enter valid "kodetester" and "numpyninja24"
    Then The user click on login button
    

  Scenario: Stack Module-Operations in Stack
    Given The user is on the DsAlgo Home Page
    When user clicks Getting Started button in Stack module
    Then user should be directed to Stack overview Page

  Scenario: Stack Module-Operations try here in Stack
    When user clicks Operations in Stack
    Then user is redirected to Opeartions in Stack page
    Then user clicks Try Here button

  Scenario: The user run the code in tryEditor with valid input for Operations in Stack page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run

Scenario: The user run the code in tryEditor with invalid input for Operations in Stack page
    When The user Enter invalid python code in tryEditor from sheet "print(hello world)"
    And user click on a Run button
    Then The user get the error message

 Scenario: Stack Module-Implementation
    Given The user is on the Stack Home Page
    When user clicks Implementation
    Then user is redirected to implementation page
    Then user clicks Try Here button

 Scenario: The user run the code in tryEditor with valid input for implementation
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('stack implementation')"
    And user click on Run button
    Then The user should be presented with the Run

  Scenario: The user run the code in tryEditor with invalid input for implementation
    When The user Enter invalid python code in tryEditor from sheet "print(stack implementation)"
    And user click on a Run button
    Then The user get the error message

 Scenario: Stack Module-Applications
    Given The user is on the Stack Home Page
    When user clicks Applications
    Then user is redirected to Applications page
    Then user clicks Try Here button
    
Scenario: The user run the code in tryEditor with valid input for Applications
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('stack applications')"
    And user click on Run button
    Then The user should be presented with the Run

Scenario: The user run the code in tryEditor with invalid input for Applications
    When The user Enter invalid python code in tryEditor from sheet "print(stack implementation)"
    And user click on a Run button
    Then The user get the error message

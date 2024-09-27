@Stack
Feature: Testing Stack Module
Scenario: signin Module

Scenario: The user is logged in to DS Algo portal
  Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage
    Scenario: stack module
    Given      user should clicks the Getting Started button in Stack
      Then   The user is in the Stack page after logged 
     When   user clicks Operations in Stack button 
    Then   user should be directed to Operations in Stack Page
      Then The user clicks Try Here button
Scenario: The user run the code in tryEditor with valid input for Operations of Stack page
Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message
    @Implementation
      Scenario: user on Implementation page
       Given user is on Operations in stack page
       When  user clicks Implementation button
       Then  user should be directed to Implementation Page
       Then The user clicks Try Here button
Scenario: The user run the code in tryEditor with valid input for Implementation Stack page
Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message
    Scenario: user is on Application page 
    Given user is on Implementation page
    When user clicks Application button
       Then  user should be directed to Application Page
    Then The user clicks Try Here button
Scenario: The user run the code in tryEditor with valid input for Applications Stack page
Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message
    
     Scenario: The user validating "Practice Questions" page
    Given user in Stack page
    When The user clicks Practice Questions button of Stack page
    Then The user should be directed to Practice page
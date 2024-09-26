
@graph
Feature: Testing graph page on DSalgo aplliction

  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetes" and "numpymimja24"
    And The user click on login button
    Then The user redirected to homepage

  Scenario: Graph Module
    Given user is in the Home page after logged in
    When user clicks Getting Started button in Graph module
    Then  user should be directed to Graph overview Page
    When  user clicks Graph
    Then user is redirected to Graph page
    Then  user clicks Try Here button
  Scenario: The user run the code in tryEditor with valid input for Graph page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @representation
  Scenario:   user is navigated to Graph page
    Given user is navigated to Graph page
    When user clicks graphical representation
    Then  user clicks tryhere
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message
  Scenario: The user validating "Practice Questions" page
    Given user in Graph page
    When The user clicks Practice Questions button of Graph page
    Then The user should be directed to Practice page


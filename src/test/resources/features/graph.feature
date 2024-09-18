@Graph
Feature: Graph Testing

  Scenario: User signs in successfully
    Given The user is on the login Page
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user should be redirected to Ds Algo Home Page

  Scenario: Graph Module
    Given The user is on the DsAlgo Home Page
    When user clicks Getting Started button in Graph module
    Then user should be directed to Graph overview Page
    When user clicks Graph
    Then user is redirected to Graph page
    Then user clicks Try Here button

  Scenario: The user run the code in tryEditor with valid input for Graph page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from data "print=heloo world"
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

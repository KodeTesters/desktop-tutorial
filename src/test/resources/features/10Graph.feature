@graph
Feature: Testing graph page on DSalgo aplliction

  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage

  Scenario: Graph Module
    Given user is in the Home page after logged in
    When user clicks Getting Started button in Graph module
    Then  user should be directed to Graph overview Page
    When  user clicks Graph
    Then user is redirected to Graph page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @representation
  Scenario:   user is navigated to Graph page
    Given user is navigated to Graph page
    When user clicks graphical representation
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  Scenario: The user validating "Practice Questions" page
    Given user in Graph page
    When The user clicks Practice Questions button of Graph page
    Then The user should be directed to Practice page

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
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @Implementation
  Scenario: user on Implementation page
    Given user is on Operations in stack page
    When  user clicks Implementation button
    Then  user should be directed to Implementation Page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  Scenario: user is on Application page
    Given user is on Implementation page
    When user clicks Application button
    Then  user should be directed to Application Page
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
    Given user in Stack page
    When The user clicks Practice Questions button of Stack page
    Then The user should be directed to Practice page

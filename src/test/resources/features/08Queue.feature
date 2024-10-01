@tag
Feature: Queue feature
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage
  Scenario: Queue module
    When user clicks on the "Get Started" button in Queue pane or select Queue item from drop down menu

    Then user is redirected to Queue Data Structure page
    #The user clicks Implementation of Queue in Python
    When The user clicks Implementation of Queue in Python link
    Then The user is redirected to Implementation of Queue in Python page
  @try_here
  Scenario: Trying the python code
    Given User is on Implementation of Queue in Python page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  Scenario: Implementation using collections
    Given User is on Implementation of Queue in Python page
    When The user clicks on Implementation using collections.deque link
    Then user is redirected to Implementation using collections.deque page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed


  Scenario: Implementation using array
    Given User is on Implementation using collections page
    When The user clicks on Implementation using array link
    Then user is redirected to Implementation using array page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed


  Scenario: Queue Operations
    Given User is on Implementation using array page
    When The user clicks on Queue Operations link
    Then user is redirected to Queue Operations page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  Scenario: Practice Questions
    Given user is on Queue Operations page
    When user clicks on Practice Questions link
    Then user is redirected to Practice Questions


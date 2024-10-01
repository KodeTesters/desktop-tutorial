Feature: Testing data structure Module
  Scenario: Data structure
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage
    When user clicks Get started button below Data Structure homepage
    Then  user should land in Data Structures- Introduction Page
    When  user clicks Time Complexity button
    Then  user should  redirected to time complexity of Data structures-Introduction
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  Scenario: user is in data structure intro page
    Given  user is in the Data structures-Introduction page
    When  user clicks the Practice Questions button
    Then user should be redirected to Practice Questions of Data structures-Introduction
#And capture the screenshot

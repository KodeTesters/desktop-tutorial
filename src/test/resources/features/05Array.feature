@array
Feature: Array feature

  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage

  Scenario: Select array DS with Get Started button or select array from dropdown
    Given: user is navigated to home page
    When user clicks on the "Get Started" button in Array pane or select Array item from drop down menu
    Then user is redirected to Array Data Structure page
  @arr_01
  Scenario: Arrays on Python page
    Given user is on Array Data Structure page
    #The user clicks Arrays in Python
    When The user clicks Arrays in Python link
    Then The user is redirected to Arrays in Python page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
 # invalidcode
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @arr_02
  Scenario: Arrays Using List
    Given User is on Arrays Using python page
    When The user clicks on Arrays Using List link
    Then user is redirected to Arrays Using List page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
 # user enters  invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @arr_03
  Scenario: Basic Operations In List
    Given User is on Arrays Using List page
    When The user clicks on Basic Operations In List link
    Then user is redirected to Basic Operations In List page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @arr_04
  Scenario: Applications of Array
    Given User is on Basic Operations In List Page
    When The user clicks on Applications of Array link
    Then user is redirected to Applications of Array page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
 # User enters invalid code

    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @arr_05
  Scenario: Practice Questions to Search the Array link
    Given User is on Arrays on python Page
    When The user clicks on Practice Questions link
    Then user is redirected to practice page
    Then user clicks on Search the array link
    Then user is redirected to questions1 page

    # user enters code and click run button

    When user enters code "print(hello)" in questions1 page
    Then An alert message should be displayed in questions1 page

    When user clicks submit button in questions1 page
    Then submission output is displayed on in questions1 page
  @arr_07
  Scenario:  Max Consecutive Ones page
    Given The user is on the Practice page
    When The user clicks Max Consecutive Ones link
    Then The user should be redirected to question2 page

    When user enters code "print(hello)" in questions2 page
    Then An alert message should be displayed in questions2 page

    When user clicks submit button in questions2 page
    Then submission output is displayed on in questions2 page
  @arr_08
  Scenario:  Find Numbers with Even Number of Digits page
    Given The user is on the Practice page for Find Numbers with Even Number of Digits
    When The user clicks Find Numbers with Even Number of Digits link
    Then The user should be redirected to questions3 page

    When user enters code "print(hello)" in questions3 page
    Then An alert message should be displayed in questions3 page

    When user clicks submit button in questions3 page
    Then submission output is displayed on in questions3 page
  @arr_09
  Scenario:  Squares of a Sorted Array page
    Given The user is on the Practice page for Squares of a Sorted Array page
    When user clicks Squares of  a Sorted Array link
    Then user is redirected to questions4 page

    When user enters code "print(hello)" in questions4 page
    Then An alert message should be displayed in questions4 page

    When user clicks submit button in questions4 page
    Then submission output is displayed on in questions4 page
    Then click signout for Array page



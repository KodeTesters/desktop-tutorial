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
    When user clicks Try Here button in Arrays in Python page
    Then user is redirected to a page having a TryEditor with Run button for Arrays on python
    When user enters valid code "print('hello world')" for Arrays on python page
    And clicks Run button for Arrays on python page
    Then page displays output for Arrays on python page
 # invalidcode
  Scenario: user enters invalid code
    Given user is on tryEditor page for Arrays on python page
    When The user enters invalid python code "'abc' = 1" for Arrays on python page
    And Clicks Run button for Arrays on python page
    Then  Alert message should be displayed for Arrays on python page
  @arr_02
  Scenario: Arrays Using List
    Given User is on Arrays Using python page
    When The user clicks on Arrays Using List link
    Then user is redirected to Arrays Using List page
    When user clicks Try Here button in Arrays using List page
    Then user is redirected to a page having a TryEditor with Run button Arrays using List
    When user enters valid code "print('hello world')" for Arrays Using List page
    And clicks Run button for Arrays Using List page
    Then page displays output for Arrays Using List page
 # invalidcode
  Scenario: user enters invalid code
    Given user is on tryEditor page for Arrays Using List page
    When The User enters invalid python code "'abc' = 1" for Arrays Using List page
    And user clicks Run button for Arrays Using List page
    Then An Alert message should be displayed for Arrays Using List page
  @arr_03
  Scenario: Basic Operations In List
    Given the User is on Arrays Using List page
    When The user clicks on Basic Operations In List link
    Then user is redirected to Basic Operations In List page
    When user clicks Try Here button in Basic Operations In List page
    Then User is redirected to a page having a TryEditor with Run button Basic Operations In List
    When user enters valid code "print('hello world')" for Basic Operations In List page
    And clicks Run button for Basic Operations In List page
    Then page displays output for Basic Operations In List page
 # invalidcode
  Scenario: user enters invalid code
    Given User is on tryEditor page for Basic Operations In List page
    When The User enters invalid python code "'abc = 1" for Basic Operations In List page
    And User clicks Run button for Basic Operations In List page
    Then An Alert message should be displayed for Basic Operations In List page
  @arr_04
  Scenario: Applications of Array
    Given User is on Basic Operations In List Page
    When The user clicks on Applications of Array link
    Then user is redirected to Applications of Array page
    When user clicks Try Here button in Applications of Arraypage
    Then user is redirected to a page having a TryEditor with Run button Basic Operations In List
    When user enters valid code "print('hello world')" for Applications of Arraypage
    And clicks Run button for Applications of Arraypage
    Then page displays output for Applications of Arraypage
 # invalidcode
  Scenario: user enters invalid code
    Given user is on tryEditor page for Applications of Arraypage
    When The user enters invalid python code "'abc' = 1" for Applications of Arraypage
    And clicks Run button for Applications of Arraypage
    Then An alert message should be displayed for Applications of Arraypage
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

    #Then user is redirected to practice page
    #Then user clicks Max Consecutive Ones link
    #Then user is redirected to questions2 page
    #Then user clicks Find Numbers with Even Number of Digits link
    #Then user is redirected to questions3 page
    #Then user clicks Squares of  a Sorted Array link
    #Then user is redirected to questions4 page


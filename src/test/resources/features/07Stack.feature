@Stack
Feature: Stack feature 
Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage


    
    Scenario: Select stack DS with Get Started button or select stack from dropdown
    Given: user is navigated to home page 
    When user clicks on the "Get Started" button in Stack page or select Stack item from drop down menu
    Then user is redirected to Array Data Structure page  
    @stack_01
    Scenario: Operations in Stack page
    Given user is on Stack Data Structure page 
    #The user clicks Operations in Stack
    When The user clicks Operations in Stack link
    Then The user is redirected to Operations in Stack page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')" 
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"  
    And clicks Run button
    Then An alert message should be displayed
     @stack_02
    Scenario: Implementation Page
    Given User is on Operations in Stack page
    When The user clicks on Implementation link
    Then user is redirected to Implementation page
     When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')" 
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"  
    And clicks Run button
    Then An alert message should be displayed
     @stack_03
    Scenario: Application Page
    Given User is on Implementation page
    When The user clicks on Application link
    Then user is redirected to Application page
      When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')" 
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"  
    And clicks Run button
    Then An alert message should be displayed
     @stack_04
    Scenario: Practice Questions to Search the Stack link
    Given User is on Operations in Stack Page 
     When The user clicks on Practice Questions link
    Then user is redirected to practice page
    
@Queue
Feature: Queue feature
  Scenario: The User is logged in to DS Algo portal
    Given The User is on Signin page of DS Algo portal
    When The User enter valid "kodetesters" and "numpyninja24"
    And The User click on login button
    Then The User redirected to homepage



  Scenario: Select Queue with Get Started button or select Queue from dropdown
    Given User is navigated to home page
    When User clicks on the "Get Started" button in Queue pane or select Queue item from drop down menu
    Then User is redirected to Queue  page


  @Queue_01
  Scenario: Implementation of Queue in Python page
    Given User is on Queue  page
    When The User clicks on Implementation of Queue in Python link
    Then The User is redirected to Implementation of Queue in Pythonpage
   ##### When User clicks Try Here button
    Then User is redirected to a page having a TryEditor with Run button
    When User enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # User enters invalid code
    When The User enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed #####


  @Queue_02
  Scenario: Implementation using collections.deque
    Given User is on Implementation of Queue in Python page
    When The User clicks on Implementation using collections.deque link
    Then User is redirected to Implementation using collections.deque page
     ##### When User clicks Try Here button
    Then User is redirected to a page having a TryEditor with Run button
    When User enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # User enters invalid code
    When The User enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed #####


  @Queue_03
  Scenario: Implementation using Array Page
    Given User is on Implementation using collections.deque page
    When The User clicks on Implementation using Array Page
    Then User is redirected to Implementation using Array Page
	#####When User clicks Try Here button
    Then User is redirected to a page having a TryEditor with Run button
    When User enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # User enters invalid code
    When The User enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @Queue_04
  Scenario: Queue Operations Page
    Given User is on Implementation using Array Page
    When The User clicks on Queue Operations Page
    Then User is redirected to Queue Operations Page
	#####When User clicks Try Here button
    Then User is redirected to a page having a TryEditor with Run button
    When User enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # User enters invalid code
    When The User enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @Queue_05
  Scenario: Practice Questions to Search the Queue link
    Given User is on Queues on python Page
    When The User clicks on Practice Questions link
    Then User is redirected to practice page
    Then User clicks on Search the Queue link
    Then User is redirected to questions1 page

    # User enters code and click run button

    When User enters code "print(hello)" in questions1 page
    Then An alert message should be displayed in questions1 page
    When User clicks submit button in questions1 page
    Then submission output is displayed on in questions1 page



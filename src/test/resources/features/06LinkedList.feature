@linkedlist
Feature: Testing LinkedList page
  @TS_Linkedlist
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage
  @TS_01
  Scenario: User navigated to "linked list" page
    Given The user is on the home page after logged in
    When The user clicks the Getting Started button in linked list pane
    Then The user redirected to Linked List  Page

  @TS_02
  Scenario: User navigated to "Introduction" page
    Given The user is on the Linked List page after logged in
    When The user clicks Introduction button
    Then The user should be directed to Introduction of Linked List Page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_05
  Scenario: User navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks creating a linked list button
    Then The user should be directed to Creating Linked List of Linked List Page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @TS_08
  Scenario: User navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks the Types of Linked List button
    Then The user should be directed to Types of Linked List of Linked List Page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @TS_11
  Scenario: user navigated to " linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks the Implement Linked List in Python button
    Then The user should be directed to Implement Linked List in Python of Linked List Page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @TS_14
  Scenario: user navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks Traversal button
    Then The user directed to Traversal Page of linked list
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_17
  Scenario: user navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks Insertion button
    Then The user should be directed to Insertion of Linked List Page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_20
  Scenario: user navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks the Deletion button
    Then The user should be directed to Deletion of Linked List Page
    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @TS_23
  Scenario: The user validating "Practice Questions" page
    Given The user is on the Linked List page after logged in
    When The user clicks Practice Questions button
    Then The user should be directed to Practice page

@linkedlist
Feature: Testing LinkedList page


  @TS_Linkedlist
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Kodetester" and "numpyninja24"
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

  @TS_03
  Scenario: User navigated to tryEditor page with "try here" button from Introduction page
    Given The user is on the Introduction of linked list page
    When The user clicks Try Here button of the introduction page
    Then The user redirected to the page having an tryEditor with a Run button to test

  @TS_04
  Scenario: The user run the code in tryEditor with valid input for Introduction page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_05
  Scenario: User navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks creating a linked list button
    Then The user should be directed to Creating Linked List of Linked List Page

  @TS_06
  Scenario: User navigated to tryEditor page with Run button from Creating a Linked List of Linked list page
    Given The user is on the Creating a Linked List after logged in
    When The user clicks Try Here button in the creating linked list page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_07
  Scenario: The user run the code in tryEditor with valid input for Creating a Linked List page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_08
  Scenario: User navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks the Types of Linked List button
    Then The user should be directed to Types of Linked List of Linked List Page

  @TS_09
  Scenario: User navigated to tryEditor page with Run button from Types of Linked List
    Given The user is in the Types of Linked list after logged in
    When The user clicks Try Here button in the types of linked list page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_10
  Scenario: The user run the code in tryEditor with valid input for Types of Linked List
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_11
  Scenario: user navigated to " linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks the Implement Linked List in Python button
    Then The user should be directed to Implement Linked List in Python of Linked List Page

  @TS_12
  Scenario: User navigated to tryEditor page with Run button from Implement Linked List in Python page
    Given The user is in the Implement Linked List in Python page
    When The user clicks Try Here button in the implemented linked list in python page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_13
  Scenario: The user run the code in tryEditor with valid input for Implement Linked List in Python page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_14
  Scenario: user navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks Traversal button
    Then The user directed to Traversal Page of linked list

  @TS_15
  Scenario: User navigated to tryEditor page with Run button from Traversal page
    Given  user in  traversal page
    When  user clicks Try Here button in traversal page
    Then  user should be redirected to a page having an tryEditor with a Run button to test

  @TS_16
  Scenario: The user run the code in tryEditor with valid input for  Traversal page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_17
  Scenario: user navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks Insertion button
    Then The user should be directed to Insertion of Linked List Page

  @TS_18
  Scenario: User navigated to tryEditor page with Run button from Insertion page
    Given user in insertion after logged in
    When user clicks Try Here button in Insertion page
    Then user should be redirected to a page having an tryEditor with a Run button to test

  @TS_19
  Scenario: The user run the code in tryEditor with valid input for Insertion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_20
  Scenario: user navigated to "linked list" page
    Given The user is on the Linked List page after logged in
    When The user clicks the Deletion button
    Then The user should be directed to Deletion of Linked List Page

  @TS_21
  Scenario: User navigated to tryEditor page with Run button from Deletion page
    Given The user is on the Deletion after logged in
    When The user clicks Try Here button in the Deletion page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_22
  Scenario: The user run the code in tryEditor with valid input for Deletion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message


  @TS_23
  Scenario: _The user validating "Practice Questions" page
    Given The user is on the Linked List page after logged in
    When The user clicks Practice Questions button
    Then The user should be directed to Practice page

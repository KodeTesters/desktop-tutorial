@tree
Feature: Testing tree page on DSalgo aplliction

  @TS_tree
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enters valid "Kodetesters" and "numpyninja24"
    And The user clicks on login button
    Then The user  is redirected to homepage


  @TS_tree_01
  Scenario: User navigated to "tree" page
    Given user  on  home page after logged in
    When user clicks Getting Started button on tree pane
    Then user redirected to tree Page

  @TS_tree_02
  Scenario: The user is able to navigate to Overview of Trees page
    Given user on Tree page after logged in
    When user clicks on Overview of Trees link
    Then user directed to Overview of Trees Page

  @TS_tree_03
  Scenario: The user is able to navigate to a page having an tryEditor from Overview of Trees page
    Given user in overview of trees after logged in
    When user clicks Try Here button in  tree page
    Then user redirected to tryEditor page with Run button

  @TS_tree_04
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_05
  Scenario: user is able to navigate to Terminologies Page
    Given user is on  tree page after logged in
    When user clicks on Terminologies button
    Then user redirected to Terminologies of tree Page

  @TS_tree_06
  Scenario: The user is able to navigate to Terminologies page having an tryEditor
    Given user in terminologies page after logged in
    When user clicks Try Here button in Terminologies page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_07
  Scenario: The user run the code in tryEditor with valid input for Terminologies of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_08
  Scenario: The user is able to navigate to Types of Trees Page
    Given The user is on the tree page after logged in
    When The user clicks on the Types of Trees button
    Then The user should be directed to the Types of Trees of tree Page

  @TS_tree_09
  Scenario: The user is able to navigate to a page having an tryEditor from Types of Trees page
    Given user on types of trees after logged in
    When user clicks Try Here button in  types of tree page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_10
  Scenario: The user run the code in tryEditor with valid input for types of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_11
  Scenario: The user is able to navigate to Tree Traversals Page
    Given user in Tree page after logged in
    When user clicks on Tree Traversals button
    Then user directed to Tree Traversals of tree Page

  @TS_tree_12
  Scenario: The user is able to navigate to a page having an tryEditor from Tree Traversals Page
    Given user in tree traversals after logged in
    When user clicks Try Here button in tree traversals page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_13
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_14
  Scenario: The user is able to navigate to Traversals illustration Page
    Given user in Tree page after logged in
    When user clicks Traversal illustration button
    Then user directed to Traversals-Illustration of tree Page

  @TS_tree_15
  Scenario: The user is able to navigate to a page having an tryEditor from Traversals-Illustration Page
    Given user in traversal illustration after logged in
    When user clicks Try Here button in traversal illustration page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_16
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_17
  Scenario: The user is able to navigate to Binary trees Page
    Given user in Tree page after logged in
    When user clicks binary trees button
    Then user directed to Binary Trees of tree Page

  @TS_tree_18
  Scenario: The user is able to navigate to a page having an tryEditor from Binary Trees Page
    Given user in binary trees after logged in
    When user clicks Try Here button in binary tree page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_19
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_20
  Scenario: The user is able to navigate to Types of Binary trees Page
    Given user in Tree page after logged in
    When user clicks types of binary trees button
    Then user directed to Types of Binary Trees of tree Page

  @TS_tree_21
  Scenario: The user is able to navigate to a page having an tryEditor from Types of Binary Trees Page
    Given user in types of binary trees after logged in
    When user clicks Try Here button in types of binary trees page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_22
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_23
  Scenario: The user is able to navigate to Implementation in Python Page
    Given user in Tree page after logged in
    When user clicks Implementation in Python button
    Then user directed to Implementation in Python of tree Page

  @TS_tree_24
  Scenario: The user is able to navigate to a page having an tryEditor from Implementation in Python Page
    Given user in Implementation in Python after logged in
    When user clicks Try Here button in implementation in python page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_25
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_26
  Scenario: The user is able to navigate to binary tree traversals Page
    Given user in Tree page after logged in
    When user clicks binary tree traversals button
    Then user directed to Binary Tree Traversals of tree Page

  @TS_tree_27
  Scenario: The user is able to navigate to a page having an tryEditor from Binary Tree Traversals page
    Given user in Binary Tree Traversals after logged in
    When user clicks Try Here button in binary tree traversals page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_28
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_29
  Scenario: The user is able to navigate to Implementation of Binary Trees Page
    Given user in Tree page after logged in
    When user clicks Implementation of Binary Trees button
    Then user directed to Implementation of Binary Trees of tree Page

  @TS_tree_30
  Scenario: The user is able to navigate to a page having an tryEditor from Implementation of Binary Trees page
    Given user in Implementation of Binary Trees after logged in
    When user clicks Try Here button in Implementation of Binary Trees page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_31
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_32
  Scenario: The user is able to navigate to Applications of Binary Trees Page
    Given user in Tree page after logged in
    When user clicks Applications of Binary Trees button
    Then user directed to Applications of Binary Trees of tree Page

  @TS_tree_33
  Scenario: The user is able to navigate to a page having an tryEditor from Applications of Binary Trees page
    Given user in Applications of Binary Trees after logged in
    When user clicks Try Here button in Applications of Binary Trees page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_34
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_35
  Scenario: The user is able to navigate to Binary Search Trees Page
    Given user in Tree page after logged in
    When user clicks Binary Search Trees button
    Then user directed to Binary Search Trees of tree Page

  @TS_tree_36
  Scenario: The user is able to navigate to a page having an tryEditor from Binary Search Trees page
    Given user in Binary Search Trees after logged in
    When user clicks Try Here button in Binary Search Trees page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_37
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_38
  Scenario: The user is able to navigate to Implementation of BST Page
    Given user in Tree page after logged in
    When user clicks Implementation of BST button
    Then user directed to Implementation of BST of tree Page

  @TS_tree_39
  Scenario: The user is able to navigate to a page having an tryEditor from Implementation of BST of Trees page
    Given user in Implementation of BST after logged in
    When user clicks Try Here button in Implementation of BST page
    Then user redirected to page having an tryEditor with a Run button to test

  @TS_tree_40
  Scenario: The user run the code in tryEditor with valid input for Overview of Trees page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enters valid python code in tryEditor from data "print('hello world')"
    And user click on Run button
    Then The user should be presented with the Run
    When The user Enter invalid python code in tryEditor from sheet "'abc' = 1"
    And user click on a Run button
    Then The user get the error message

  @TS_tree_41
  Scenario: The user validating "Practice Questions" page
    Given user in Implementation of BST after logged in
    When The user clicks Practice Questions button of tree page
    Then The user should be directed to Practice page
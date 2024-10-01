@tree
Feature: Testing tree page on DSalgo aplliction

  @TS_tree
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "kodetesters" and "numpyninja24"
    And The user click on login button
    Then The user redirected to homepage


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

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @TS_tree_05
  Scenario: user is able to navigate to Terminologies Page
    Given user is on  tree page after logged in
    When user clicks on Terminologies button
    Then user redirected to Terminologies of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_08
  Scenario: The user is able to navigate to Types of Trees Page
    Given The user is on the tree page after logged in
    When The user clicks on the Types of Trees button
    Then The user should be directed to the Types of Trees of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_11
  Scenario: The user is able to navigate to Tree Traversals Page
    Given user in Tree page after logged in
    When user clicks on Tree Traversals button
    Then user directed to Tree Traversals of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_14
  Scenario: The user is able to navigate to Traversals illustration Page
    Given user in Tree page after logged in
    When user clicks Traversal illustration button
    Then user directed to Traversals-Illustration of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_17
  Scenario: The user is able to navigate to Binary trees Page
    Given user in Tree page after logged in
    When user clicks binary trees button
    Then user directed to Binary Trees of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed
  @TS_tree_20
  Scenario: The user is able to navigate to Types of Binary trees Page
    Given user in Tree page after logged in
    When user clicks types of binary trees button
    Then user directed to Types of Binary Trees of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_23
  Scenario: The user is able to navigate to Implementation in Python Page
    Given user in Tree page after logged in
    When user clicks Implementation in Python button
    Then user directed to Implementation in Python of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_26
  Scenario: The user is able to navigate to binary tree traversals Page
    Given user in Tree page after logged in
    When user clicks binary tree traversals button
    Then user directed to Binary Tree Traversals of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_29
  Scenario: The user is able to navigate to Implementation of Binary Trees Page
    Given user in Tree page after logged in
    When user clicks Implementation of Binary Trees button
    Then user directed to Implementation of Binary Trees of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_32
  Scenario: The user is able to navigate to Applications of Binary Trees Page
    Given user in Tree page after logged in
    When user clicks Applications of Binary Trees button
    Then user directed to Applications of Binary Trees of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_35
  Scenario: The user is able to navigate to Binary Search Trees Page
    Given user in Tree page after logged in
    When user clicks Binary Search Trees button
    Then user directed to Binary Search Trees of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_38
  Scenario: The user is able to navigate to Implementation of BST Page
    Given user in Tree page after logged in
    When user clicks Implementation of BST button
    Then user directed to Implementation of BST of tree Page

    When user clicks Try Here button
    Then user is redirected to a page having a TryEditor with Run button
    When user enters valid python code "print('hello world')"
    And clicks Run button
    Then page displays output
    # user enters invalid code
    When The user enters invalid python code "'abc' = 1"
    And clicks Run button
    Then An alert message should be displayed

  @TS_tree_41
  Scenario: The user validating "Practice Questions" page
    Given user in Implementation of BST after logged in
    When The user clicks Practice Questions button of tree page
    Then The user should be directed to Practice page

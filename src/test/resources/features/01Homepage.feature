@home
Feature: HerokuApp Testcases
  I want to use this template for my feature file

  @TS_Home_01
  Scenario: DS Algo Portal
    Given The user opens DS Algo portal link
    When The user clicks the Get Started button
    Then The user should be redirected to homepage and verify the title

    @TS_Home_02
  Scenario: User is on the Home page and click sign in
    Given user click on the sign in link
    Then user redirected to login page

    @TS_Home_03
  Scenario Outline: user is on homepage without sigin
    When user clicks on dropdown <menu>
    Then alert the user with a message You are not logged in
    Examples:
      | menu         |
      | 'Arrays'     |
      | 'Linkedlist' |
      | 'Stack'      |
      | 'Queue'      |
      | 'Tree'       |
      | 'Graph'      |
      | 'Heap'       |
      | 'Hash'       |
      | 'Advanced'   |
      @TS_Home_04
  Scenario: User is on Home page and click getstarted link without sign in
    When The user clicks any of the Get Started buttons below the data structures
    Then  the user with a message You are not logged in
  @TS_Home_05
  Scenario: User is on Home page and click on register
    //Given user is on Home Page
    When The user clicks Register
    Then The user should be redirected to Register form

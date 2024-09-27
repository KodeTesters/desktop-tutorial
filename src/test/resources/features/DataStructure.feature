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
Then user clicks try Here button
And user should be redirected to a page having an tryEditor with a Run button
When  user send a valid python code in Editor field with data "print('hello')"
 Then user click run button 
And   valid code is executed and the result is displayed
When  user write invalid code "print =abc" and click the run button
Then   the error message is displayed
Scenario: user is in data structure intro page
Given  user is in the Data structures-Introduction page
When  user clicks the Practice Questions button 
Then user should be redirected to Practice Questions of Data structures-Introduction
#And capture the screenshot
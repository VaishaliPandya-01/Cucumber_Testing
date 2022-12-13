Feature: Test registration page


  Scenario Outline: Check registration is successful with valid inputs
    
    Given user is on registration page
    When user enters <username> <password> <repassword> <securityAns>
    And click on Register
    Then user is navigated to login page
    
    Examples:
    |username|password|repassword|securityAns|
    |a1264qw@as.com|asd123|asd123|Tommy|
    

 
Feature: User Login

  Background:
    Given I navigate to the Home Page


  Scenario: User logs in with valid credentials
    When I navigate to the Login Page
    And the Login Page is displayed
    And I login with email "rafiurrahmanrafit@gmail.com" and password "!Iamgood612@"
    Then I should be logged in successfully

#  Scenario: User logs in with invalid email
#    When I navigate to the Login Page
#    And the Login Page is displayed
#    And I login with email "invalidEmail@example.com"
#    Then I Should see a SignUp Page
#
#  Scenario: User logs in with correct email but incorrect password
#    When I navigate to the Login Page
#    And the Login Page is displayed
#    Then I login with email "rafiurrahmanrafit@gmail.com" and incorrect password "wrongPassword"
#
#  Scenario: User changes email
#    When I navigate to the Login Page
#    And the Login Page is displayed
#    Then I login with email "rafiurrahmanrafit2@gmail.com" and change email to "rafiurrahmanrafit@gmail.com" and password "!Iamgood612@"
#
#  Scenario: User resets password
#    When I navigate to the Login Page
#    And the Login Page is displayed
#    And I forget my password for email "rafiurrahmanrafit@gmail.com"
#    Then I should be redirected to the Password Reset page

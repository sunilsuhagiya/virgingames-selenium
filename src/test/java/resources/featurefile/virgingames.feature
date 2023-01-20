Feature: Virgin games Functionality
  As a User I want to check the different navigation tabs of virgin game application

  Scenario: Verify user can navigate to online slots page successfully
    Given I am on homepage
    When I accept all cookies
    And I click on online slots tab
    Then I should be navigated to online slots page

    Scenario: Verify user can navigate to live casino page successfully
      Given I am on homepage
      When I accept all cookies
      And I click on live casino tab
      Then I should be navigated to live casino page
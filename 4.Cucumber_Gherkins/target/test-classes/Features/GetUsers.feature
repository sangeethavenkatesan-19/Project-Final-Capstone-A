#Author: Sangeetha Venkatesan
#Feature: Get all Registered Users
@tag
Feature: Get all Registered Users
  I want to Get all the Registered Users in the smarty shoes file

  @tag1
  Scenario: Get Users - Get Request
    Given I want to get a list of all users
    And view users
    When I got the  list of users
    Then the request response has a 200 response code

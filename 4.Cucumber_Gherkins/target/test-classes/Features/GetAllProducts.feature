#Author: Sangeetha Venkatesan
#Feature: Get all Product

@tag
Feature: Get all Products
  I want to get all Products in the smarty shoes file

  @tag1
  Scenario: Get all Products - Get Request
    Given I want to get a list of all Products
    And view all Products
    When I got the  list of products
    Then the request response has a 200 response code
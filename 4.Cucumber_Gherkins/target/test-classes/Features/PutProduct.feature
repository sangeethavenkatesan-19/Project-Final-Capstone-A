#Author: Sangeetha Venkatesan
#Feature: Update the Products
@tag
Feature: Update the Products
  I want to Update the Products in the smarty shoes file

  @tag1
  Scenario: Product Update - Put Request
    Given I want to update a product
    And enter the updates
    When product is updated
    Then the request response has a 200 response code

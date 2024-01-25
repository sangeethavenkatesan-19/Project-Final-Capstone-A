#Author: Sangeetha Venkatesan
#Feature: Add a Product

@tag
Feature: Add a Product
  I want to Add a Product in the smarty shoes file

  @tag1
  Scenario: Add Product - Post Request
    Given I want to add a new product
    And enter the details
    When product is added
    Then the request response has a 200 response code
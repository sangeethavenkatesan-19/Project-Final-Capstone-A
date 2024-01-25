#Author: Sangeetha Venkatesan
#Feature: Delete a Product

@tag
Feature: Delete a Product
  I want to Delete a Product in the smarty shoes file

  @tag1
  Scenario: Delete Product - Delete Request
    Given I want to delete a product
    And enter the details of the product
    When product is deleted
    Then the request response has a 200 response code
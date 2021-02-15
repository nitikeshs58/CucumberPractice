Feature: Amazon Search

Scenario: Search a product 

Given I have a search filed on Amazon Page
When I search for product with name "Apple MacBook Pro" and Price 1000
Then Product with name "Apple MacBook Pro" should be displayed


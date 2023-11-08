Feature: Adding the product to the wishlist
Scenario: Successfully adding product to the wishlist
Given I am on the Homepage of the democart after login
When I Search for the products in the search bar it will show
And after the searching for the products i have to click the product
And click the product and add it to the wishlist
Then Check the product is in the wishlist or not 

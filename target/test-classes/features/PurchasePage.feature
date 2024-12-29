Feature: Swag Labs

@PurchaseItem
Scenario Outline: Purchase a single item
And user select a product from the list of Items "<ItemName>"
And user add the item to the cart
And user checkout the item
And user enter valid information "<firstname>" and "<lastname>" and "<code>"
And user finish the purchase of the item
Then verify the final message "THANK YOU FOR YOUR ORDER"

 
Examples:
|ItemName|firstname|lastname|code|
|Sauce Labs Backpack|Harikrishna|Mungara|8881|
|Sauce Labs Bike Light|Harikrishna|Mungara|8882|
|Sauce Labs Bolt T-Shirt|Harikrishna|Mungara|8883|
|Sauce Labs Fleece Jacket|Harikrishna|Mungara|8884|
|Sauce Labs Onesie|Harikrishna|Mungara|8885|



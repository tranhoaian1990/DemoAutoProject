@tag
Feature: Test purchase product page "https://www.demoblaze.com/index.html"
@tag1
	Scenario: Test purchase success
	Given Access purchase page
	When Chose "<type>", "<item>" and add to cart
	Then Place order "<item>" with "<name>" and "<card>"
	And Closed page
	 Examples:
	 |type|item|name|card|
	 |Phones|Samsung galaxy s6|An|12345|
	 |Phones|Nokia lumia 1520|An|12345|
	 |Phones|Nexus 6|An|12345|
	 |Phones|Samsung galaxy s7|An|12345|
	 |Phones|Iphone 6 32gb|An|12345|
	 |Phones|Sony xperia z5|An|12345|
	 |Phones|HTC One M9|An|12345|
	 |Laptops|Sony vaio i5|An|12345|
	 |Laptops|Sony vaio i7|An|12345|
	 |Laptops|MacBook air|An|12345|
	 |Laptops|Dell i7 8gb|An|12345|
	 |Laptops|2017 Dell 15.6 Inch|An|12345|
	 |Laptops|MacBook Pro|An|12345|
	 |Monitors|Apple monitor 24|An|12345|
	 |Monitors|ASUS Full HD|An|12345|
@tag2
	Scenario: Test remove product
	Given Access purchase page
	When Chose "<type>", "<item>" and add to cart
	Then Check "<item>" in cart and remove from cart

	Examples:
		|type|item|#remove|
	 |Phones|Samsung galaxy s6|#deleteItem('ce61c7b6-961d-6145-d7ec-2460cb265d67')|
	 |Phones|Nokia lumia 1520|#deleteItem('3b57e3b7-a2ba-8ea3-358f-1da7e30e3af8')|
	 |Phones|Nexus 6|#deleteItem('698fdba7-a0be-d2c8-fbba-e9c82c15be53')|
	 |Phones|Samsung galaxy s7|#deleteItem('b9e14cdd-6f35-9216-679d-daa2517507de')|
	 |Phones|Iphone 6 32gb|#deleteItem('52c458cb-5d37-4769-d896-c709c3acbff2')|
	 |Phones|Sony xperia z5|#deleteItem('88e71982-cb57-0fac-0ef2-c673f258c843')|
	 |Phones|HTC One M9|#deleteItem('454be041-5b1f-7adf-7488-0e0914c2ca78')|
	 |Laptops|Sony vaio i5|#deleteItem('4fb098e3-ca67-344e-2984-12a9dc9cdaa8')|
	 |Laptops|Sony vaio i7|#deleteItem('40a63c98-c079-7aa6-6693-3667e1d79b6d')|
	 |Laptops|MacBook air|#deleteItem('50eb5a2e-00d3-4322-f1c4-168a461b8271')|
	 |Laptops|Dell i7 8gb|#deleteItem('11612da4-da8d-15d0-5b37-d53f58f15c15')|
	 |Laptops|2017 Dell 15.6 Inch|#deleteItem('a0d9cd3d-dc31-4f94-1225-ebcbd0342454')|
	 |Laptops|MacBook Pro|#deleteItem('4aa445ec-9570-b9d9-05bb-2eddabcfe76b')|
	 |Monitors|Apple monitor 24|#deleteItem('17d6e8d4-0dbd-2ef0-757f-53fce1750e72')|
	 |Monitors|ASUS Full HD|#deleteItem('8b8c42d5-3486-60a1-38ae-a91b9cb0067e')|
	
	 
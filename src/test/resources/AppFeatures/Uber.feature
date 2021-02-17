Feature: Uber booking feature

@Smoke
Scenario: Booking cab
Given Uber wants to select car type "BMW" from uber application
When Uber selects car "BWM" and pickup location "Loha" and drop location "Nanded"
Then Driver starts the journey
And Driver ends the journey
Then User pays 500 Rupees

@Regression
Scenario: Booking mini
Given Uber wants to select car type "mini" from uber application
When Uber selects car "mini" and pickup location "Nanded" and drop location "Delhi"
Then Driver starts the journey
And Driver ends the journey
Then User pays 5000 Rupees
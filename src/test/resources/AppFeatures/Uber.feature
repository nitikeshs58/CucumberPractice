Feature: Uber booking feature

Scenario: Booking cab
Given Uber wants to select car type "BMW" from uber application
When Uber selects car "BWM" and pickup location "Loha" and drop location "Nanded"
Then Driver starts the journey
And Driver ends the journey
Then User pays 500 Rupees
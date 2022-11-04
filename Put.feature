Feature: Put request 
Scenario: User wants to update data using ID in database
Given User wants to update the data in database
When User wants to update the data in database using URI as "http://localhost:8080/9"
Then verify the status code is 200

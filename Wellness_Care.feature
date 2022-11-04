Feature: user_controller
Scenario: user can give email and password
Given User wants to create data in database
When User create data by using URI "http://localhost:8080/user"
Then verify the status code 200
Feature: Delete Request
Scenario: User wants to delete user by ID
When user want to delete user by using URI "http://localhost:8080/user/78"
Then verify status code is 200
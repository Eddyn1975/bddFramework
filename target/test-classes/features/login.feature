Feature: Login Page
		As a user I want a login page so that only authentic user can have access

Scenario: Valid users should be able to login

Given a valid user
When user goes to techfios website
Then techfios website should display
When user logs in with valid credentials
Then Dashboard page should be displayed

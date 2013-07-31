Feature: Registration
  As a User, I want to register so I can access the full functionality of the site
  I want to be able register as a Cause and/or a Guru and to update this at any time. Many Gurus will be Causes too.

Background: # Background steps run in the beginning of every scenario
  Given I access the crowdguru home page
  And I navigate to login/register page through Sign in/register button
  And I navigate to registration page by clicking on register button

Scenario: Save registration with just the mandatory options
  Given I give email as "user1@crowdguru.org"
  And I give password as "password1"
  When I save the details of registration for later
  Then I should see the user






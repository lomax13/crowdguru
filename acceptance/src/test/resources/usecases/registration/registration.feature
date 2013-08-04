@happyflows
Feature: Registration
  As a User, I want to register so I can access the full functionality of the site
  I want to be able register as a Cause and/or a Guru and to update this at any time. Many Gurus will be Causes too.

Background: # Background steps run in the beginning of every scenario
  Given I access the crowdguru home page
  And I navigate to login/register page through Sign in/register button
  And I navigate to registration page by clicking on register button

@automated
Scenario: Save registration with just the mandatory options
  Given I give email as "user1@crowdguru.org"
  And I give password as "password1"
  When I save the details of registration for later
  Then I should see the user

Scenario: Submit registration for a Guru
  Given I am in the registration page
  And I provide Forename "FName"
  And I provide Surname  "SName"
  And email for registration as "email@2register.com"
  And password for registration as "pass2register"
  And I check the checkbox for a Guru
  When I submit the details required for registration
  Then the user should be added into the system a Guru

Scenario: Submit registration for a Task Key Contact
    Given I am in the registration page
    And I provide Forename "FName"
    And I provide Surname  "SName"
    And email for registration as "email@2register.com"
    And password for registration as "pass2register"
    And I check the checkbox for a Key Contact requiring a Guru
    When I submit the details required for registration
    Then the user should be added into the system as a Key Contact






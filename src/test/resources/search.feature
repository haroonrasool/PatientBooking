@Search @Filter @Smoke @Sanity @wip
Feature: Search Functionality

  AS an end user
  I WANT TO visit PatientBooking website
  SO THAT I may know more about their business

  Background:
    Given User is on PatientBooking homepage

  Scenario: Login
    When User clicks on Login button
    Then User can see the homepage
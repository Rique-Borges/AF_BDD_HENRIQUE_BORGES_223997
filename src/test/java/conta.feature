#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Car rental system

  @tag1
  Scenario: Luxury car rental with early booking
    Given a customer wants to rent a luxury car
    And the reservation is made at least one week in advance
    When the customer finalizes the booking
    Then the system should offer a special discount on the total rental price

  @tag2
  Scenario: Utility car rental without prior reservation
    Given a customer wants to rent a utility car
    And the reservation is made on the same day
    When the customer finalizes the booking
    Then the system should find an available vehicle
    And the system should process the rental quickly
    And the system should charge a higher price due to the urgent demand

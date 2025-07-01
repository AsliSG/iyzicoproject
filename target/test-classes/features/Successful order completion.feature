Feature: Order Placement Feature

  Background: Given the user is on iyzico demo page

  @Order
  Scenario: Successful Order Placement
    When the user clicks on the second item on the page and adds it to the basket
    And clicks on to show basket button
    And clicks to go to payment page
    And chooses debit/credit card option and clicks pay with credit/debit card button
    And select one of the entered credit card option and click to fast pay
    And the user enters the SMS code "123456"
    And the user enters the 3D secure code "283126"
    Then successfully verify "Sipariş Alındı" text on the system

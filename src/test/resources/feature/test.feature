@Test_Scenario
Feature: Login into system

  Scenario: login
    Given open_login_page
    And username_field_fill
    And password_field_fill
    When login_bttn_click
    Then verify_home_page
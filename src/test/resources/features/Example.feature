Feature: Google search for personal web page
  Scenario: Searching for personal website and validating the title
    Given The user is on Google
    When The user searches for "canburak.com"
    Then The user should see a link website in the results
    And The user clicks the link
    Then The page title should be "Burak Can"
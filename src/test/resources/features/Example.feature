Feature: Google search for personal web page
  Scenario Outline: Searching for personal website and validating the title
    Given The user is on Google
    When The user searches for "<url>"
    Then The user should see a link with the text "<url>" in the results
    And The user clicks the link the text "<url>"
    Then The page title should be "<title>"

    Examples:
      | url          | title     |
      | canburak.com | Burak Can |
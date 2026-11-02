Feature: The Internet
  This feature covers (some) Example pages on 'the-internet.herokuapp.com'

  @TEST_TI_0001
  Scenario: Homepage has a list of links to Expected examples
    Given the page under test is 'https://the-internet.herokuapp.com'
    Then Then Should verify the links in the page
      | A/B Testing                                                    |
      | Add/Remove Elements                                            |
      | Basic Auth (user and pass: admin)                              |
      | Broken Images                                                  |
      | Canvas                                                         |
      | Challenging DOM                                                |
      | Checkboxes                                                     |
      | Context Menu                                                   |
      | Digest Authentication (user and pass: admin)                   |
      | Disappearing Elements                                          |
      | Drag and Drop                                                  |
      | Dropdown                                                       |
      | Dynamic Content                                                |
      | Dynamic Controls                                               |
      | Dynamic Loading                                                |
      | Entry Ad                                                       |
      | Exit Intent                                                    |
      | File Download                                                  |
      | File Upload                                                    |
      | Floating Menu                                                  |
      | Forgot Password                                                |
      | Form Authentication                                            |
      | Frames                                                         |
      | Geolocation                                                    |
      | Horizontal Slider                                              |
      | Hovers                                                         |
      | Infinite Scroll                                                |
      | Inputs                                                         |
      | JQuery UI Menus                                                |
      | JavaScript Alerts                                              |
      | JavaScript onload event error                                  |
      | Key Presses                                                    |
      | Large & Deep DOM                                               |
      | Large Form                                                     |
      | Multiple Select Dropdown                                       |
      | Multiple Windows                                               |
      | Nested Frames                                                  |
      | Notification Messages                                          |
      | Radio Buttons                                                  |
      | Read-only Inputs                                               |
      | Redirect Link                                                  |
      | Secure File Download                                           |
      | Shadow DOM                                                     |
      | Shifting Content                                               |
      | Slow Resources                                                 |
      | Sortable Data Tables                                           |
      | Status Codes                                                   |
      | Subdirectories                                                 |
      | Two-Factor Login (user: tomsmith / pass: SuperSecretPassword!) |
      | Typos                                                          |
      | WYSIWYG Editor                                                 |

  @TEST_TI_0002
  Scenario: Basic Auth allows validated access using string
    Given User navigate to Basic Auth using "admin" and "admin"
    Then Should verify the links "Basic Auth" in the "The Internet" page

#  @TEST_TI_0001
#  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
#    Given the page under test is 'Sortable Data Tables'
#    And add other steps
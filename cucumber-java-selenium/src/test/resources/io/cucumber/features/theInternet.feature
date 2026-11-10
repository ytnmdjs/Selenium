Feature: The Internet
  This feature covers (some) Example pages on 'the-internet.herokuapp.com'

  @TEST_TI_0001
  Scenario: Homepage has a list of links to Expected examples
    Given the page under test is 'https://the-internet.herokuapp.com'
    Then Then Should verify the links in the page
      | A/B Testing                                                    |
      | Accessibility Issues                                           |
      | Add/Remove Elements                                            |
      | Advanced Iframes                                               |
      | Advanced Shadow DOM                                            |
      | Autocomplete                                                   |
      | Basic Auth (user and pass: admin)                              |
      | Broken Images                                                  |
      | Browser Permissions                                            |
      | Canvas                                                         |
      | Challenging DOM                                                |
      | Checkboxes                                                     |
      | Context Menu                                                   |
      | Cookie Consent                                                 |
      | Custom Dropdown                                                |
      | Date & Time Pickers                                            |
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
      | Form Validation                                                |
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
      | Live Updates                                                   |
      | Locale & Time Zone                                             |
      | Modern File Download                                           |
      | Multiple Select Dropdown                                       |
      | Multiple Windows                                               |
      | Native Dialog                                                  |
      | Nested Frames                                                  |
      | Network & Console                                              |
      | Notification Messages                                          |
      | Pointer Events                                                 |
      | Radio Buttons                                                  |
      | Read-only Inputs                                               |
      | Redirect Link                                                  |
      | Responsive Layout                                              |
      | SPA Routing                                                    |
      | SVG                                                            |
      | Secure File Download                                           |
      | Shadow DOM                                                     |
      | Shifting Content                                               |
      | Slow & Failing API                                             |
      | Slow Resources                                                 |
      | Sortable Data Tables                                           |
      | Stale Element                                                  |
      | Status Codes                                                   |
      | Subdirectories                                                 |
      | Toasts                                                         |
      | Two-Factor Login (user: tomsmith / pass: SuperSecretPassword!) |
      | Typos                                                          |
      | Virtualized List                                               |
      | Visual Differences                                             |
      | WYSIWYG Editor                                                 |
      | WebSocket                                                      |

  @TEST_TI_0002
  Scenario: Basic Auth allows validated access using string
    Given User navigate to Basic Auth using "https://the-internet.herokuapp.com/basic_auth" with "admin" and "admin" credentials
    Then Should verify the links "Basic Auth" in the "The Internet" page

  @TEST_TI_0003
  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
    Given the page under test is 'https://the-internet.herokuapp.com'
    When User click link "Sortable Data Tables"
    Then Should verify the no class table
      | Last Name    |	First Name | Email                 |	Due     |	Web Site                 | Action     |
      |Smith          | John       | jsmith@gmail.com      |	$50.00  |	http://www.jsmith.com    | edit delete|
      |Bach           | Frank      | fbach@yahoo.com       |	$51.00  |	http://www.frank.com     | edit delete|
      |Doe            | Jason      | jdoe@hotmail.com      |	$100.00 |	http://www.jdoe.com      | edit delete|
      |Conway         | Tim        | tconway@earthlink.net |	$50.00  |	http://www.timconway.com | edit delete|
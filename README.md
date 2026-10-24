# LoginPageAutomation

## Project Overview

**LoginPageAutomation** is a web automation testing project developed using Java and Selenium WebDriver. It automates the login and logout functionality of a demo web application and verifies the expected results using assertions.

The project demonstrates basic automation testing concepts, including locating web elements, entering credentials, clicking buttons, handling explicit waits, and validating test results.

## Technologies Used

- **Java** – Programming language
- **Selenium WebDriver 4.35.0** – Web browser automation
- **TestNG** – Test execution and test annotations
- **WebDriverManager 6.1.0** – ChromeDriver management
- **Maven** – Dependency management and build tool
- **Google Chrome** – Browser used for automation

## Application Under Test

Demo website: https://the-internet.herokuapp.com/login

## Test Scenario

The automation script performs the following steps:

1. Launches the Chrome browser.
2. Maximizes the browser window.
3. Opens the demo login page.
4. Locates the username field and enters the username.
5. Locates the password field and enters the password.
6. Clicks the Login button.
7. Waits for the success message to appear.
8. Verifies the successful login message using an assertion.
9. Clicks the Logout link.
10. Verifies that the application returns to the login page.
11. Closes the browser after test execution.

## Test Credentials

The demo application provides the following credentials:

- **Username:** `tomsmith`
- **Password:** `SuperSecretPassword!`

These credentials are for the demo application only.

## Key Features

- Automated login and logout testing
- Web element identification using Selenium locators
- Explicit waits using `WebDriverWait` and `ExpectedConditions`
- Assertion-based verification of login and logout results
- Automated ChromeDriver setup using WebDriverManager
- Browser setup and cleanup using TestNG annotations

## Project Structure

```text
LoginPageAutomation/
├── pom.xml
├── .gitignore
└── src/
    ├── main/
    │   └── java/
    │       └── org/
    │           └── example/
    │               ├── App.java
    │               └── LoginPage.java
    └── test/
        └── java/
            └── org/
                └── example/
                    └── AppTest.java
```

*Note: Adjust this structure to match the actual locations of your Java files in your repository.*

## Prerequisites

Before running the project, ensure that you have:

- Java Development Kit (JDK) installed
- IntelliJ IDEA or another Java IDE
- Apache Maven installed or configured through your IDE
- Google Chrome browser installed
- An active internet connection to access the demo application and download required dependencies

## How to Run the Project

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Allow Maven to download the required dependencies.
4. Ensure the project is configured with the correct JDK.
5. Open the `LoginPage.java` class.
6. Run the `LoginPage` TestNG test.
7. Observe the browser automation and console output.

You can also try running the project using Maven:

```bash
mvn test
```

## Expected Result

- Chrome opens the demo login page.
- The valid credentials are entered automatically.
- The login success message is displayed and verified.
- The Logout link is clicked.
- The browser returns to the login page.
- The browser closes after execution.

Example console messages:

```text
Success MSG: You logged into a secure area!
Logout Successful :)
```

## Learning Outcomes

Through this project, I practiced:

- Selenium WebDriver fundamentals
- Automating web application login functionality
- Using locators to identify web elements
- Implementing explicit waits
- Writing assertions to validate application behavior
- Using TestNG annotations for test setup, execution, and cleanup
- Managing Java project dependencies with Maven

## Future Enhancements

- Add invalid username and password test cases.
- Add data-driven testing for multiple login scenarios.
- Generate automated test reports.
- Improve test organization using the Page Object Model (POM).
- Add screenshots when a test fails.

## Author

**Your Name**

Java | Selenium WebDriver | TestNG | Manual Testing | Automation Testing

---

*This project was created for learning and practicing web automation testing.*

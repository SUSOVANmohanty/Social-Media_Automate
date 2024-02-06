# Social Media Platform Automation Testing

## Overview
This project aims to automate tests for various features of a social media platform, including posting updates, liking posts, commenting, and friend requests. The tests focus on validating user interactions, data persistence, and the application's responses to different user inputs.

## Prerequisites
- Java JDK (Java Development Kit): [Download and Install](https://www.oracle.com/java/technologies/javase-downloads.html)
- Chrome Browser: [Download and Install](https://www.google.com/chrome/)
- Selenium WebDriver: Ensure you have the necessary Selenium WebDriver JAR files. You can download them from the [official Selenium website](https://www.selenium.dev/downloads/).

## Environment Setup
- Java Version: [Specify Java version used, e.g., Java 8]
- Chrome Version: [Specify Chrome version used, e.g., Chrome 99]
- Selenium Version: [Specify Selenium version used, e.g., Selenium 3.141.59]

## Project Structure
social-media-automation/
│
├── src/
│ ├── test/
│ │ ├── java/
│ │ │ ├── tests/
│ │ │ │ ├── PostUpdateTest.java
│ │ │ │ ├── LikePostTest.java
│ │ │ │ ├── CommentTest.java
│ │ │ │ ├── FriendRequestTest.java
│ │ │ │
│ │ ├── resources/
│ │ │ ├── chromedriver.exe (or chromedriver for Linux/Mac)
│ │
├── README.md

## Getting Started
1. Clone the repository: `git clone https://github.com/your-username/social-media-automation.git`
2. Open the project in your preferred IDE (Eclipse, IntelliJ, etc.).
3. Download the necessary Selenium WebDriver JAR files and place them in the `lib` folder.
4. Set up the project SDK to the installed Java version.
5. Configure the ChromeDriver path in your test scripts.
6.  Open `src/test/java/com/yourpackage/MyntraTest.java` and update the placeholders with your actual data.
7. Execute the `MyntraTest.java` file to run the automated test.

# Dependencies

- Selenium 4.17.0
- ChromeDriver 121.0.6167.139
- Chrome Browser 121.0.6167.139 (for chrome)
- java 17.0.8 

Feel free to reach out for any issues or questions.
# CRM QA Automation Framework

A comprehensive test automation framework built with Selenium, TestNG, and Cucumber for automated testing of CRM applications and enterprise web systems.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running Tests](#running-tests)
- [Test Reports](#test-reports)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)

## 🎯 Overview

CRM QA Automation Framework is a robust test automation solution designed specifically for testing CRM applications and enterprise web-based systems. It leverages the power of Selenium WebDriver with Cucumber BDD approach, providing a scalable and maintainable solution for automated testing.

## ✨ Features

- **BDD Framework**: Tests written in Gherkin language for better readability
- **Page Object Model**: Well-organized page object implementation
- **WebDriver Management**: Automatic driver setup and teardown using WebDriverManager
- **Comprehensive Logging**: Log4j2 integration for detailed test execution logs
- **Rich Reporting**: Extent Reports integration for detailed test reports
- **Data-Driven Testing**: Support for test data from JSON and Excel files
- **Screenshot Capture**: Automatic screenshot capture on test failures
- **API Testing**: REST API testing capabilities using REST Assured
- **Cross-Browser Support**: Support for multiple browsers through Selenium 4

## 📦 Prerequisites

- **Java**: JDK 1.8 or higher
- **Maven**: 3.6.0 or higher
- **Git**: For version control
- **Browsers**: Chrome, Firefox, or Edge (WebDriverManager handles driver downloads)

## 📁 Project Structure

```
crm-qa-automation-framework/
├── src/
│   ├── main/
│   │   ├── java/          # Main application code
│   │   └── resources/     # Configuration files
│   └── test/
│       ├── java/          # Test classes and step definitions
│       │   ├── com/testcases/         # Test case classes
│       │   ├── stepDefinitions/       # Cucumber step definitions
│       │   └── prog_practice/         # Practice/utility classes
│       └── resources/
│           ├── Features/              # Cucumber feature files
│           │   ├── Demo.feature
│           │   └── NewContact.feature
│           ├── testdata.json          # Test data in JSON format
│           └── extent.properties      # Extent Reports configuration
├── datafiles/             # Excel and other data files
├── logs/                  # Application logs
├── Screenshots/           # Test execution screenshots
├── pom.xml                # Maven configuration
├── runner.xml             # TestNG suite configuration
└── README.md              # This file
```

## 🔧 Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd crm-qa-automation-framework
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Download WebDriver**
   - WebDriverManager automatically downloads required drivers
   - No manual driver setup needed

## ⚙️ Configuration

### Log4j Configuration
- **Location**: `src/test/resources/log4j2.properties` and `log4j2.xml`
- Logs are stored in the `logs/` directory
- Configure log levels in the properties file

### Extent Reports
- **Configuration File**: `src/test/resources/extent.properties`
- Reports are generated in the `test-output/` directory
- Customize report settings as needed

### Test Data
- **JSON Format**: `src/test/resources/testdata.json`
- **Excel Format**: `datafiles/*.xlsx`
- DataProvider class manages data loading

## 🚀 Running Tests

### Run all tests
```bash
mvn clean test
```

### Run specific test suite
```bash
mvn clean test -Dsuites=runner.xml
```

### Run specific test
```bash
mvn clean test -Dtest=LoginCRM
```

### Run Cucumber features
```bash
mvn clean test -Dtest=CucumberRunner
```

### Enable/Disable tests in runner.xml
Edit `runner.xml` and modify the `enabled` attribute:
```xml
<test name="CreateNewContact" enabled="true">
```

## 📊 Test Reports

### Extent Reports
- **Location**: `test-output/index.html`
- Open in any web browser for detailed test execution reports
- Includes screenshots of failed tests

### TestNG Reports
- **Location**: `test-output/testng-results.xml`
- HTML report available at `test-output/index.html`

### Screenshots
- **Failure Screenshots**: `Screenshots/` folder
- Automatically captured on test failures
- Attached to Extent Reports

## 📚 Technologies Used

| Technology | Version | Purpose |
|---|---|---|
| **Selenium** | 4.11.0 | Web browser automation |
| **TestNG** | 7.11.0 | Test framework |
| **Cucumber** | 7.13.0 | BDD testing |
| **Extent Reports** | 5.0.9 | Test reporting |
| **Log4j** | 2.21.1 | Logging framework |
| **WebDriverManager** | 5.7.0 | Driver management |
| **Apache POI** | 5.2.3 | Excel file handling |
| **REST Assured** | 5.3.1 | API testing |
| **Lombok** | 1.18.30 | Code generation |
| **Guava** | 31.1-jre | Utility library |

## 📝 Test Cases

### Currently Available Tests

1. **loginintoCRM** (Enabled)
   - Test login functionality to CRM system
   - Class: `com.testcases.LoginCRM`

2. **CreateNewContact** (Disabled)
   - Test creating a new contact in CRM
   - Class: `com.testcases.TC_CreateNewContact`

3. **CreateNewCompany** (Disabled)
   - Test creating a new company in CRM
   - Class: `com.testcases.TC_CreateNewCompany`

4. **VerifyLogin** (Disabled)
   - Validation tests for login functionality
   - Class: `com.testcases.ValidateLogin`

5. **Additional Tests**
   - Add to Cart, Create Lead, REST API testing, JavaScript Executor tests

### Feature Files

- **Demo.feature**: Basic demonstration scenarios
- **NewContact.feature**: New contact creation scenarios

## 🤝 Contributing

1. Create a new branch: `git checkout -b feature/your-feature`
2. Commit changes: `git commit -am 'Add new feature'`
3. Push to branch: `git push origin feature/your-feature`
4. Submit a pull request

## 📖 Best Practices

- Follow Page Object Model (POM) pattern
- Write descriptive feature files in Gherkin
- Use meaningful variable and method names
- Add logging at appropriate points
- Capture screenshots on failures
- Keep test data separate from test code
- Use data providers for parametrized tests

## 🐛 Troubleshooting

### WebDriver Issues
- Ensure internet connection for WebDriverManager to download drivers
- Clear Maven cache: `mvn clean`

### Test Failures
- Check logs in `logs/` folder
- Review Extent Reports for error details
- Check screenshots in `Screenshots/` folder

### Build Issues
- Verify Java version: `java -version`
- Clear Maven cache: `mvn clean install -U`
- Check Maven settings: `mvn --version`

## 📞 Support

For issues or questions, refer to:
- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [TestNG Documentation](https://testng.org/)
- [Cucumber Documentation](https://cucumber.io/docs/)

## 📄 License

[Add your license information here]

---

**Last Updated**: September 2, 2026

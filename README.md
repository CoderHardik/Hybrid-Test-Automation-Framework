# 🚀 Hybrid Automation Framework (UI + API + DB)

A professional-grade, multi-layered automation framework designed for **End-to-End (E2E)** validation of enterprise web applications. This project demonstrates industry-standard architecture patterns used in large-scale, high-concurrency QA environments.

## 🏗️ Architecture & Design Patterns
*   **Page Object Model (POM)**: Decouples UI locators from test logic to ensure high maintainability and 100% reusability.
*   **Fluent Interface Design**: Enables highly readable test flows by chaining page actions and transitions.
*   **Robust Synchronization**: Implements **Java 8 Lambda expressions** and **Explicit Waits** to handle asynchronous UI events (AJAX/Spinners) without brittle `Thread.sleep()` calls.
*   **Singleton Driver Factory**: Centralized WebDriver management ensuring optimized resource usage and session control.

## 🛠️ Technology Stack
*   **Language**: Java 8+
*   **UI Automation**: Selenium WebDriver 4.x
*   **API Automation**: REST Assured 4.x
*   **Test Engine**: TestNG (Suite management & Parallel execution)
*   **Build Tool**: Maven (Dependency & Lifecycle management)
*   **Logging**: Log4j2 (Structured execution tracing)
*   **Utility**: WebDriverManager (Automated binary management)
*   **Database**: JDBC (Backend data integrity verification)

## 📁 Project Structure
```
src/test
 ├── java
 │   ├── framework           # Core driver & base logic
 │   │   ├── BaseTest.java
 │   │   └── DriverFactory.java
 │   ├── pages               # Page Object Model classes
 │   │   ├── LoginPage.java
 │   │   ├── HomePage.java
 │   │   └── PipelinePage.java
 │   ├── test                # UI Functional test suites
 │   │   └── ForecastDisplayTest.java
 │   ├── api_test            # REST API validation suites
 │   │   └── PipelineApiTest.java
 │   └── registration_test   # E2E workflow validation
 └── resources
     ├── data.properties     # Environment configuration
     └── testng.xml          # Test suite execution path
```

##  Execution
1.  **Clone the Repository**:
    ```bash
    git clone https://github.com
    ```
2.  **Configuration**:
    Update `src/test/resources/data.properties` with your environment URL and credentials.
3.  **Run via Maven**:
    ```bash
    mvn clean test -Denv=qa
    ```
📊 Featured Scenarios
Predictive Analytics Sync: Automated cross-referencing of revenue data between dashboard summaries and granular detail views.
Network Connection Sync: Verifying real-time connection counts across multiple navigation modules.
Secure API Auth: Retrieving session tokens via REST and injecting them into authorized requests.
E2E Registration: Validating complex multi-step user onboarding workflows.
Hardik Shah
Automation Engineer | Specialist in Scalable QA Frameworks
GitHub Profile

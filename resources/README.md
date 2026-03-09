# 🚀 Hybrid Automation Framework (UI + API + DB)

A professional-grade, multi-layered automation framework built for **End-to-End (E2E)** validation of enterprise web applications. This project demonstrates high-level proficiency in **Java**, **Selenium 4**, **RestAssured**, and **Database testing**.

## 🏗️ Architecture & Design Patterns
- **Page Object Model (POM)**: Enhanced maintainability by decoupling UI locators from test logic.
- **Fluent Interface Design**: Streamlined test scripts by allowing method chaining between page transitions.
- **Synchronization**: Advanced use of **Java 8 Lambdas** and **Explicit Waits** to handle asynchronous data loading (AJAX/Spinners) without brittle `Thread.sleep` calls.
- **Hybrid Capabilities**: Single framework handling UI (Selenium), API (RestAssured), and Backend (JDBC/HBase) verification.

## 🛠️ Technology Stack
*   **Language**: Java 8 (Lambda expressions, Try-with-resources)
*   **UI Engine**: Selenium WebDriver 4.x
*   **API Engine**: RestAssured 4.x (JSON Path, GSON)
*   **Test Engine**: TestNG (Data-driven, Parameterization)
*   **Build Tool**: Maven (Dependency Management, Lifecycle)
*   **Logging**: Log4j2 (Traceability & Debugging)
*   **Utility**: WebDriverManager (Automated Binary Management)

## 📂 Key Modules
- **`src/main/java/pages`**: Optimized Page Objects with encapsulated locators.
- **`src/test/java/api_test`**: REST API validation including Token-based Authentication.
- **`src/test/java/db_test`**: JDBC connectivity for verifying data integrity in the database.
- **`src/test/java/test`**: End-to-end functional test suites.

## 🚀 Execution
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

## 📈 Featured Scenarios
- **Predictive Analytics Validation**: Automated cross-referencing of revenue data between dashboard summaries and granular detail views.
- **Network Sync**: Verifying real-time connection counts across multiple navigation modules.
- **Secure Auth**: Demonstrating session token retrieval and injection for authorized API calls.

---
*Created and maintained by **Hardik Shah** - Automation Engineer*

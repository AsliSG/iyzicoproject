# Iyzico Automation Project

This project is a case study ,end-to-end test automation implementation for the Iyzico Demo Page(https://www.iyzico.com/demo/). The automation verifies the user flow where a customer selects a second  product, proceeds to checkout, enters payment information, and successfully places an order. The test is considered successful when the **"Sipariş Alındı"** ("Order Received") message is displayed.

---

## Test Case: Successful Order Placement

### Test Steps:
1. Open the application: https://www.iyzico.com/demo/
2. Click the second product to view its details.
3. Click the "Add to Basket" button.
4. Click the "Show Basket" button.
5. Click the "Go to Payment Page" button.
6. Choose the "Debit or Credit Card" option.
7. Click "Pay with Debit or Credit Card".
8. Fill in all required fields using random data.   Test card details can be found at: [https://docs.iyzico.com/ek-bilgiler/test-kartlari](https://docs.iyzico.com/ek-bilgiler/test-kartlari)
9. Click the "Pay" button.
10. Verify that the **"Sipariş Alındı"** message appears.

---

## Technologies Used

| Technology              | Version     | Description                                |
|-------------------------|-------------|--------------------------------------------|
| Java                    | 17          | Programming language                       |
| Maven                   | 3.8+        | Build and dependency management            |
| Selenium WebDriver      | 4.28.0      | Web browser automation                     |
| Cucumber-Java           | 7.18.1      | BDD (Behavior-Driven Development)          |
| Cucumber-JUnit          | 7.18.1      | Test runner                                |
| Maven Surefire Plugin   | 3.0.0-M5    | Test execution                             |
| Maven Cucumber Reporting| 5.8.5       | HTML report generation                     |

---

## Prerequisites

Make sure you have the following installed:

- **Java 17+**
- **Maven 3.8+**
- **Git**
- **IntelliJ IDEA or Eclipse IDE**

---

## Setup & Run Instructions

### Clone the Repository and Run test
```bash
git clone https://github.com/your-username/iyzico-automation-project.git
cd iyzicoproject
mvn test


### To generate report
mvn clean verify

# Reports
Will be generated automatically under Target folder (refresh project if not generated)
cucumber-default-report.html

### Clone the Repository and Run test
```bash
git clone https://github.com/your-username/iyzico-automation-project.git
cd iyzicoproject

##To execute through Eclipse
Go to File > Import > Existing Maven Projects.
Select the cloned iyzico-automation-project folder.
Wait for dependencies to be resolved.
Right-click TestRunner.java → Run As > JUnit Test.


###Resources

Demo Site: https://www.iyzico.com/demo/
Test Cards: https://docs.iyzico.com/ek-bilgiler/test-kartlari




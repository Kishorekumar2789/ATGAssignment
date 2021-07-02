#Prerequisite:

* Java 1.8.0 and above
* Selenium WebDriver 3.141.59
* Maven 3.8.1
* TestNG 6.14.3
* Chrome Driver 90.0.4430.24

#Test Coverage
Covered all the steps mentioned. Usually daily run has configured in jenkins here tried with cron jobs/batch runs´using scheduler.

#About Framework:

* Framework is designed as Page Object model where all page locators are placed in their respective pages.
* Framework re-execute failed tests upto 3 times in order to overcome false positive behaviour.
* Each Tests are independent with each other. Can change to tests priority to any order to execute the Test Suite.
* All tests have an assertion to confirm success/failure during execution
* Framework support to execute in CI/CD pipeline
* Easily can execute in different browsers by modifying changes in property file
How To Execute Tests:

* In Terminal, navigate to project path and execute tests using **mvn test**

#Execution Flow:

When execute this command mvn test -DsuiteFile=atg.xml, it triggers the TestNG Xml file where the xml file path is configured in Maven surfire-plugin
TestNG xml file will execute tests which are configured.
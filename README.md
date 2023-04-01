# Ensek-tech-test

Cucumber-BDD-Automation-Framework-Login functionality
Behaviour Driven Development Cucumber - Selenium based automation framework including extent reports.
¬ Steps to run at your system:
• Use IntelliJ IDEA • Clone the repository using "git clone " • Run from src/test/java/corp/energy/ensek/runner/TestRunner.java
¬ Steps to view the report
• To generate report, use this path - target/Extent_Reports/report.html
Steps : Go to Target folder -> Extend Report ->right click on report.html -> open in -> browser
Tools: Selenium, Cucumber, Junit,Maven, Page object model with page factory.
Language: Java
¬ This framework contains sample code containing:
• 1 feature (feature file) • 1 Scenarios • Register functionality • Use this link to get the dependencies - https://mvnrepository.com/
Add below dependencies in pom.xml file
maven-compiler-plugin version 3.8.0
maven-surefire-plugin version 3.0.0-M7
junit version 4.11
selenium-java version 4.6.0
WebdriverManager version 5.3.1
guava version 31.1-jre
commons-io version 2.6
cucumber-junit version 1.2.5
cucumber-java version 1.2.5
cucumber-core version 1.2.5
cucumber-extentsreport version 3.0.2
extentreports version 3.1.2
log4j version 1.2.17
¬ Directory structure:
In src there are two packages: main and test.The main package contains browserfactory, logs, pages, propertyreader, screenshots, utility and test package contains runner and steps packages and Hook class and resources package.

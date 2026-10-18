# CodeAlpha Java Application Using Gradle

## Project Overview

This project demonstrates Java application development and automated build management using Gradle. It was developed as part of the CodeAlpha DevOps Internship.

The application displays information about a Student Management System and includes automated unit tests using JUnit.

## Objectives

* Automate Java application builds using Gradle.
* Manage project configuration and dependencies.
* Execute automated unit tests.
* Generate a distributable Java application artifact.
* Understand basic software build automation and testing.

## Technologies Used

* Java JDK 21
* Gradle
* JUnit 5
* Git
* GitHub
* Visual Studio Code
* Windows 11

## Project Structure

```text
CodeAlpha_Java_Gradle/
├── app/
│   ├── build.gradle
│   └── src/
│       ├── main/java/org/example/
│       │   ├── App.java
│       │   └── AppInfo.java
│       └── test/java/org/example/
│           └── AppTest.java
├── gradle/
│   └── wrapper/
├── gradlew
├── gradlew.bat
├── settings.gradle
├── gradle.properties
└── README.md
```

## Prerequisites

* Java Development Kit (JDK) 21
* Git
* Internet access for downloading Gradle and dependencies during the initial build

Gradle is executed through the included Gradle Wrapper, so a separate global Gradle installation is not required to build the project.

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/ambarish158/CodeAlpha_Java_Gradle.git
cd CodeAlpha_Java_Gradle
```

### 2. Run the application

On Windows, execute:

```powershell
.\gradlew.bat run
```

### 3. Run automated tests

```powershell
.\gradlew.bat clean test
```

### 4. Build the project

```powershell
.\gradlew.bat clean build
```

### 5. Locate the generated JAR

```powershell
Get-ChildItem .\app\build\libs\
```

The generated JAR is located in the application's build output directory.

## Automated Testing

The project includes four JUnit tests that verify the application information returned by the `AppInfo` class.

The tests cover:

* Application name
* Technology information
* Build tool information
* Application status

**Previously verified test result:** 4 tests, 0 failures.

To generate a fresh test report, run:

```powershell
.\gradlew.bat clean test
```

The HTML test report is generated at:

`app/build/reports/tests/test/index.html`

## Learning Outcomes

* Java application development
* Gradle build automation
* Dependency management
* Automated unit testing
* JAR packaging
* Git version control and GitHub repository management

## Author

Ambarish

## GitHub Repository

https://github.com/ambarish158/CodeAlpha_Java_Gradle

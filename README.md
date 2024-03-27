Multiple MySQL, postgres databases using Spring Boot
In this applicaton I configure two local databases for a Spring Boot app. I use Sakila and World databases, two databases that the MySQL page give us to practice.
This is done thanks to the @Configuration bean that Spring Boot give us.
A better explanation of this repository and how to establish multiple connection to an Spring Boot app can be found in my

# Spring Boot Multi-Database Application

## Overview
This Spring Boot application demonstrates how to connect to multiple databases (MySQL and PostgreSQL) concurrently to provide RESTful services. It utilizes Spring Data JPA for efficient database interaction and management.

## Prerequisites
- Java Development Kit (JDK) installed
- Maven or Gradle installed
- MySQL and PostgreSQL databases installed and running locally or accessible remotely
- IDE of your choice (IntelliJ IDEA, Eclipse, etc.)

## Setup
1. Clone the repository:
    ```bash
    git clone https://github.com/your_username/your_repository.git
    ```

2. Navigate to the project directory:
    ```bash
    cd your_repository
    ```

3. Build the project:
    ```bash
    # For Maven
    mvn clean install
    
    # For Gradle
    ./gradlew build
    ```

4. Run the application:
    ```bash
    # For Maven
    mvn spring-boot:run
    
    # For Gradle
    ./gradlew bootRun
    ```

5. Access the application:
    Open a web browser and go to `http://localhost:8080` to access the RESTful services.

## Configuration
- Configure database connection details in the `application.properties` or `application.yml` file for both MySQL and PostgreSQL databases.
- Entity classes representing database tables and repositories for each database are defined in the project. Ensure that the entity annotations are correct and match the database schema.

## Usage
- Use the provided RESTful endpoints to interact with the application's services. Refer to the controller classes to understand the available endpoints and their functionality.

## Contributing
Pull requests and contributions are welcome. For major changes, please open an issue first to discuss the proposed changes.


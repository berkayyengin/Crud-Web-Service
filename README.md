# Simple CRUD Web Service with Spring Boot

This is a simple web service application built with Spring Boot that implements basic Create, Read, Update, and Delete (CRUD) operations for employees.

## Used Technologies

* Spring Initializr
* Project: Maven Project
* Language: Java 17.0.4.1
*	Spring Boot v2.7.8
*	Eclipse IDE
*	JRE System Library [JavaSE-1.8]
*	PostgreSQL 15
*	Postman

## Getting Started

⋅⋅⋅Download ZIP File
⋅⋅⋅You can go to the directory where the project was downloaded and import it inside the Eclipse IDE
⋅⋅⋅Build the project using Maven
⋅⋅⋅Run the application with CrudwebsrvApplication in Eclipse IDE Run Button (You can find the code files in the file named "com")
⋅⋅⋅Go to Postman application to check CRUD operations
⋅⋅⋅The application will be accessible at http://localhost:9436/
⋅⋅⋅Use PostgreSQL to display the results of CRUD operations in tables. Necessary information is written in the application.properties section of the project.

Or

⋅⋅⋅Clone the repository to your local machine:
RUN: git clone https://github.com/berkayyengin/Crud-Web-Service.git

⋅⋅⋅Navigate to the project directory:
RUN in terminal :  cd crudwebsrv
⋅⋅⋅Build the project using Maven:
* RUN in terminal :  mvn clean install
⋅⋅⋅Run the application:
* mvn spring-boot:run
⋅⋅⋅The application will be accessible at http://localhost:9436/

## Description

In this Web Service, employees implement basic CRUD operations. It is a simple web service application built with Spring Boot.
The web service will have 4 methods to implement basic CRUD functionality for employee records:
### POST  addEmployee
⋅⋅⋅Retrieves the byte content of the spreadsheet
⋅⋅⋅It parses and adds each row as a new record to the database
⋅⋅⋅Returns OK with list of records added
 
### POST updateEmployee
⋅⋅⋅Retrieves a JSON object representing a record in the database
⋅⋅⋅Updates the record in the database whose id matches the id in the JSON object
⋅⋅⋅Returns OK
 
### POST deleteEmployee
⋅⋅⋅Takes an id as an integer
⋅⋅⋅Deletes record with ID from database
⋅⋅⋅Returns OK
 
### GET getEmployee
⋅⋅⋅Gets and gets the id as an integer
⋅⋅⋅Fetch record from database with ID
⋅⋅⋅Returns OK with JSON representation of record

## Endpoints

⋅⋅⋅The following endpoints are available for interacting with the employee data:
⋅⋅⋅You can use the endpoints through the Postman App.

| HTTP Method  | Endpoint              | Description                   |
| :---         |         :---:         | :---                          |
| GET          | /employees/{id}	     | Get a specific employee by ID |
| POST         | /employees            | Create a new employee         |
| PUT          | /employees/{id}       | Update an existing employee   |
| DELETE       | /employees/{id}       | Delete an existing employee   |


## Conclusion
⋅⋅⋅This simple CRUD web service with Spring Boot provides a basic implementation of creating, reading, updating, and deleting employee data. 
⋅⋅⋅You can use it as a starting point for building more complex applications.

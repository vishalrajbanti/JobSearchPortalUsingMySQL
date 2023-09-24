

# Job search portal 

## Table of content 
   - [Frameworks and Language Used](#frameworks-and-language-used)
- [Data Flow](#data-flow)
  - [1. Controller](#1-controller)
  - [2. Services](#2-Services)
  - [2. Repository](#2-Repository)
- [API Reference](#API-Reference)
- [Data Structures Used ](#Data-Structures-Used)
 - [Key Features](#Key-Features)
   - [1. Job CRUD Operations](#1-Job-CRUD-Operations)
   - [2. Key Features](#2-Key-Features)
   - [3. Customizable and Extendable](#3-Customizable-and-Extendable)
- [Project Summary](#project-summary)
- [Acknowledgments](#Acknowledgments)
- [Support](#Support)



## Frameworks and Language Used
- Spring Boot
- Java
- Maven

## Data Flow

### 1. Controller
- Controller handles incoming HTTP requests.
- It defines endpoints for adding, retrieving, updating, and deleting Job information.


### 2. Services
- The services in the Job search portal Application are responsible for encapsulating the business logic and operations related to restaurant management. They serve as an intermediary layer between the controllers (which handle HTTP requests) and the repositories (which interact with the database)

### 3.repository
- The repository in the Job search portal Application project is a crucial component that facilitates the interaction between the application and the database.

## API Reference

#### Post jobs

```http
  POST jobs
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`Request body`  | `Job object` | **Required**. database(MySql
) to add. |

#### Get all jobs

```http
  GET jobs
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| ``      | `` | **Required**. database to  fetch the size |

#### GET  a job by location
```http
  Get job/location/{location}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `pathVariable`      | `location` | **Required**. database to  fetch |

#### GET  a job by title
```http
  Get job/title/{title}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `pathVariable`      | `title` | **Required**. database(MySql
) to  fetch |

#### Update job by salary 

```http
  Put job/salary/{newsalary}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`pathVariable`  | `salary` | **Required**. database(MySql
) to add. |

#### Delete job

```http
  Delete job/company/name
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`Requestparam`  | `CompanyName` | **Required**. database(MySql
) to delete. |


## Data Structures Used

In the Job search portal, the following data structures are used:




- **Id**: Field to store the id of the Job.
- **Title**: Field to store the title of the company.
- **Description**: Field to store the description of the company.
- **location**: Field to store the location of the company.
- **salary**: Field to store the salary for the job.
- **CompanyName**: Field to store the name of the company.
- **CompanyEmail**: Field to store the Email of the company.
- **JobLocation**: Field to store the location of the job.
- **EmployerName**: Field to store the Employee name of the company.
- **JobType**: Field to store the JobType of the company.
- **appliedDate**: Field to store the appliedDate for the company.

## Key Features

The Job search portal is designed to provide efficient Job search  capabilities. Here are the key features of this application:

### 1. Job CRUD Operations

- **Add Job**: Create new job profiles by providing essential details, including  jobname,jobId,etc.

- **Get Job by location**: Retrieve Job information by specifying a location.

- **Get Job by title**: Retrieve Job information by specifying a title.

- **Get All jobs**: Retrieve a  all jobs in the system.

- **Update Job Information**: Modify job .

- **Delete jobs **: delete jobs .

### 2. Scalable and Maintainable Architecture

- Utilizes the Spring Boot framework for building robust and scalable applications.

- Follows a well-structured layered architecture, separating concerns between controllers, services, and repositories, ensuring maintainability and testability.



### 3. Customizable and Extendable

- Easily extensible to add more features or attributes to the job profile.


## Project Summary
This project is an Job search portal built using Spring Boot. It provides a set of RESTful API endpoints for managing job information, including adding, retrieving, updating, and deleting job records. The project follows a layered architecture with controllers handling HTTP requests, services containing business logic, and a repository for database operations. Job data is stored in a database table with attributes Id, title, description, location,salary,ComapyName,CompanyEmail,JobType and appliedDate.




## Acknowledgments

We would like to express our gratitude to the following individuals and projects for their contributions and support to the Job search portal :

- **[Vishal Raj]**: Lead developer and project coordinator.
- **[Mainak Ghosh]**: Contributor to the project, helping with [SpringBoot to complete this project].
- **[maven]**: We utilized [maven] for [dependencies] in our project.
- **Stack Overflow Community**: For their invaluable assistance in resolving technical challenges.
- **Spring Framework**: For providing a robust and efficient platform for building our application.


We appreciate the  effort and support that made this project possible.



## Support

For support, email vishalrajbanti@gmail.com.

## thank you.
# CustomerAPI

This project is a Customer CRUD application built with Spring Boot, JPA, and MySQL. It provides a RESTful API for managing customers, including creating, updating, fetching, and deleting customer records. Additionally, it includes JWT authentication for secure access and a sync feature to fetch customer data from a remote API.

## Features

- **Create Customer**: Add a new customer.
- **Update Customer**: Update an existing customer.
- **Get Customer List**: Retrieve a list of customers with pagination, sorting, and search capabilities.
- **Get Customer by ID**: Fetch a single customer by ID.
- **Delete Customer**: Remove a customer from the database.
- **JWT Authentication**: Secure the API endpoints using JWT.
- **Sync Customers**: Fetch and sync customer data from a remote API.

## Technologies Used

- **Backend**: Spring Boot
- **Database**: MySQL
- **Authentication**: JWT (JSON Web Token)

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MySQL

### Setup Instructions

1. **Clone the repository:**

    ```sh
    https://github.com/Sushant2518/Sunbase_Assignment.git
    ```

2. **Configure MySQL Database:**

    Create a MySQL database named `customer_db` (or any name of your choice) and update the `application.properties` file with your database details.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/customerdb
    spring.datasource.username=root
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    ```

    ## API Endpoints

### Authentication

- **Login**: Obtain a JWT token.

    ```http
    POST /login
    ```

    **Request Body:**

    ```json
    {
        "username": "your_username",
        "password": "your_password"
    }
    ```

### Customer CRUD Operations

- **Create Customer**

    ```http
    POST /api/customers
    ```

    **Request Body:**

    ```json
    {
        "firstName": "Jane",
        "lastName": "Doe",
        "street": "Elvnu Street",
        "address": "H no 2",
        "city": "Delhi",
        "state": "Delhi",
        "email": "sam@gmail.com",
        "phone": "12345678"
    }
    ```

- **Update Customer**

    ```http
    PUT /api/customers/{id}
    ```

    **Request Body:**

    ```json
    {
        "firstName": "Jane",
        "lastName": "Doe",
        "street": "Elvnu Street",
        "address": "H no 2",
        "city": "Delhi",
        "state": "Delhi",
        "email": "sam@gmail.com",
        "phone": "12345678"
    }
    ```

- **Get Customer List** (with pagination, sorting, and search)

    ```http
    GET /api/customers/list
    ```

    **Query Parameters:**

    - `firstName` (optional): Filter by first name
    - `city` (optional): Filter by city
    - `email` (optional): Filter by email
    - `phone` (optional): Filter by phone
    - `page` (default: 0): Page number
    - `size` (default: 10): Page size
    - `sortBy` (default: "id"): Field to sort by
    - `sortDir` (default: "asc"): Sort direction (asc or desc)

- **Get Customer by ID**

    ```http
    GET /api/customers/{id}
    ```

- **Delete Customer**

    ```http
    DELETE /api/customers/{id}
    ```

### Sync Customers

- **Sync Customers**

    ```http
    POST /sync-customers
    ```

## Sync with Remote API

1. **Authenticate with the Remote API:**

    - Path: `https://qa.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp`
    - Method: POST
    - Request Body:

        ```json
        {
            "login_id": "test@sunbasedata.com",
            "password": "Test@123"
        }
        ```

    - Response: Bearer token

2. **Fetch Customer List:**

    - Path: `https://qa.sunbasedata.com/sunbase/portal/api/assignment.jsp`
    - Method: GET
    - Parameters: `cmd=get_customer_list`
    - Header: `Authorization: Bearer token_received_in_authentication`

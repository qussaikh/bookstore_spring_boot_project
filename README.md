# Create a CI/CD Pipeline with GitHub Actions and AWS
This project is a Maven-based Spring Boot application demonstrating the implementation of a Continuous Integration/Continuous Deployment (CI/CD) pipeline on AWS. The aim is to automate the build, test, and deploy process to streamline the development workflow.

## Features
- Maven-based Spring Boot application.
- Implements CI/CD pipeline on AWS.
- Includes a Build process on GitHub Actions for testing.
- Automatic testing with JUnit tests.
- Application can handle various types of requests.
- Thymeleaf for Client GUI.

## CI/CD Pipeline
The application has a CI/CD pipeline on AWS that automates the build, test, and deploy process. Each push to the GitHub repository triggers the pipeline to ensure a stable and efficient development process.

![build](https://github.com/qussaikh/bookstore_spring_boot_project/assets/106125439/78f9ced1-9b48-4d09-b336-9d92f634e4d5)

![pipeline](https://github.com/qussaikh/bookstore_spring_boot_project/assets/106125439/3fa082cc-3349-4815-bf2d-b7cbf21051a9)

![source build deploy](https://github.com/qussaikh/bookstore_spring_boot_project/assets/106125439/15bf94e7-5227-4914-9874-eb6dbc6a1ceb)


## Testing
Testing is performed automatically with JUnit tests included in the project. GitHub Actions is configured to run these tests on every push.
https://github.com/qussaikh/bookstore_spring_boot_project.git

## Documentation
 Endpoints
- GET /: home page.
- GET /available_books : get all books  .
- POST /save: Creates a new book.
- GET /my_books: get all the book from my book list.
- put /editBook/{id} : edit book by id. 
- DELETE /deleteBook/{id}: Deletes a book by ID.
- DELETE /deleteMyList/{id}: Delete book from my list.
- GET /totalePrice: Get totale price for all my books.


## Hosting
- The application is hosted on AWS and is accessible at the following link:
Open a web browser and go to http://bookstore-beanstalk-env.eba-xpi2ybmt.eu-north-1.elasticbeanstalk.com:8080/ to test the application .
- Or test the application locally http://localhost:8080 


# Create a CI/CD Pipeline with GitHub Actions and AWS
This project is a Maven-based Spring Boot application demonstrating the implementation of a Continuous Integration/Continuous Deployment (CI/CD) pipeline on AWS. The aim is to automate the build, test, and deploy process to streamline the development workflow.

## Features
- Maven-based Spring Boot application.
- Implements CI/CD pipeline on AWS.
- Includes a Build process on GitHub Actions for testing.
- Automatic testing with JUnit tests.
- Application can handle various types of requests.
- Thymeleaf for client GUI. 


Open a web browser and go to http://bookstore-beanstalk-env.eba-xpi2ybmt.eu-north-1.elasticbeanstalk.com:8080/ to test the application locally.

## CI/CD Pipeline
The application has a CI/CD pipeline on AWS that automates the build, test, and deploy process. Each push to the GitHub repository triggers the pipeline to ensure a stable and efficient development process.

![build.png](..%2F..%2FDesktop%2Fbuild.png)

![pipeline.png](..%2F..%2FDesktop%2Fpipeline.png)

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


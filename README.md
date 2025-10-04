Course Registration System - Backend

Backend for Course Registration System using Spring Boot & PostgreSQL.

Features

Course management (enroll courses,list courses,list enrolled students)

Student registration

RESTful API endpoints

Setup

Clone the repo:

git clone https://github.com/Navamani-14/Course-Registration-System-Backend.git
cd Course-Registration-System-Backend


Configure application.properties with your DB credentials.

Build & run:

mvn clean install
mvn spring-boot:run


App runs at: http://localhost:8080

API Examples

GET /courses - List all courses
GET /courses/enrolled – List all enrolled students
POST /courses/register - Register a course

POST /courses/register – Register a student– List all courses

POST /courses/register – Register a student

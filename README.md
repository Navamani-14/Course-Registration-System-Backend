# 📚 Course Registration System - Backend

Spring Boot backend with PostgreSQL for course registration.

## 🔹 Features
- Manage courses: enroll, list courses, list enrolled students  
- Student registration  
- RESTful API endpoints  

## 🚀 Run Locally
```bash
git clone https://github.com/Navamani-14/Course-Registration-System-Backend.git
cd Course-Registration-System-Backend
mvn clean install
mvn spring-boot:run
App runs at http://localhost:8080.

🛠️ API Endpoints
GET /courses – List courses

GET /courses/enrolled – List enrolled students

POST /courses/register – Register a student

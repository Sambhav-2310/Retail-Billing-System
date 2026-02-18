🧾 Retail Billing System (Full Stack POS Application)

A production-ready Full Stack Retail Billing / Point of Sale (POS) System built using Spring Boot + React.js, implementing secure authentication, RESTful APIs, inventory management, and payment integration.

This project demonstrates strong understanding of:

Full Stack Application Architecture

REST API Development

JWT-Based Authentication

Database Design & ORM (JPA/Hibernate)

Payment Gateway Integration

Clean Layered Backend Architecture

React State Management & API Integration

🎥 Project Demonstration

📺 Watch the complete walkthrough:
👉 https://youtu.be/_UNE39gZrV4

🏗️ System Architecture
React (Frontend - WebStorm)
        ↓ REST APIs
Spring Boot (Backend - IntelliJ)
        ↓
      MySQL Database

🚀 Tech Stack
🔵 Backend

Java 17

Spring Boot

Spring Security

JWT Authentication

Spring Data JPA (Hibernate)

MySQL

Maven

🟢 Frontend

React.js

Axios

React Router

Context API

Bootstrap

💳 Integration

Razorpay Payment Gateway

🧰 Tools

IntelliJ IDEA (Backend)

WebStorm (Frontend)

Postman

MySQL Workbench

📂 Project Structure
🔵 Backend Structure (IntelliJ – Spring Boot)
billing-backend/
│
├── src/main/java/com/billing/
│   ├── config/
│   │   ├── SecurityConfig.java
│   │   ├── JwtFilter.java
│   │   └── CorsConfig.java
│   │
│   ├── controller/
│   │   ├── AuthController.java
│   │   ├── CategoryController.java
│   │   ├── ItemController.java
│   │   └── OrderController.java
│   │
│   ├── service/
│   │   ├── AuthService.java
│   │   ├── CategoryService.java
│   │   ├── ItemService.java
│   │   └── OrderService.java
│   │
│   ├── repository/
│   │   ├── UserRepository.java
│   │   ├── CategoryRepository.java
│   │   ├── ItemRepository.java
│   │   └── OrderRepository.java
│   │
│   ├── model/
│   │   ├── User.java
│   │   ├── Category.java
│   │   ├── Item.java
│   │   ├── Order.java
│   │   └── OrderItem.java
│   │
│   └── BillingApplication.java
│
├── src/main/resources/
│   ├── application.properties
│   └── data.sql
│
├── pom.xml
└── README.md

Backend Design Pattern

Layered Architecture (Controller → Service → Repository)

DTO Pattern (optional enhancement)

Stateless JWT Authentication

Role-Based Authorization

🟢 Frontend Structure (WebStorm – React)
billing-frontend/
│
├── public/
│   └── index.html
│
├── src/
│   ├── components/
│   │   ├── Navbar.jsx
│   │   ├── Sidebar.jsx
│   │   ├── Category/
│   │   ├── Items/
│   │   ├── Orders/
│   │   └── Auth/
│   │
│   ├── pages/
│   │   ├── Dashboard.jsx
│   │   ├── Login.jsx
│   │   ├── Register.jsx
│   │   ├── Billing.jsx
│   │   └── OrderHistory.jsx
│   │
│   ├── services/
│   │   ├── ApiService.js
│   │   ├── AuthService.js
│   │   └── OrderService.js
│   │
│   ├── context/
│   │   └── AppContext.jsx
│   │
│   ├── App.js
│   └── index.js
│
├── package.json
└── README.md

Frontend Architecture

Component-based architecture

Centralized API service layer

Context API for global state

Protected Routes for authentication

🔐 Key Features
✔ Authentication & Authorization

User Registration & Login

JWT-based stateless authentication

Role-based access control

✔ Inventory Management

Category CRUD operations

Item CRUD operations

Stock tracking

✔ Billing System

Add items to cart

Auto total calculation

Generate order records

View order history

✔ Payment Integration

Razorpay order creation

Payment verification

Secure backend validation

🗄️ Database Design
Core Entities

User

Category

Item

Order

OrderItem

Relationships
User      1 --- *  Order
Category  1 --- *  Item
Order     1 --- *  OrderItem

⚙️ Setup Instructions
🖥️ Backend Setup (IntelliJ)
1️⃣ Create Database
CREATE DATABASE billing_db;

2️⃣ Configure application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/billing_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run Backend
mvn spring-boot:run


Backend runs at:

http://localhost:8080

🌐 Frontend Setup (WebStorm)
1️⃣ Install Dependencies
npm install

2️⃣ Start Application
npm start


Frontend runs at:

http://localhost:3000

🔄 API Communication Example
axios.get("http://localhost:8080/api/categories", {
  headers: {
    Authorization: "Bearer " + token
  }
});

🧪 Testing

Postman for API testing

MySQL Workbench for database verification

Chrome DevTools for frontend debugging

📈 Scalability & Future Enhancements

Docker containerization

Redis caching

Admin analytics dashboard

Invoice PDF generation

Cloud deployment (AWS / Render)

CI/CD pipeline integration

🎯 Why This Project Stands Out

Real-world business use case

Secure authentication implementation

Clean backend architecture

Proper database relationships

Payment gateway integration

Resume-ready full stack application

👨‍💻 Developer

Sambhav Gupta
B.Tech – Information Science Engineering
Full Stack Developer | Java | Spring Boot | React

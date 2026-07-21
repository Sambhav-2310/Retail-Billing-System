# 🧾 Retail Billing System (Full Stack POS Application)

A production-ready **Full Stack Retail Billing / Point of Sale (POS) Application** built using **Spring Boot + React.js**, implementing secure authentication, RESTful APIs, inventory management, billing, and Razorpay payment integration.

This project demonstrates strong understanding of:

- Full Stack Application Development
- REST API Design & Integration
- JWT-Based Authentication
- Inventory & Billing Management
- Database Design using JPA/Hibernate
- Secure Backend Architecture
- React State Management
- Responsive UI Development
- Payment Gateway Integration
- Production Deployment

---

# 🏗️ System Architecture

```
React.js Frontend
        ↓
     REST APIs
        ↓
Spring Boot Backend
        ↓
    MySQL Database
```

---

# 🚀 Tech Stack

## 🔵 Backend

- Java 17
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA (Hibernate)
- MySQL
- Maven

## 🟢 Frontend

- React.js
- Axios
- React Router
- Context API
- Bootstrap / Tailwind CSS
- React Hot Toast
- Lucide React Icons

## 💳 Payment Integration

- Razorpay Payment Gateway

## 🧰 Tools

- IntelliJ IDEA
- VS Code / WebStorm
- Postman
- MySQL Workbench
- Git & GitHub

---

# 📂 Project Structure

## 🔵 Backend Structure (Spring Boot)

```text
billing-backend/
│
├── src/main/java/com/billing/
│
├── config/
│   ├── SecurityConfig.java
│   ├── JwtFilter.java
│   └── CorsConfig.java
│
├── controller/
│   ├── AuthController.java
│   ├── CategoryController.java
│   ├── ItemController.java
│   ├── OrderController.java
│   └── PaymentController.java
│
├── service/
│   ├── AuthService.java
│   ├── CategoryService.java
│   ├── ItemService.java
│   ├── OrderService.java
│   └── PaymentService.java
│
├── repository/
│   ├── UserRepository.java
│   ├── CategoryRepository.java
│   ├── ItemRepository.java
│   ├── OrderRepository.java
│   └── OrderItemRepository.java
│
├── model/
│   ├── User.java
│   ├── Category.java
│   ├── Item.java
│   ├── Order.java
│   └── OrderItem.java
│
└── BillingApplication.java

resources/
│
├── application.properties
└── data.sql

pom.xml
README.md
```

### Backend Design Pattern

- Layered Architecture (Controller → Service → Repository)
- JWT Stateless Authentication
- Secure REST APIs
- Role-Based Authorization
- DTO Pattern

---

## 🟢 Frontend Structure (React.js)

```text
billing-frontend/
│
├── public/
│
├── src/
│
├── components/
│   ├── Navbar.jsx
│   ├── Sidebar.jsx
│   ├── Category/
│   ├── Items/
│   ├── Billing/
│   └── Auth/
│
├── pages/
│   ├── Dashboard.jsx
│   ├── Login.jsx
│   ├── Register.jsx
│   ├── Billing.jsx
│   ├── Inventory.jsx
│   └── OrderHistory.jsx
│
├── services/
│   ├── ApiService.js
│   ├── AuthService.js
│   └── OrderService.js
│
├── context/
│   └── AppContext.jsx
│
├── App.js
└── index.js

package.json
README.md
```

### Frontend Architecture

- Component-Based Architecture
- Protected Routes
- Global State Management with Context API
- Centralized API Layer
- Real-Time Notifications

---

# 🔐 Key Features

## ✔ Authentication & Security

- User Registration
- Secure Login
- JWT-Based Authentication
- Protected Routes
- Role-Based Access

---

## ✔ Inventory Management

- Category CRUD
- Product CRUD
- Stock Tracking
- Product Search
- Product Management

---

## ✔ Billing System

- Add Products to Cart
- Quantity Management
- Automatic Bill Calculation
- Generate Orders
- Order History

---

## ✔ Payment Integration

- Razorpay Order Creation
- Secure Payment Verification
- Payment Success & Failure Handling

---

## ✔ Dashboard

- Total Revenue
- Total Orders
- Inventory Overview
- Recent Sales
- Business Insights

---

## ✔ User Experience

- Responsive UI
- Toast Notifications
- Loading Indicators
- Modern Dashboard Design

---

# 🗄️ Database Design

## Core Entities

- User
- Category
- Item
- Order
- OrderItem

### Relationships

```
User
 └── 1 ------ * Order

Category
 └── 1 ------ * Item

Order
 └── 1 ------ * OrderItem
```

---

# ⚙️ Setup Instructions

## 🖥️ Backend Setup

### 1️⃣ Create Database

```sql
CREATE DATABASE billing_db;
```

### 2️⃣ Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/billing_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Run Backend

```bash
mvn spring-boot:run
```

Backend URL

```
http://localhost:8080
```

---

## 🌐 Frontend Setup

### 1️⃣ Install Dependencies

```bash
npm install
```

### 2️⃣ Run Frontend

```bash
npm start
```

Frontend URL

```
http://localhost:3000
```

---

# 🔄 API Communication Example

```javascript
axios.get("http://localhost:8080/api/categories", {
  headers: {
    Authorization: "Bearer " + token
  }
});
```

---

# 🧪 Testing & Debugging

- Postman for API Testing
- MySQL Workbench for Database Verification
- Chrome DevTools
- Console Logs

---

# 📸 Screenshots

Add screenshots here for:

- Login Page
- Registration Page
- Dashboard
- Inventory
- Billing Screen
- Order History
- Razorpay Payment

---

# 📈 Future Enhancements

- Invoice PDF Generation
- Barcode Scanner
- GST Billing
- Admin Analytics Dashboard
- Docker Support
- Redis Caching
- AWS Deployment
- CI/CD Pipeline

---

# 🎯 Why This Project Stands Out

- Real-world Retail Billing & POS System
- Secure Authentication using JWT
- Razorpay Payment Integration
- Inventory Management
- Full Stack Deployment Ready
- Modern Responsive Dashboard
- Clean Scalable Backend Design
- Resume-ready Advanced Project

---

# 👨‍💻 Developer

**Sambhav Gupta**

**B.Tech – Information Science Engineering**

**Full Stack Developer | Java | Spring Boot | React**

---

# ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub!

# 🛒 Multi-Tenant SaaS POS System

A full-stack, multi-tenant **Point of Sale (POS)** application built with **Java Spring Boot**, **React + Redux** and **MySQL**. It supports multiple stores and branches, role-based dashboards, inventory tracking, orders, refunds, shift reports and online payments through Razorpay and Stripe.

![Java](https://img.shields.io/badge/Java-17+-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?logo=springboot)
![React](https://img.shields.io/badge/React-18-61DAFB?logo=react)
![Redux](https://img.shields.io/badge/Redux-Toolkit-764ABC?logo=redux)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1?logo=mysql)

---

## 📸 Screenshots
(later)

| Cashier Terminal | Branch Manager Dashboard | Store Admin Panel |
|---|---|---|
| ![Cashier](screenshots/cashier.png) | ![Branch](screenshots/branch.png) | ![Admin](screenshots/admin.png) |

---

## ✨ Features

### Three role-based dashboards
- **💰 Cashier Terminal** for customer checkout: product search, cart, payments and invoice printing
- **📊 Branch Manager Dashboard** to oversee a single location: sales, inventory, employees and shift reports
- **🏢 Store Admin Panel** to manage multiple branches, products, categories and analytics

### Core functionality
- 🔐 JWT authentication with **Spring Security** and role-based access control
- 🏬 Multi-tenant architecture: stores → branches → employees
- 📦 Product and category management with **Cloudinary** image uploads
- 📈 Real-time inventory tracking with low-stock alerts
- 🧾 Order processing, invoice generation and printing
- ↩️ Complete refund processing
- ⏱️ Shift reports and daily sales summaries
- 👥 Customer management with loyalty points
- 💳 Payments by Card, UPI, Cash and Wallet via **Razorpay** and **Stripe**
- 📊 Sales trends and KPI analytics
- 💼 Subscription plans with branch and user limits

---

## 🧰 Tech Stack

| Layer | Technologies |
|---|---|
| **Frontend** | React, Redux Toolkit, shadcn/ui, Tailwind CSS, Axios |
| **Backend** | Java, Spring Boot, Spring Security (JWT), Spring Data JPA / Hibernate |
| **Database** | MySQL |
| **Payments** | Razorpay, Stripe |
| **Media** | Cloudinary |
| **Build tools** | Maven, npm / Vite |

---

## 📁 Project Structure

```
pos-system/
├── backend/                 # Spring Boot REST API
│   ├── src/main/java/...
│   │   ├── controller/      # REST controllers
│   │   ├── service/         # Business logic
│   │   ├── repository/      # JPA repositories
│   │   ├── model/           # Entities
│   │   ├── payload/         # DTOs / request & response objects
│   │   └── configuration/   # Security, JWT, CORS
│   ├── src/main/resources/
│   │   └── application.properties
│   └── pom.xml
└── frontend/                # React + Redux app
    ├── src/
    │   ├── components/
    │   ├── pages/           # Cashier, Branch, Store Admin
    │   ├── Redux Toolkit/   # Slices & thunks
    │   └── utils/
    └── package.json
```

> Adjust this tree to match your actual folders.

---

## 🔌 API Modules

| Module | Base Path | Description |
|---|---|---|
| Auth | `/auth` | Sign up, login, JWT |
| Users | `/api/users` | User profile & management |
| Stores | `/api/stores` | Store (tenant) management |
| Branches | `/api/branches` | Branch CRUD |
| Categories | `/api/categories` | Product categories |
| Products | `/api/products` | Product CRUD & search |
| Inventory | `/api/inventories` | Stock levels per branch |
| Employees | `/api/employees` | Staff & roles |
| Customers | `/api/customers` | Customers & loyalty |
| Orders | `/api/orders` | Checkout & order history |
| Refunds | `/api/refunds` | Refund processing |
| Shift Reports | `/api/shift-reports` | Shift start/end & summaries |

> Paths are examples. Update them to match your controllers.

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+
- Node.js 18+ and npm
- MySQL 8+
- Razorpay / Stripe test keys (optional)
- Cloudinary account (optional, for image uploads)

### 1. Clone the repository
```bash
git clone https://github.com/<your-username>/<your-repo>.git
cd <your-repo>
```

### 2. Set up the database
```sql
CREATE DATABASE pos_system;
```

### 3. Configure the backend
Edit `backend/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/pos_system
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# JWT
jwt.secret=YOUR_JWT_SECRET

# Payments
razorpay.api.key=YOUR_RAZORPAY_KEY
razorpay.api.secret=YOUR_RAZORPAY_SECRET
stripe.api.key=YOUR_STRIPE_SECRET_KEY
```

> ⚠️ Never commit real keys. Use environment variables or a git-ignored `application-local.properties`.

### 4. Run the backend
```bash
cd backend
mvn clean install
mvn spring-boot:run
```
The API runs at `http://localhost:8080` (or the port set in your config).

### 5. Run the frontend
```bash
cd frontend
npm install
npm run dev
```
The app opens at `http://localhost:5173`.

Create a `.env` file in `frontend/` if needed:
```env
VITE_API_URL=http://localhost:8080
VITE_CLOUDINARY_CLOUD_NAME=your_cloud_name
VITE_CLOUDINARY_UPLOAD_PRESET=your_preset
```

---

## 👤 User Roles

| Role | Access |
|---|---|
| `ROLE_STORE_ADMIN` | Manages all branches, products, employees and analytics |
| `ROLE_BRANCH_MANAGER` | Manages one branch: inventory, staff, reports |
| `ROLE_BRANCH_CASHIER` | Uses the POS terminal: orders, payments, refunds |

> Update role names to match your enum.

---

## 🗺️ Roadmap
- [ ] Barcode scanner support
- [ ] Offline mode for cashier terminal
- [ ] Export reports to PDF / Excel
- [ ] Docker setup
- [ ] Unit & integration tests

---

## 🙏 Acknowledgements

This project was built by following the course **"Build an Enterprise Multi-Tenant SaaS POS Application | Java Spring Boot + React + Redux"** by [Code With Zosh](https://www.youtube.com/@CodeWithZosh).
📺 Video: https://youtu.be/wZHYA31SsUI

---

## 📬 Contact

**Your Name**
- GitHub: [@your-username](https://github.com/your-username)
- LinkedIn: [your-linkedin](https://linkedin.com/in/your-linkedin)
- Email: your.email@example.com

⭐ If you found this project useful, consider giving it a star!

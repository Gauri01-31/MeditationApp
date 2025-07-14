# 🧘‍♀️ MeditationApp

Welcome to **MeditationApp**, a web-based application designed to help users explore various meditation techniques and practices such as mindfulness, body scan, mantra meditation, and more. This project is built using **Java (Servlets & JSP)**, **HTML/CSS**, and **Maven**, with an integrated SQL-based backend.

---

## 🌟 Features

- 🔐 User Login and Logout
- 🧘‍♂️ Guided Meditation Sessions (Mindfulness, Chakra, Mantra, etc.)
- 🎨 Visually rich interface with meditation-themed images
- 📜 Dynamic JSP pages with servlet-based backend
- 📁 Organized DAO and Model architecture
- 🗂 SQL schema integration for database setup

---

## 🏗 Project Structure

MeditationApp-Main/
├── src/
│ ├── main/
│ │ ├── java/com/user/
│ │ │ ├── dao/
│ │ │ ├── model/
│ │ │ └── servlet/
│ │ └── webapp/
│ │ ├── images/
│ │ ├── css/
│ │ ├── loginpage.html, logout.jsp, index.jsp, website.html
│ │ └── WEB-INF/
│ └── test/java/com/user/dao/UserDAOTest.java
├── schema.sql
├── pom.xml
└── README.md


---

## ⚙️ Technologies Used

- **Java Servlets & JSP**
- **Maven** – for dependency management
- **HTML5, CSS3** – for front-end structure and styling
- **JDBC + SQL** – for database operations

---

## 🚀 Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/MeditationApp.git
   cd MeditationApp

---

## ⚙️ Technologies Used

- **Java Servlets & JSP**
- **Maven** – for dependency management
- **HTML5, CSS3** – for front-end structure and styling
- **JDBC + SQL** – for database operations

---

## 🚀 Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/MeditationApp.git
   cd MeditationApp
2.Import the project into your IDE (Eclipse/IntelliJ) as a Maven project.

3.Configure your database:
  Create a database (e.g., meditation_db)
 /Run the SQL script schema.sql to create necessary tables.

4. Update database credentials in your UserDAO.java or DBUtil.java.

5.Run the app on a servlet container (Apache Tomcat recommended).

6.Access the app
  http://localhost:8080/MeditationApp/loginpage.html

🧪 Testing
Run unit tests for DAO classes using:
  Right-click on UserDAOTest.java → Run as JUnit Test



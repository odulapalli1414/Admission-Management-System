# Admission & Student Fee Management System

A Java-based desktop application designed to streamline the management of student admissions and fees for educational institutions. This system includes features for student record management, fee management, and utility tools. Built with **Swing** for the graphical interface, it uses **PostgreSQL** and **MySQL** for backend data management, offering a flexible and scalable solution.

---

## Features

### 1. **Login System**
- Secure authentication for authorized users.
- Ensures restricted access to sensitive information.

### 2. **Student Management**
- Add, update, and view student details.
- Automatically populates student data based on the roll number.
- Supports detailed records such as name, father's name, address, phone number, and academic details.

### 3. **Fee Management**
- View and update fee structures.
- Record and track fee payments.
- Integrates semester-wise fee structures for better transparency.

### 4. **Utility Tools**
- **Calculator** for quick calculations.
- **Notepad** for maintaining quick notes or records.

### 5. **Dynamic Dashboard**
- Centralized control panel to access all features.
- Provides a user-friendly and intuitive interface.

---

## Tech Stack

- **Frontend:** Java Swing for GUI design.
- **Backend:**
  - PostgreSQL database for admission management.
  - MySQL database for fee management.
- **Libraries:**
  - `JDateChooser` for date selection.
  - `DbUtils` for database result visualization.

---

## Setup and Installation

### Prerequisites
- **Java Development Kit (JDK)** (version 8 or later) installed on your system.
- **PostgreSQL** and **MySQL** databases installed and configured.
- IDE or text editor for running Java applications (e.g., IntelliJ IDEA, Eclipse, or VS Code).

### Database Configuration

#### PostgreSQL Database
1. Install PostgreSQL and create a database named `AdmissionManagementSystem`.
2. Run the following SQL script to create the required tables:
   ```sql
   CREATE TABLE student (
       name VARCHAR(50),
       fname VARCHAR(50),
       rollno VARCHAR(20) PRIMARY KEY,
       dob DATE,
       address VARCHAR(100),
       phone VARCHAR(15),
       email VARCHAR(50),
       x FLOAT,
       xii FLOAT,
       aadhar VARCHAR(20),
       course VARCHAR(20),
       branch VARCHAR(30)
   );

   CREATE TABLE login (
       username VARCHAR(20) PRIMARY KEY,
       password VARCHAR(20)
   );

   CREATE TABLE fee (
       rollno VARCHAR(20),
       course VARCHAR(20),
       amount FLOAT
   );

## Configuration

### Clone this repository:
```bash
git clone https://github.com/your-username/admission-and-fee-management.git
cd admission-and-fee-management

    rollno VARCHAR(10),
    course VARCHAR(50),
    branch VARCHAR(50),
    semester VARCHAR(50),
    total FLOAT
);

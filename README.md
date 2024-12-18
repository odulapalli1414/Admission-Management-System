# Admission & Student Fee Management System

A Java-based desktop application designed to streamline the management of student admissions and fees for educational institutions. This system includes features for student record management, fee management, and utility tools. Built with **Swing** for the graphical interface, it uses **PostgreSQL** for backend data management, offering a flexible and scalable solution.

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
- **Libraries:**
  - `JDateChooser` for date selection.
  - `DbUtils` for database result visualization.

---

## Setup and Installation

### Prerequisites
- **Java Development Kit (JDK)** (version 8 or later) installed on your system.
- **PostgreSQL** databases installed and configured.
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
    username VARCHAR(25), 
    password VARCHAR(25)
   );

   CREATE TABLE student (
    name VARCHAR(40), 
    fname VARCHAR(40), 
    rollno VARCHAR(20), 
    dob VARCHAR(40), 
    address VARCHAR(100), 
    phone VARCHAR(20), 
    email VARCHAR(40), 
    class_x VARCHAR(20), 
    class_xii VARCHAR(20), 
    aadhar VARCHAR(20), 
    course VARCHAR(40), 
    branch VARCHAR(40)
   );



   INSERT INTO login VALUES ('admin', '12345');

   CREATE TABLE fee (
    course VARCHAR(20), 
    semester1 VARCHAR(20), 
    semester2 VARCHAR(20), 
    semester3 VARCHAR(20), 
    semester4 VARCHAR(20), 
    semester5 VARCHAR(20), 
    semester6 VARCHAR(20), 
    semester7 VARCHAR(20), 
    semester8 VARCHAR(20)
   );
   INSERT INTO fee VALUES ('BTech', 48000, 43000, 43000, 43000, 43000, 43000, 43000, 43000);
   INSERT INTO fee VALUES ('BSc', 40000, 35000, 35000, 35000, 35000, 35000, NULL, NULL);
   INSERT INTO fee VALUES ('BCA', 35000, 34000, 34000, 34000, 34000, 34000, NULL, NULL);
   INSERT INTO fee VALUES ('MTech', 65000, 60000, 60000, 60000, NULL, NULL, NULL, NULL);
   INSERT INTO fee VALUES ('MSc', 47500, 45000, 45000, 45000, NULL, NULL, NULL, NULL);
   INSERT INTO fee VALUES ('MCA', 43000, 42000, 42000, 49000, NULL, NULL, NULL, NULL);
   INSERT INTO fee VALUES ('BCom', 22000, 20000, 20000, 20000, 20000, 20000, NULL, NULL);
   INSERT INTO fee VALUES ('MCom', 36000, 30000, 30000, 30000, NULL, NULL, NULL, NULL);

   CREATE TABLE collegefee (
    rollno VARCHAR(20), 
    course VARCHAR(20), 
    branch VARCHAR(20), 
    semester VARCHAR(20), 
    total VARCHAR(20)
   );

## Contributing

Contributions are welcome! Please feel free to:

- Open an issue for any bugs or feature requests.
- Submit a pull request for any improvements or new features you'd like to add.

We appreciate your contributions!


# Bank-Account-Management-System

A desktop banking application built using **Java Swing**, **AWT**, **JDBC**, and **MySQL Workbench**. This project demonstrates core ATM and account management operations with proper **exception handling** and a structured **menu-driven interface**.

---

## 🛠 Tech Stack

* **Java Swing & AWT** → GUI (Graphical User Interface)
* **JDBC** → Database connectivity
* **MySQL Workbench** → Database management
* **Exception Handling** → Robust error management
* **File Handling** → Loading and displaying images

---

## 📌 Key Features

* ✅ Create Account (multi-step signup process)
* ✅ Login / Sign in
* ✅ Fill personal & address details
* ✅ Deposit money
* ✅ Withdraw money
* ✅ Fast Cash (quick withdrawal)
* ✅ Balance check
* ✅ Update PIN
* ✅ View Mini Statement (transaction history)
* ✅ Exception handling for invalid inputs and DB errors

---

## 📂 Project Structure

 ![Project Structure](outputs/projectStructure.png)  
---

## 🖼 UI Screenshots (stored in `/outputs`)
- **Code Execution Preview:** ![Code](outputs/code.png)
- **Login / Sign in:** ![Login](outputs/login.png)
- **Signup Page 1:** ![Signup Page 1](outputs/signupPage1.png)  
- **Signup Page 2:** ![Signup Page 2](outputs/signupPage2.png)  
- **Signup Page 3:** ![Signup Page 3](outputs/signupPage3.png)  
- **Signup Page 4:** ![Signup Page 4](outputs/signupPage4.png)  
- **Signup Page 5:** ![Signup Page 5](outputs/SignupPage5.png)
- **ATM Interface:** ![ATM](outputs/atm.png)
- **Main Menu (All Options):** ![Main Menu](outputs/mainMenu.png)  
- **Balance Inquiry:** ![Current Balance](outputs/currentBalance.png)  
- **Deposit Form:** ![Deposit](outputs/deposit.png)
- **Withdrawal Form:** ![Withdrawal](outputs/withdrawal.png)  
- **Fast Cash (Quick Withdrawal):** ![Fast Cash](outputs/fastCash.png)  
- **Mini Statement:** ![Mini Statement](outputs/miniStatement.png)  
- **PIN Change Form:** ![Pin Change](outputs/pinChange.png)  

---

## 🗄 Database Schema (MySQL Workbench Screenshots)
- **Login Database Table:** ![Login Database](outputs/loginDataBase.png)  
- **Signup Details Table:** ![Signup Details](outputs/signupDetails.png)
- **Customer Details Table:** ![Customer Details](outputs/customerDetails.png) 
- **Card Number Table:** ![Card Number](outputs/cardNumber.png)  
- **Transaction History Table:** ![Transaction History](outputs/TransactionHistory.png)  

---

## 🚀 How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/yourusername/Bank-Account-Management-System.git

## 🚀 How to Run

1. Clone the repo

   ```bash
   git clone https://github.com/yourusername/Bank-Account-Management-System.git
   ```
2. Import SQL schema into **MySQL Workbench**

   ```sql
   source sql/schema.sql;
   ```
3. Configure JDBC connection in `DBUtil.java`

   ```java
   String url = "jdbc:mysql://localhost:3306/bank_db";
   String user = "root";
   String password = "your_password";
   ```
4. Run `Main.java` from IDE (IntelliJ/Eclipse/NetBeans)

---

## 📖 Learning Outcomes

* Java Swing GUI design
* Event handling & Exception handling
* JDBC + SQL integration
* Multi-step form handling
* Transaction management
* Modular code structure with MVC approach

---

## 📌 Author

**Deepak Kumar**
🎓 Computer Science Student | 💻 Java & SpringBoot Backend Developer | 🔗 [LinkedIn](https://www.linkedin.com/)

# Internet-Banking
# ATM Simulator 💳

## Project Overview
The **ATM Simulator** is a comprehensive banking application designed in **Java**. It replicates the functionality of a real-world ATM, enabling users to perform essential banking operations such as deposits, withdrawals, and balance inquiries through a simple GUI.

---

## Features 🚀
- **User Authentication**: Secure login system for account holders.
- **Balance Enquiry**: Check the current account balance.
- **Deposits**: Add money to your account.
- **Withdrawals**: Withdraw funds with a single click.
- **Fast Cash**: Quickly withdraw predefined amounts.
- **Mini Statement**: View recent transaction history.
- **Pin Change**: Update ATM PIN securely.
- **Account Registration**: New users can register directly via the simulator.

---

## Project Structure 📂
- **Source Files** (`src` folder):  
  - Core banking logic implemented in Java classes:
    - `Login.java`, `SignUpOne.java`, `SignUpTwo.java`, `SignUpThree.java` – User authentication and registration.
    - `BalanceEnquiry.java`, `Deposit.java`, `Withdrawl.java`, `FastCash.java` – Core banking operations.
    - `PinChange.java`, `MiniStatement.java`, `Transactions.java` – Additional features.
    - `Conn.java` – Database connectivity using JDBC.
    - `Main.java` – Entry point for the application.
  - **Icons**: Contains visual assets used in the application.

- **Database**: PostgreSQL is used to store user details, transaction history, and account data.
  - Connection handled via `Conn.java`.

---

## How to Run 🖥️
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/ATM-Simulator.git
   ```

# ATM Simulator 🏧

## Technologies Used 🛠️
- **Java Swing**: For the graphical user interface.
- **JDBC**: For database interaction.
- **PostgreSQL**: As the database backend.

## Screenshots 📸
(Add screenshots of your application here to make the README more visually appealing.)

## License 📜
This project is open-source and free to use. Feel free to contribute or customize it to suit your needs!

## Acknowledgments 🙏
Special thanks to **[Your Name]** for developing this project as a part of their learning journey.

Enjoy exploring the ATM Simulator! 💰

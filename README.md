# Learn Sphere 🎓

**Learn Sphere** is an educational web application built using **Java Spring Boot**, designed to connect **students** and **trainers** on a learning platform. It supports user registration, login, course purchase, and payment integration using **Razorpay API** (test mode). Future updates are planned to add more features and improvements.

## 🔧 Tech Stack

- **Backend**: Java (Spring Boot)
- **Frontend**: JSP / HTML / CSS
- **Database**: MySQL
- **Payment Integration**: Razorpay API (test mode)
- **Build Tool**: Maven

## ✅ Core Functionalities

### 👥 User Roles

- **Student**
- **Trainer**

### 🔐 Authentication

- Separate **Login/Register** options for **Students** and **Trainers**
- Session-based access control

### 📚 Student Features

- View available courses
- Purchase courses using **Razorpay API**
- Access enrolled courses

### 👨‍🏫 Trainer Features

- Add new courses
- Manage their uploaded courses

## 🚀 How to Run

1. Clone the repository

git clone https://github.com/rashid262/learn-sphere.git
cd learn-sphere


2. Setup the database
- Create a MySQL database (e.g., `learn_sphere`)
- Update your DB username & password in `src/main/resources/application.properties`

3. Build and run the project

mvn clean install
mvn spring-boot:run


4. Open the app in your browser

http://localhost:8080


## 💳 Razorpay Integration

- Razorpay API is integrated in **test mode** for payments
- Students can pay for courses (simulated, no real money used)
- In future, you can switch to live mode for production

## 🔮 Future Plans

- Add quiz and assignment modules
- Track course progress for students
- Generate completion certificates
- Admin dashboard for user/course control
- Course reviews and ratings system

## 📬 Contributing

Pull requests are welcome!  
If you have suggestions or want to add something cool, fork the repo and send a PR.

## 📄 License

This project is licensed under the **MIT License**.  
Feel free to use and modify it as needed.

---

**Made with ❤️ by Rashid**

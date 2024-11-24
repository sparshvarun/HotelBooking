# 🏨 Hotel Booking Management System

A full-stack hotel booking and management application built with Spring Boot, ReactJS, and MySQL. The system allows users to browse rooms, make bookings, and administrators to manage rooms and bookings efficiently.

## 🌟 Features

### User Features
- Browse available rooms with dynamic filtering
- View detailed room information with images
- Real-time booking system with date validation
- User registration and authentication
- Booking management (view, cancel bookings)
- Responsive design for all devices

### Admin Features
- Comprehensive dashboard for booking management
- Room management (add, edit, delete)
- Image upload with AWS S3 integration
- User management system
- Booking status monitoring

## 🛠️ Technical Stack

### Backend
- **Framework:** Spring Boot
- **Security:** Spring Security with JWT
- **Database:** MySQL
- **ORM:** JPA/Hibernate
- **Cloud Storage:** AWS S3
- **Build Tool:** Maven

### Frontend
- **Library:** React.js
- **State Management:** React Hooks
- **Styling:** CSS/SCSS
- **HTTP Client:** Axios
- **UI Components:** Material-UI

## 🔌 API Endpoints

###Authentication
POST /api/auth/register - Register new user

POST /api/auth/login - User login

###Rooms
GET /api/rooms/all - Get all rooms

GET /api/rooms/room-by-id/{roomId} - Get specific room

POST /api/rooms/add - Add new room (Admin)

PUT /api/rooms/update/{roomId} - Update room (Admin)

DELETE /api/rooms/delete/{roomId} - Delete room (Admin)

###Bookings
POST /api/bookings/book-room/{roomId}/{userId} - Create booking

GET /api/bookings/get-by-confirmation-code/{confirmationCode} - Get booking by confirmation code

DELETE /api/bookings/cancel/{bookingId} - Cancel booking

GET /api/bookings/all - Get all bookings (Admin)

###Users
GET /api/users/all - Get all users (Admin)

GET /api/users/get-by-id/{userId} - Get specific user

DELETE /api/users/delete/{userId} - Delete user (Admin)

GET /api/users/get-logged-in-profile-info - Get logged-in user profile

GET /api/users/get-user-bookings/{userId} - Get user bookings

## 🔒 Security Features
- JWT based authentication
- Password encryption using BCrypt
- Role-based access control (User, Admin)
- Secure endpoints
- Input validation
- XSS protection

## 📸 Screenshots
<img width="1440" alt="Screenshot 2024-11-25 at 12 00 57 AM" src="https://github.com/user-attachments/assets/b23e1169-5f3f-462b-b6bf-005476537391">

<img width="1440" alt="Screenshot 2024-11-25 at 12 01 08 AM" src="https://github.com/user-attachments/assets/f1367299-efbc-4f4d-a307-a3f5240cfc45">


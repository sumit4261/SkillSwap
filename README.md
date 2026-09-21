# SkillSwap

SkillSwap is a Java-based skill exchange platform that connects people who want to learn skills with people who can teach them.

Instead of paying for every learning session, users can exchange knowledge, discover compatible learning partners, and eventually use a credit-based system to facilitate skill exchanges.

## 🚀 Project Goal

The main goal of SkillSwap is to create a platform where users can:

- Add skills they can teach
- Add skills they want to learn
- Specify their skill level
- Discover compatible users
- Send skill exchange requests
- Communicate with matched users
- Build a learning network

AI-powered recommendations may be integrated in a later phase.

---

## 🛠️ Tech Stack

### Backend

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Maven
- REST APIs

### Database

- MySQL
- MySQL Workbench

### Development Tools

- IntelliJ IDEA
- Postman
- Git
- GitHub

### Planned Technologies

- Spring Security
- JWT Authentication
- WebSocket / STOMP
- AI-based recommendation system
- Skill credit system

---

## 🏗️ Architecture

```text
React Frontend
       │
       │ REST API
       ▼
Spring Boot Backend
       │
       ├── Controller
       │
       ├── Service
       │
       ├── Repository
       │
       ▼
   JPA / Hibernate
       │
       ▼
     MySQL

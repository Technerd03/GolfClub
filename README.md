# Author: Alexander Escott
# Title: Golf Club Api
# Hours taken: 9
# difficulty: 5 out of 10
# ressources used: Youtube, Class Lectures, Stack
 
# GolfTournamentApiRepo
# Golf Club Management System

This is a Spring Boot-based application that manages members, tournaments, and their relationships. The system provides REST APIs for performing CRUD operations and searching members and tournaments using flexible filters.

---

## Features

### Members
- Add a new member.
- Retrieve all members.
- Search members by:
  - Name
  - Membership type (duration)
  - Phone number
  - Start date of membership

### Tournaments
- Add a new tournament.
- Retrieve all tournaments.
- Search tournaments by:
  - Start date
  - Location
  - Find all members in a tournament

---

## API Endpoints

### Members Endpoints
1. **Add Member**
   - **POST** `/members`
   - **Member Ex**:
     ```json
     {
       "name": "Simon Wells",
       "address": "143 Golf Avenue",
       "email": "Simon1221@gmail.com",
       "phoneNumber": "798-3224",
       "startDateOfMembership": "2024-01-01",
       "durationOfMembership": 12
     }
     ```
   - **Description**: Adds a new member to the database.

2. **Get All Members**
   - **GET** `/members`
   - **Description**: Retrieves a list of all members.

3. **Search Members**
   - **GET** `/members?name=Simon&duration=12`
   - **Query Parameters**:
     - `name`: Search by member name.
     - `duration`: Filter by membership duration.
     - `phoneNumber`: Filter by phone number.
     - `startDateOfMembership`: Filter by membership start date.
   - **Description**: Filters members based on the provided criteria.

---

### Tournaments Endpoints
1. **Add Tournament**
   - **POST** `/tournaments
     ```json
     {
       "startDate": "2024-03-15",
       "endDate": "2024-03-20",
       "location": "Golf Park",
       "entryFee": 100.0,
       "cashPrize": 7000.0
     }
     ```
   - **Description**: Adds a new tournament to the database.

2. **Get All Tournaments**
   - **GET** `/tournaments`
   - **Description**: Retrieves a list of all tournaments.

3. **Search Tournaments**
   - **GET** `/tournaments?location=Golf Park&startDate=2024-03-15`
   - **Query Parameters**:
     - `startDate`: Filter by tournament start date.
     - `location`: Filter by tournament location.
     - `tournamentId`: Find all members in a tournament using the tournament ID.
   - **Description**: Filters tournaments based on the provided criteria.

---

## Running the Project with Docker

### Prerequisites
- Docker installed on your system.
- Docker Compose installed.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Technerd03/golfclub.git
   cd golfclub

2. Build the Docker image:

  ```bash
docker-compose up --build

3. Verify the application:
The application will run on http://localhost:8080.
Use the Postman Collection file to test the API endpoints.

## Database Initialization
The application includes a data.sql file to preload the database with sample members and tournaments. This ensures that the application has test data on the first run.

### Data
Members:
Gale Brawn (ID: 1)
Ellis Ash (ID: 2)
Evan Stevens (ID: 3)
Reginald Walker (ID: 4)

###Tournaments:
Green Valley Course (ID: 1)
Sunny Golf Resort (ID: 2)
Development and Testing
Run the application locally:

### Development and Testing
1.Run the application locally:
  ```bash
mvn spring-boot:run

2.Run tests:
  ```bash
mvn test

3.View logs for Docker containers:
  ```bash
docker logs <container_id>

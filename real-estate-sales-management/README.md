# Real Estate Sales & Management System

## Overview
The Real Estate Sales & Management System is designed to manage real estate sales for a subdivision consisting of 5 blocks with 20 lots per block. The application allows users to specify desired lot descriptions, including size, location, and price, and provides functionalities for selling and reserving lots.

## Features
- **Lot Management**: Users can specify and view lots based on size, location, and price.
- **Reservation and Sales Processing**: The system allows for the reservation and sale of lots to buyers.
- **Reporting**: Generate reports that display all lots with their complete information and status (sold or available).

## Project Structure
```
real-estate-sales-management
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── realestate
│   │   │   │       ├── Main.java
│   │   │   │       ├── models
│   │   │   │       │   └── Lot.java
│   │   │   │       ├── services
│   │   │   │       │   └── LotService.java
│   │   │   │       ├── views
│   │   │   │       │   └── MainView.java
│   │   │   │       └── utils
│   │   │   │           └── ReportGenerator.java
│   │   └── resources
│   │       └── application.properties
├── UML
│   └── diagrams.uml
├── lib
│   └── external-libraries.jar
├── README.md
└── project-documentation.docx
```

## Technologies Used
- Java
- JFrame for the user interface
- Object-Oriented Programming (OOP) principles
- UML for design documentation
- Design Patterns (Decorator Pattern)

## Setup Instructions
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files using your preferred IDE or command line.
4. Run the `Main.java` file to start the application.

## Contribution
This project is a collaborative effort. Each team member is responsible for different components of the system, and contributions are tracked through the project management tools.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
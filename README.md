# To-Do List API
A simple to-do list app created using Java Spring Boot, which allows you to add, delete, complete and view tasks.

## Features
- Add new tasks (`POST /tasks?taskName=...`)
- Mark tasks as completed (`POST /tasks/{id}/complete`)
- Delete tasks by ID (`DELETE /tasks/{id}`)
- Get all tasks (`GET /tasks`)
- Get a single task by ID (`GET /tasks/{id}`)

## Technologies
- Java 21
- REST API
- Spring Boot 4.0.0-M1
- Maven

## Usage
### Linux
```
git clone https://github.com/PhilX15/todo-list.git
cd todo-list
chmod +x mvnw
./mvnw spring-boot:run
```
Open your browser and go to http://localhost:8080/tasks
### Windows
```
git clone https://github.com/PhilX15/todo-list.git
cd todo-list
mvn spring-boot:run
```
Open your browser and go to http://localhost:8080/tasks

## Notes
All tasks are currently stored in memory. After restarting the app, the task list will be cleared.

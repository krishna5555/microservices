## Movie-catalog
Designed using Microservices architecture

## ⚡ Tech stack used
![Java](https://img.shields.io/badge/-Java-E34A86?style=flat-square&logo=java)
![Spring](https://img.shields.io/badge/-Spring-black?style=flat-square&logo=spring)
![Spring MVC](https://img.shields.io/badge/-SpringMVC-E34F26?style=flat-square&logo=springmvc&logoColor=white)
![Netflix-Eureka](https://img.shields.io/badge/-Netflix_Eureka-black?style=flat-square&logo=eureka)
![Git](https://img.shields.io/badge/-Git-black?style=flat-square&logo=git)

## Overview
![Architecture](https://github.com/krishna5555/microservices/blob/main/movie-catalog/architecture.png)
- Movie catalog is a service that lists the movie, description and user rating.
- This application is designed using Microservices architecture.
- There are four Spring Boot application projects in the entire architecture each acting as a microservice.
- Movie Catalog Service is the client here.
- Movie Info Service and Ratings Data Service provide service to the client(Movie Catalog Service)
- Eureka Discovery Server takes care of forwarding the request and response.
- The client and services are registered to the Eureka Discovery Server. This can be viewed on the Spring Eureka Dashboard as shown below.

![Spring Eureka](https://github.com/krishna5555/microservices/blob/main/movie-catalog/eurekadashboard.png)
- Once all the services are registered, the clients can send request and receive response.
- In this case, the Movie Catalog Service requests for movie and ratings info from the other two services.
- The Movie Catalog Service first looks up for the services registered in Eureka Discovery Server. It firsts sends a request to Movie Info Service to get movie details and then sends a request to Ratings Service to get user ratings of the movie.

## Sample output:<br/>
![Output](https://github.com/krishna5555/microservices/blob/main/movie-catalog/sampleoutput.png)

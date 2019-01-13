# README #
# weather-app

This is simple weather-app written using MVC pattern in Java8 using Springboot which provides APIs for searching city weather and save the results inside a database. Also provides a search functionality over database for retrieving logs.

Frontend is written in Javascript using AngularJS and Bootstrap and is implemented using MVC architecture

### Version ###
0.0.1

### How do I get set up? ###
Clone repository and open it up in your favourite IDE.

### Dependencies ###
This project is based on Java8, SpringBoot, Hibernate and Javascript(AngularJS, Bootstrap)
Make sure that you have Java8 installed and a compatible JRE to run.

### Database configuration ###
1. Open src -> main -> java -> resource -> application.propertiesand edit following according to your settings

	`spring.datasource.url=jdbc:mysql://localhost:3306/weatherapp?useSSL=false`
	
	`spring.datasource.username=root`
	
	`spring.datasource.password= `


2. Go to mysql server and create schema 'weatherapp' using 'CREATE DATABASE weatherapp'

Note: 'schema.sql' file contains DDL commands.

### Deployment instructions ###
1. Go to `weatherapp` directory and build using `mvn clean install`
2. Go to `target` folder and hit `java -jar bootdemo-0.0.1-SNAPSHOT.jar`
3. Open browser and go to 'http://localhost:8080/home'

### Who do I talk to? ###

* Repo owner or admin
sanglevikas25@gmail.com

# Consume Rest APIS

This spring boot project works on consuming data from REST APIS and process the data and exposes them as REST enpoints.
This is built on Java, Spring and uses @FeignClient, Web Client and Rest Templates offered by Spring to consume the REST
APIS
This is a good project for learners it has incremental commits and commit history in readme file describing the changes
and can be used as reference on how to consume REST APIS
Please check commit history in section of README file to know the changes

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Commit History](#commit-history)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 17 or later
- [Spring](https://spring.io/projects/spring-boot) framework
- Maven for building the project

## Getting Started

Follow these steps to set up and run the Spring security Learner Microservice:

1. Clone this repository:

   ```shell
   git clone https://github.com/yr5913/consume-school-rest-apis.git
   cd school-web-app
2. Build the microservice:
   ```shell
   mvn clean install

3. Run the microservice:
   ```shell
   java -jar target/consume-school-rest-apis.jar

## Commit History

1. Initial commit with minimum code and no dependencies and spring boot project is downloaded from spring website
   start.spring.io
2. Added all required dependencies, this includes spring starter web, spring cloud, openfeign, loadbalancer, webflux
   dependencies, make sure to add spring cloud version that is compatible with spring boot version
3. Server port is changed to 8081 to not conflict with school web app. Added FienClient proxy, controller to consume the
   school get contact messages api, but will get unauthorized error as we are not passing creds
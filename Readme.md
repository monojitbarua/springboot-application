# Springboot Application with PostgresDB (docker)

## This is sample spring boot application implementation with docker postgresDB

### Start Application
 - Please setup the DB as mentioned below before application setup 
 - Run DemoApplication.java
 - Alternate option:

        mvn clean package
   - go to target dir:
   
         java -jar springboot-application-0.0.1-SNAPSHOT.jar
     - or execute the jar from linux or mac OS like: 
     
           ./springboot-application-0.0.1-SNAPSHOT.jar

### Docker Postgres Setup

Create Docker container with Postgres database:

    docker create --name postgres -e POSTGRES_PASSWORD=Password -p 5432:5432 postgres:11.5-alpine

Start container:

    docker start postgres

Connection Info:

    JDBC URL: `jdbc:postgresql://localhost:5432/springboot_app`
    Username: `postgres`
    Password: `Password`

Connect to PSQL prompt from docker:

    docker exec -it postgres psql -U postgres

Create the Database:

    create database springboot_app;

Create the Tables:

    docker cp create_tables.sql postgres:/create_tables.sql
    docker exec -it postgres psql -d springboot_app -f create_tables.sql -U postgres

Insert some the Data:

    docker cp insert_data.sql postgres:/insert_data.sql
    docker exec -it postgres psql -d springboot_app -f insert_data.sql -U postgres

Stop container:

    docker stop postgres



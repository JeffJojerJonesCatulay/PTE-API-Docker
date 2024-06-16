# Dockerfile for Spring Boot application
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
#WORKDIR /app

ARG JAR_FILE=target/*.jar

# Copy the packaged JAR file into the container
COPY ./target/WEB_RESTAPI-0.0.1-SNAPSHOT.jar app.jar

# Expose the port
#EXPOSE 9010

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]

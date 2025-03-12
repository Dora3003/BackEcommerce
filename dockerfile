# First stage: build the app
FROM openjdk:21-jdk-slim AS build

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the working directory and copy the project files
WORKDIR /app
COPY . .

# Run the Maven build
RUN mvn clean install

# Second stage: create the final image
FROM openjdk:21-jdk-slim

# Expose port 8080
EXPOSE 8080

# Copy the JAR file from the build stage to the final image
COPY --from=build /app/target/Viviane-0.0.1-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT [ "java", "-jar", "app.jar" ]
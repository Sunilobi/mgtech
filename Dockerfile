# Use an appropriate base image for Java 11
FROM adoptopenjdk:11-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Java application JAR file to the container
COPY javaapp-1.0-SNAPSHOT.jar ./javaapp.jar

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "javaapp.jar"]

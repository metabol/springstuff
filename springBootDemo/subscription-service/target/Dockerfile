# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="jnmaju"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 9990 available to the world outside this container
EXPOSE 9990

#Create logfile
RUN mkdir -p /var/log/subscription/subscription.log


# The application's jar file
ARG JAR_FILE=subscription-service-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

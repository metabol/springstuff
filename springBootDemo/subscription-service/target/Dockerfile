FROM java:alpine
ADD . /usr/src/myapp
WORKDIR /usr/src/myapp
EXPOSE 9990
EXPOSE 8080
CMD ["sudo","java", "-jar","subscription-service-0.0.1-SNAPSHOT.jar"]

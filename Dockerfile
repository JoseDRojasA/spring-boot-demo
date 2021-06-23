FROM openjdk:8
WORKDIR /usr/src/app
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
EXPOSE 8080
FROM openjdk:21-ea-17-jdk-slim-buster
ADD target/projTest03-0.0.1.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=GMT", "-jar", "/app.jar"]
FROM openjdk:17-jdk-slim
ADD /build/lib/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
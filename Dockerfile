FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY build/libs/*.jar spring-boot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","spring-boot-0.0.1-SNAPSHOT.jar"]
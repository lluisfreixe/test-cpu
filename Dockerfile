FROM eclipse-temurin:8-jdk-focal
ENV TZ=Europe/Madrid
ADD target/test-cpu-1.0.jar test-cpu-1.0.jar
ENTRYPOINT ["java", "-jar", "test-cpu-1.0.jar"]
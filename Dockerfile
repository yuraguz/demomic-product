FROM openjdk:17-jdk-slim
LABEL maintainer="Iurii Guz"
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

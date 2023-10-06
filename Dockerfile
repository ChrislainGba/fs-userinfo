FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/*.jar /app/app.jar
#COPY ./src/main/resources/application.yml /app/application.yml
#COPY ./src/main/resources/application.yml /app/application-dev.yml
#ENV SPRING_PROFILES_ACTIVE=dev
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
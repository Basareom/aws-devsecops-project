FROM eclipse-temurin:21-jre-alpine

# Update Alpine packages to the latest security fixes
RUN apk update && apk upgrade --no-cache

WORKDIR /app

COPY target/employee-app-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]

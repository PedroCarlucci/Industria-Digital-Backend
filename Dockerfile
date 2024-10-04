# Build stage
FROM gradle:8.10.2-jdk21 AS build
WORKDIR /app
COPY --chown=gradle:gradle . .
RUN gradle build -x test

# Runtime stage
FROM eclipse-temurin:21-jdk
COPY --from=build /app/build/libs/*.jar industria-digital.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "industria-digital.jar"]
FROM alpine/java:21-jdk AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests
RUN rm /app/target/*.jar.original

FROM openjdk:21
COPY --from=build /app/target/*.jar industria-digital.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "industria-digital.jar"]

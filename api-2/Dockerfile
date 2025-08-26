FROM maven:3.9.6-eclipse-temurin-17 as build
WORKDIR /app
COPY . .
RUN mvn package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*-runner.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17
COPY --from=build /target/ManageStore-0.0.1-SNAPSHOT.jar ManageStore.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ManageStore.jar"]
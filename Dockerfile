FROM openjdk:8
ADD target/spring5-recipe-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]
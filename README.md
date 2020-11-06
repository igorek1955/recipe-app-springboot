[![CircleCI](https://circleci.com/gh/igorek1955/recipeapp-spring-mysql.svg?style=svg&circle-token=a68310d34c469f1397ecfb1c6244b55f51207a8c)](https://app.circleci.com/settings/project/github/igorek1955/recipeapp-spring-mysql)

# Recipe App - Spring Boot + MySQL / H2

It's a simple Spring Boot application for demonstration purposes.
This application supports:
- h2 ("default" profile)
- MySQL ("dev" , "prod" profiles)

To select profile in IDE input profile name into active profiles field in run configuration.

To configure connection to the database refer to application-dev.yml or application-prod.yml, depending on the profile you selected. 
```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/sfg_dev?useUnicode=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true
    username: *****
    password: *****
  jpa:
    hibernate:
      ddl-auto: validate
    database-platform: org.hibernate.dialect.MySQL5InnoDBDialect
    database: mysql
    show-sql: true
    properties:
      javax:
        persistence:
          schema-generation:
            create-source: metadata
            scripts:
              action: create
              create-target: guru_database_create.sql
```

To deploy via Docker refer to the Dockerfile and configure it to your liking.

```
FROM openjdk:8
ADD target/spring5-recipe-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]
```
To create and deploy image run these commands in the command line:
```
docker build -f Dockerfile -t recipe-app .
docker run -p 8080:8080 -d recipe-app
```

# My Other Projects

| Project | Link |
|------|-------|
| PetClinic Spring boot - Postgres, H2 | [github](https://github.com/igorek1955/pet-clinic-springboot) |
| Recipe App build with Spring Boot on MongoDB |[github](https://github.com/igorek1955/recipeapp-spring-mongoDB) |
| Miscellaneous projects build with Java  | [github](https://github.com/igorek1955/little-projects) |

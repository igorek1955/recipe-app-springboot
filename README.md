[![CircleCI](https://circleci.com/gh/igorek1955/recipeapp-spring-mysql.svg?style=svg&circle-token=a68310d34c469f1397ecfb1c6244b55f51207a8c)](https://app.circleci.com/settings/project/github/igorek1955/recipeapp-spring-mysql)

# Recipe App - Spring Boot + MySQL / H2

It's a simple Spring Boot application for demonstration purposes.
This application supports:
- h2 ("default" profile)
- MySQL ("dev" , "prod" profiles)

To select profile in IDE input profile name into active profiles field in run configuration.

To configure connection to the database refer to application.properties. 
```
# Connection url for the database "recipe"
spring.datasource.url = jdbc:mysql://localhost:3306/recipe

# Username and password
spring.datasource.username = root
spring.datasource.password = root
```

# My Other Projects

| Project | Link |
|------|-------|
| PetClinic Spring boot - Postgres, H2 | [github](https://github.com/igorek1955/pet-clinic-springboot) |
| Recipe App build with Spring Boot on MongoDB |[github](https://github.com/igorek1955/recipeapp-spring-mongoDB) |
| Miscellaneous projects build with Java  | [github](https://github.com/igorek1955/little-projects) |

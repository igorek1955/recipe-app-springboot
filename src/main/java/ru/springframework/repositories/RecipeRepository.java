package ru.springframework.repositories;

import ru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

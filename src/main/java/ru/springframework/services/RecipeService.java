package ru.springframework.services;

import ru.springframework.commands.RecipeCommand;
import ru.springframework.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long aLong);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long id);

    void deleteById(long anyLong);
}

package ru.springframework.services;

import ru.springframework.converter.RecipeCommandToRecipe;
import ru.springframework.converter.RecipeToRecipeCommand;
import ru.springframework.domain.Recipe;
import ru.springframework.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {

    @Mock
    RecipeCommandToRecipe recipeCommandToRecipe;
    @Mock
    RecipeToRecipeCommand recipeToRecipeCommand;

    RecipeServiceImpl recipeService;
    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
    }

    @Test
    public void getRecipes() {
        Recipe recipe = new Recipe();
        Set<Recipe> recipesData = new HashSet<>();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);
        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(1, recipes.size());

        //test if recipeRepository.findAll() was called only ONCE
        verify(recipeRepository, times(1)).findAll();
    }

    @Test
    public void getRecipe(){
        Recipe recipe = new Recipe();
        recipe.setId(2L);
        recipeRepository.save(recipe);
        when(recipeRepository.findById(2L)).thenReturn(Optional.of(recipe));

        Recipe returnRecipe = recipeService.findById(2L);
        assertNotNull(returnRecipe);
        verify(recipeRepository, times(1)).findById(anyLong());
        verify(recipeRepository, never()).findAll();
    }
}
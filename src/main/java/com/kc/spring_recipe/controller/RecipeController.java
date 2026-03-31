package com.kc.spring_recipe.controller;

import com.kc.spring_recipe.model.Recipe;
import com.kc.spring_recipe.service.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public Recipe getRecipe(
            @RequestParam String ingredient1,
            @RequestParam String ingredient2
    ) {
        return recipeService.getRecipe(ingredient1, ingredient2);
    }
}
package com.kc.spring_recipe.controller;

import com.kc.spring_recipe.model.Recipe;
import com.kc.spring_recipe.model.RecipeResponse;
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
    public RecipeResponse getRecipe(
            @RequestParam String ingredient1,
            @RequestParam String ingredient2
    ) {
        String i1 = ingredient1.trim();
        String i2 = ingredient2.trim();

        if (i1.isEmpty() || i2.isEmpty()) {
            return new RecipeResponse(
                    false,
                    "食材を2つ入力してください",
                    null,
                    null,
                    null
            );
        }

        if (i1.equals(i2)) {
            return new RecipeResponse(
                    false,
                    "同じ食材ではなく、別の食材も入力してください",
                    null,
                    null,
                    null
            );
        }

        Recipe recipe = recipeService.getRecipe(i1, i2);

        return new RecipeResponse(
                true,
                "レシピを取得しました",
                recipe.getRecipeName(),
                recipe.getIngredients(),
                recipe.getSteps()
        );
    }
}
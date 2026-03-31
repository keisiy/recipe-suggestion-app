package com.kc.spring_recipe.model;

import java.util.List;

public class Recipe {
    private String recipeName;
    private List<String> ingredients;
    private String steps;

    public Recipe(String recipeName, List<String> ingredients, String steps) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getSteps() {
        return steps;
    }
}

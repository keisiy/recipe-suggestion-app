package com.kc.spring_recipe.model;

import java.util.List;

public class RecipeResponse {
    private boolean success;
    private String message;
    private String recipeName;
    private List<String> ingredients;
    private String steps;

    public RecipeResponse(boolean success, String message, String recipeName, List<String> ingredients, String steps) {
        this.success = success;
        this.message = message;
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
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
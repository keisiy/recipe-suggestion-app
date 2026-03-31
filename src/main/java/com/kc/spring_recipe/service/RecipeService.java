package com.kc.spring_recipe.service;

import com.kc.spring_recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RecipeService {

    public Recipe getRecipe(String ingredient1, String ingredient2) {

        // 仮ロジック（後でAIやDBに差し替え可能）
        if (ingredient1.equals("卵") && ingredient2.equals("チーズ")) {
            return new Recipe(
                "チーズオムレツ",
                Arrays.asList("卵", "チーズ"),
                "卵を溶いて焼き、チーズを入れる"
            );
        }

        return new Recipe(
            "オリジナル料理",
            Arrays.asList(ingredient1, ingredient2),
            "材料をいい感じに調理する"
        );
    }
}

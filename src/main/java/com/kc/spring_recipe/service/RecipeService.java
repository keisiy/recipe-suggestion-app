package com.kc.spring_recipe.service;

import com.kc.spring_recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RecipeService {

    public Recipe getRecipe(String ingredient1, String ingredient2) {
        if ((ingredient1.equals("卵") && ingredient2.equals("チーズ")) ||
            (ingredient1.equals("チーズ") && ingredient2.equals("卵"))) {
            return new Recipe("チーズオムレツ", Arrays.asList("卵", "チーズ"), "卵を溶いて焼き、チーズを入れる");
        }

        if ((ingredient1.equals("卵") && ingredient2.equals("ご飯")) ||
            (ingredient1.equals("ご飯") && ingredient2.equals("卵"))) {
            return new Recipe("卵チャーハン", Arrays.asList("卵", "ご飯"), "ご飯と卵を炒め、調味料で味を整える");
        }

        if ((ingredient1.equals("じゃがいも") && ingredient2.equals("チーズ")) ||
            (ingredient1.equals("チーズ") && ingredient2.equals("じゃがいも"))) {
            return new Recipe("チーズポテト", Arrays.asList("じゃがいも", "チーズ"), "じゃがいもを加熱し、チーズをのせて焼く");
        }

        return new Recipe("オリジナル料理", Arrays.asList(ingredient1, ingredient2), "材料を組み合わせてアレンジ料理に挑戦しましょう");
    }
}

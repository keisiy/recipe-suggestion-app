package com.kc.spring_recipe.service;

import com.kc.spring_recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RecipeService {

    public Recipe getRecipe(String ingredient1, String ingredient2) {
        String i1 = ingredient1.trim();
        String i2 = ingredient2.trim();

        if (isMatch(i1, i2, "卵", "チーズ")) {
            return new Recipe(
                    "チーズオムレツ",
                    Arrays.asList("卵", "チーズ"),
                    "卵を溶いて焼き、チーズを入れる"
            );
        }

        if (isMatch(i1, i2, "卵", "ご飯")) {
            return new Recipe(
                    "卵チャーハン",
                    Arrays.asList("卵", "ご飯"),
                    "フライパンで卵とご飯を炒め、塩こしょうで味を整える"
            );
        }

        if (isMatch(i1, i2, "じゃがいも", "チーズ")) {
            return new Recipe(
                    "チーズポテト",
                    Arrays.asList("じゃがいも", "チーズ"),
                    "じゃがいもを加熱してやわらかくし、チーズをのせて焼く"
            );
        }

        if (isMatch(i1, i2, "キャベツ", "豚肉")) {
            return new Recipe(
                    "豚キャベツ炒め",
                    Arrays.asList("キャベツ", "豚肉"),
                    "豚肉を炒め、キャベツを加えてしんなりするまで火を通す"
            );
        }

        if (isMatch(i1, i2, "玉ねぎ", "卵")) {
            return new Recipe(
                    "玉ねぎオムレツ",
                    Arrays.asList("玉ねぎ", "卵"),
                    "玉ねぎを炒めて甘みを出し、溶き卵を加えて焼く"
            );
        }

        if (isMatch(i1, i2, "豆腐", "ねぎ")) {
            return new Recipe(
                    "ねぎ豆腐炒め",
                    Arrays.asList("豆腐", "ねぎ"),
                    "豆腐を軽く焼き、ねぎを加えてしょうゆで味付けする"
            );
        }

        if (isMatch(i1, i2, "鶏肉", "玉ねぎ")) {
            return new Recipe(
                    "鶏肉と玉ねぎの炒め物",
                    Arrays.asList("鶏肉", "玉ねぎ"),
                    "鶏肉を焼いて火を通し、玉ねぎを加えて炒める"
            );
        }

        if (isMatch(i1, i2, "トマト", "卵")) {
            return new Recipe(
                    "トマトと卵の炒め物",
                    Arrays.asList("トマト", "卵"),
                    "卵を先に炒めて取り出し、トマトを炒めてから戻し合わせる"
            );
        }

        if (isMatch(i1, i2, "パスタ", "ベーコン")) {
            return new Recipe(
                    "ベーコンパスタ",
                    Arrays.asList("パスタ", "ベーコン"),
                    "ゆでたパスタと炒めたベーコンを合わせ、塩こしょうで仕上げる"
            );
        }

        if (isMatch(i1, i2, "うどん", "卵")) {
            return new Recipe(
                    "月見うどん",
                    Arrays.asList("うどん", "卵"),
                    "温めたうどんに卵を落として、だしで味を整える"
            );
        }

        if (isMatch(i1, i2, "食パン", "チーズ")) {
            return new Recipe(
                    "チーズトースト",
                    Arrays.asList("食パン", "チーズ"),
                    "食パンにチーズをのせてトースターで焼く"
            );
        }

        if (isMatch(i1, i2, "ご飯", "納豆")) {
            return new Recipe(
                    "納豆ご飯",
                    Arrays.asList("ご飯", "納豆"),
                    "温かいご飯に納豆をのせ、よく混ぜて食べる"
            );
        }

        if (isMatch(i1, i2, "ほうれん草", "ベーコン")) {
            return new Recipe(
                    "ほうれん草とベーコンのソテー",
                    Arrays.asList("ほうれん草", "ベーコン"),
                    "ベーコンを炒め、ほうれん草を加えてさっと火を通す"
            );
        }

        if (isMatch(i1, i2, "なす", "ひき肉")) {
            return new Recipe(
                    "なすとひき肉の炒め物",
                    Arrays.asList("なす", "ひき肉"),
                    "ひき肉を炒め、なすを加えてやわらかくなるまで火を通す"
            );
        }

        if (isMatch(i1, i2, "もやし", "豚肉")) {
            return new Recipe(
                    "もやしと豚肉の炒め物",
                    Arrays.asList("もやし", "豚肉"),
                    "豚肉を先に炒め、もやしを加えて強火でさっと仕上げる"
            );
        }

        return new Recipe(
                "オリジナル料理",
                Arrays.asList(i1, i2),
                "材料を組み合わせて、炒める・焼く・煮るなどの方法でアレンジしてみましょう"
        );
    }

    private boolean isMatch(String input1, String input2, String ingredientA, String ingredientB) {
        return (input1.equals(ingredientA) && input2.equals(ingredientB))
                || (input1.equals(ingredientB) && input2.equals(ingredientA));
    }
}

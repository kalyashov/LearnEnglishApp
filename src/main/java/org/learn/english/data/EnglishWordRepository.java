package org.learn.english.data;

import org.learn.english.data.entity.EnglishWord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kalyashov-ga on 2020-02-05.
 */
public class EnglishWordRepository {

    public List<EnglishWord> getRandomWords(int count) {

        List<EnglishWord> englishWords = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            EnglishWord englishWord = new EnglishWord("test" + i, "тест");
            englishWords.add(englishWord);
        }

        return englishWords;
    }
}

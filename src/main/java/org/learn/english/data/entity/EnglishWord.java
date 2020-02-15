package org.learn.english.data.entity;

/**
 * Английское слово с переводом
 * Created by kalyashov-ga on 2020-02-05.
 */
public class EnglishWord {

    private String word;
    private String translation;
    private WordCategory category;

    public EnglishWord() {
    }

    public EnglishWord(String word, String translation) {
        this.word = word;
        this.translation = translation;
        this.category = WordCategory.OTHER;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public WordCategory getCategory() {
        return category;
    }

    public void setCategory(WordCategory category) {
        this.category = category;
    }
}

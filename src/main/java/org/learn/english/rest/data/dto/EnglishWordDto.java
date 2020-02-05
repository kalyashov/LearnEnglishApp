package org.learn.english.rest.data.dto;

/**
 * DTO - английское слово с переводом
 * Created by kalyashov-ga on 2020-02-05.
 */
public class EnglishWordDto {

    private String word;
    private String translation;

    public EnglishWordDto() {
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
}

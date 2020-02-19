package org.learn.english.data.entity;

import javax.persistence.*;

/**
 * Английское слово с переводом
 * Created by kalyashov-ga on 2020-02-05.
 */
@Entity
@Table(name = "ENGLISH_WORD")
public class EnglishWord {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "WORD", nullable = false)
    private String word;

    @Column(name = "TRANSLATION", nullable = false)
    private String translation;

    @Column(name = "TRANSCRIPTION")
    private String transcription;

    @Column(name = "CATEGORY")
    private WordCategory category;

    public EnglishWord() {
    }

    public EnglishWord(String word, String translation) {
        this.word = word;
        this.translation = translation;
        this.category = WordCategory.OTHER;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public WordCategory getCategory() {
        return category;
    }

    public void setCategory(WordCategory category) {
        this.category = category;
    }
}

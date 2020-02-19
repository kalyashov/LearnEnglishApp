package org.learn.english.data.entity;

/**
 * Категория слова
 */
public enum WordCategory
{
    FOOD("Еда"),
    PROFESSION("Профессия"),
    CLOTHES("Одежда"),
    DEVICES("Устройства"),
    CITY("Город"),
    COUNTRY("Страна"),
    OTHER("Другое");

    private String translation;

    WordCategory(String translation)
    {
        this.translation = translation;
    }
}

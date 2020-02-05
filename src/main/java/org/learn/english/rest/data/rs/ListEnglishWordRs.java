package org.learn.english.rest.data.rs;

import org.learn.english.rest.data.dto.EnglishWordDto;

import java.util.List;

/**
 * Ответ - список английских слов
 * Created by kalyashov-ga on 2020-02-05.
 */
public class ListEnglishWordRs extends BaseResponse {

    private List<EnglishWordDto> wordList;

    public ListEnglishWordRs() {
    }

    public List<EnglishWordDto> getWordList() {
        return wordList;
    }

    public void setWordList(List<EnglishWordDto> wordList) {
        this.wordList = wordList;
    }
}

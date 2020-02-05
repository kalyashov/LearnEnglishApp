package org.learn.english.rest.data;

import org.learn.english.data.entity.EnglishWord;
import org.learn.english.rest.data.dto.EnglishWordDto;
import org.learn.english.rest.data.rs.ListEnglishWordRs;

import java.util.ArrayList;
import java.util.List;

/**
 * Вспомогательный класс для построения ответов
 * Created by kalyashov-ga on 2020-02-05.
 */
public class EnglishWordResponseBuilder {

    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_STATUS = "success";

    public static ListEnglishWordRs buildEnglishWordList(List<EnglishWord> englishWords) {
        ListEnglishWordRs response = new ListEnglishWordRs();
        response.setCode(SUCCESS_CODE);
        response.setStatus(SUCCESS_STATUS);

        List<EnglishWordDto> englishWordDtoList = new ArrayList<>();

        for (EnglishWord word : englishWords) {
            EnglishWordDto dto = convertWord(word);
            englishWordDtoList.add(dto);
        }

        response.setWordList(englishWordDtoList);
        return response;
    }

    private static EnglishWordDto convertWord(EnglishWord word) {
        EnglishWordDto dto = new EnglishWordDto();
        dto.setWord(word.getWord());
        dto.setTranslation(word.getTranslation());
        return dto;
    }
}

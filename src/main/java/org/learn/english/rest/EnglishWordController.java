package org.learn.english.rest;

import org.learn.english.data.EnglishWordRepository;
import org.learn.english.data.entity.EnglishWord;
import org.learn.english.rest.data.EnglishWordResponseBuilder;
import org.learn.english.rest.data.rs.ListEnglishWordRs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kalyashov-ga on 2020-02-05.
 */
@RestController
@RequestMapping("/english/word")
public class EnglishWordController {

    @GetMapping("/random")
    public ListEnglishWordRs getRandomEnglishWords(@RequestParam(value = "count") int count) {
        EnglishWordRepository englishWordRepository = new EnglishWordRepository();
        List<EnglishWord> englishWords = englishWordRepository.getRandomWords(count);
        return EnglishWordResponseBuilder.buildEnglishWordList(englishWords);
    }
}
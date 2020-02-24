package org.learn.english.rest;

import org.learn.english.data.EnglishWordDAO;
import org.learn.english.data.EnglishWordRepository;
import org.learn.english.data.entity.EnglishWord;
import org.learn.english.rest.data.EnglishWordResponseBuilder;
import org.learn.english.rest.data.dto.EnglishWordDto;
import org.learn.english.rest.data.rs.ListEnglishWordRs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kalyashov-ga on 2020-02-05.
 */
@RestController
@RequestMapping("/api/english/word")
public class EnglishWordController {

    private final EnglishWordDAO englishWordDAO;

    @Autowired
    public EnglishWordController(EnglishWordDAO englishWordDAO) {
        this.englishWordDAO = englishWordDAO;
    }

    @GetMapping("/random")
    public ListEnglishWordRs getRandomEnglishWords(@RequestParam(value = "count") int count) {
        EnglishWordRepository englishWordRepository = new EnglishWordRepository();
        List<EnglishWord> englishWords = englishWordRepository.getRandomWords(count);
        return EnglishWordResponseBuilder.buildEnglishWordList(englishWords);
    }

    @PostMapping("/add")
    public void add(@RequestParam(name = "word") EnglishWordDto dto) {
        EnglishWord englishWord = new EnglishWord();
        englishWord.setWord(dto.getWord());
        englishWord.setTranscription(dto.getTranslation());

        englishWordDAO.save(englishWord);
    }
}
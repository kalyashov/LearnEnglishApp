package org.learn.english.data;

import org.learn.english.data.entity.EnglishWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements ApplicationRunner {

    private final EnglishWordDAO englishWordDAO;

    @Autowired
    public DataInitializer(EnglishWordDAO englishWordDAO) {
        this.englishWordDAO = englishWordDAO;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 0; i < 5; i++) {
            EnglishWord word = new EnglishWord("test" + i, "translation" + i);
            englishWordDAO.save(word);
        }
    }
}

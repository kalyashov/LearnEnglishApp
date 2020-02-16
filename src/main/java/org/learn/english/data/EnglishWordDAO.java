package org.learn.english.data;

import org.learn.english.data.entity.EnglishWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnglishWordDAO extends CrudRepository<EnglishWord, Long> {
}

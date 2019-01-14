package repository;

import model.Word;

import java.util.List;

public interface DictionaryRepository {
    List<Word> findAll();
}

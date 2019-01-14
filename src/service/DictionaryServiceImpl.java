package service;

import model.Word;
import org.springframework.stereotype.Service;
import repository.DictionaryRepository;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    private DictionaryRepository dictionaryRepository;

    public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }

    @Override
    public String findWord(String wordWhatNeedToFindViMeaning) {
        for (Word w: dictionaryRepository.findAll()) {
            if (wordWhatNeedToFindViMeaning.equals(w.getEn())) return w.getVi();
        }
        return null;
    }
}
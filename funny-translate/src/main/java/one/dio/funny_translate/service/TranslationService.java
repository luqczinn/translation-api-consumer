package one.dio.funny_translate.service;

import one.dio.funny_translate.model.Translation;

public interface TranslationService {

    Translation translate(String text, String type);
    Iterable<Translation> searchTranslates();
    Translation searchById(Long id);
    void insert(Translation translation);
    void remove(Long id);
}

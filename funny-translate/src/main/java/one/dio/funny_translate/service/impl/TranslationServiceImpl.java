package one.dio.funny_translate.service.impl;

import one.dio.funny_translate.model.Translation;
import one.dio.funny_translate.model.TranslationApiResponse;
import one.dio.funny_translate.model.TranslationRepository;
import one.dio.funny_translate.service.YodaTranslationService;
import one.dio.funny_translate.service.MinionTranslationService;
import one.dio.funny_translate.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TranslationServiceImpl implements TranslationService {
    @Autowired
    private MinionTranslationService minionClient;
    @Autowired
    private YodaTranslationService yodaClient;
    @Autowired
    private TranslationRepository repository;

    @Override
    public Translation translate(String text, String type) {
        TranslationApiResponse response;
        if ("yoda".equalsIgnoreCase(type)) {
            response = yodaClient.translate(text);
        } else if ("minion".equalsIgnoreCase(type)) {
            response = minionClient.translate(text);
            System.out.println(type);
        } else {
            throw new IllegalArgumentException("Tipo inválido");
        }

        Translation translation = new Translation();
        translation.setTranslation(response.getContents().getTranslation());
        translation.setText(response.getContents().getText());
        translation.setTranslated(response.getContents().getTranslated());
        translation.setCreatedAt(LocalDateTime.now());
        insert(translation);
        return repository.save(translation);
    }
    @Override
    public Iterable<Translation> searchTranslates() {
        return repository.findAll();
    }

    @Override
    public Translation searchById(Long id) {
        Optional<Translation> cliente = repository.findById(id);
        return cliente.get();
    }

    @Override
    public void insert(Translation translation) {
        repository.save(translation);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}

package one.dio.funny_translate.service;

import one.dio.funny_translate.model.TranslationApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "funtranslations-minions", url = "https://api.funtranslations.com/translate/minion.json")
public interface MinionTranslationService{
    @PostMapping(consumes = "application/x-www-form-urlencoded")
    TranslationApiResponse translate(@RequestParam("text") String text);
}

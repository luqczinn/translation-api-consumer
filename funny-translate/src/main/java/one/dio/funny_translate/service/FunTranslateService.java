package one.dio.funny_translate.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "funtranslations", url = "https://api.funtranslations.com/translate/")
public interface FunTranslateService {
}

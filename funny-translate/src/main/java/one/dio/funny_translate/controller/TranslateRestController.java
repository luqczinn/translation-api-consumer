package one.dio.funny_translate.controller;

import one.dio.funny_translate.model.Translation;
import one.dio.funny_translate.model.TranslationRequest;
import one.dio.funny_translate.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("translations")
public class TranslateRestController {
    @Autowired
    private TranslationService translationService;

    @GetMapping
    public ResponseEntity<Iterable<Translation>> searchAllTranslates(){
        return ResponseEntity.ok(translationService.searchTranslates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Translation> searchById(@PathVariable Long id){
        return ResponseEntity.ok(translationService.searchById(id));
    }

    @PostMapping
    public ResponseEntity<TranslationRequest> translateAndInsert(@RequestBody TranslationRequest request){
        translationService.translate(request.getText(), request.getType());
        return ResponseEntity.ok(request);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        translationService.remove(id);
        return ResponseEntity.ok().build();
    }
}
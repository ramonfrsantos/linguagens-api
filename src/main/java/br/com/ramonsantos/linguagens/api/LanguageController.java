package br.com.ramonsantos.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

  @Autowired
  private LanguageRepository repository;

  @GetMapping("/languages")
  public List<Language> getLanguages() {
    return repository.findAll();
  }

  @PostMapping("/languages")
  public Language createLanguage(@RequestBody Language language) {
    Language newLanguage = repository.save(language);
    return newLanguage;
  }
}
package br.com.ramonsantos.linguagens.api.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ramonsantos.linguagens.api.model.domain.Language;
import br.com.ramonsantos.linguagens.api.model.repository.LanguageRepository;

@Service
public class LanguageService {

  @Autowired
  private LanguageRepository repository;

  public List<Language> getLanguages() {
    return repository.findAll();
  }

  public Language getLanguageByTitle(String title) {
    return repository.findByTitle(title);
  }

  public Language createLanguage(Language language) {
    Language newLanguage = repository.save(language);
    return newLanguage;
  }

  public void deleteLanguage(String id){
    repository.deleteById(id);
  }
}
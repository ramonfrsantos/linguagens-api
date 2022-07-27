package br.com.ramonsantos.linguagens.api.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ramonsantos.linguagens.api.model.domain.Language;

public interface LanguageRepository extends MongoRepository<Language, String>{
  public void deleteById(String id);

  public Language findByTitle(String title);
}
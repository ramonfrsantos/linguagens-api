package br.com.ramonsantos.linguagens.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ramonsantos.linguagens.api.model.domain.Language;
import br.com.ramonsantos.linguagens.api.model.service.LanguageService;

@RestController
@RequestMapping("languages")
public class LanguageController {
  
  @Autowired
  private LanguageService service;

  @RequestMapping(method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
  public List<Language> getLanguages() {
    return service.getLanguages();
  }

  @RequestMapping(value = "/{title}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
  public Language getLanguageByTitle(@PathVariable String title) {
    return service.getLanguageByTitle(title);
  }

	@RequestMapping(method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
  public Language createLanguage(@RequestBody Language language) {
    return service.createLanguage(language);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
  public void deleteLanguage(@PathVariable String id) {
    service.deleteLanguage(id);
  }
}
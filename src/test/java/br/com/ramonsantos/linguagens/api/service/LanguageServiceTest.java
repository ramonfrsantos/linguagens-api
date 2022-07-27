package br.com.ramonsantos.linguagens.api.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.ramonsantos.linguagens.api.model.domain.Language;
import br.com.ramonsantos.linguagens.api.model.repository.LanguageRepository;
import br.com.ramonsantos.linguagens.api.model.service.LanguageService;

@RunWith(SpringRunner.class)
public class LanguageServiceTest {

  @TestConfiguration
  static class LanguageServiceTestConfigurations {

    @Bean
    public LanguageService languageService(){
      return new LanguageService();
    }
    
  }

  @Autowired
  LanguageService languageService;

  @MockBean
  LanguageRepository languageRepository;

  @Test
  public void getLanguageByTitle(){
    String title = "Ruby";

    Language language = languageService.getLanguageByTitle(title);

    Assertions.assertNotNull(language);
  }
  
  @Before
  public void setup(){
    String title = "Ruby";
    String image = "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/ruby/ruby_256x256.png";
    String ranking = "6";

    Language language = new Language(title, image, ranking);

    Mockito.when(languageRepository.findByTitle(language.getTitle()))
      .thenReturn(language);
  }
}
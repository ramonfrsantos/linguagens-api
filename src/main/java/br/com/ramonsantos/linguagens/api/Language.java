package br.com.ramonsantos.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Language {
  @Id 
  private String id;
  private String title;
  private String image;
  private String ranking;

  public Language(String title, String image, String ranking) {
    this.title = title;
    this.image = image;
    this.ranking = ranking;
  }

  public Language() {

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getRanking() {
    return ranking;
  }

  public void setRanking(String ranking) {
    this.ranking = ranking;
  }
}

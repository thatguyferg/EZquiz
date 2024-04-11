package com.thatguyferg.ezquiz.model;

import java.util.List;

public class Quiz {
  private String title;
  private List<Question> questions;

  public String getTitle() {
    return this.title;
  }

  public List<Question> getQuestions() {
    return List.copyOf(questions);
  }
}

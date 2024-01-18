package com.thatguyferg.ezquiz.model;

import java.util.List;

public class Quiz {
  private String title;
  private List<Question> questions;

  public String getTitle() {
    return this.title;
  }

  //TODO: make List immutable :)
  public List<Question> getQuestionList() {
    return this.questions;
  }
}

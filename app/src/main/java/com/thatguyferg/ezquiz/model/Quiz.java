package com.thatguyferg.ezquiz.model;

import java.util.Collections;
import java.util.List;

class Quiz {
  private String title;
  private List<Question> questions;

  public String getTitle() {
    return this.title;
  }

  public List<Question> getQuestionList() {
    return Collections.unmodifiableList(this.questions);
  }
}

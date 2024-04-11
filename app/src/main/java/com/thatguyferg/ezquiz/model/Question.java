package com.thatguyferg.ezquiz.model;

import java.util.List;

public class Question {

  private String prompt;
  private int answer;

  private List<String> options;

  public String getPrompt() {
    return prompt;
  }

  public List<String> getOptions() {
    return List.copyOf(options);
  }

  public int getAnswer() {
    return answer;
  }
}

// TODO: 3/12/24 change json to updated format - change models and tests to match

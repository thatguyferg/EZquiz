package com.thatguyferg.ezquiz.model;

/**
 * TODO: investigate how to get enums to work with gson
 */
class Question {

  //public enum Answer {A, C}

  //private int id;
  private String question;
  private String answer;
  private String optA;
  private String optB;
  private String optC;

  public String getQuestion() {
    return question;
  }

  public String getOptA() {
    return optA;
  }

  public String getOptB() {
    return optB;
  }

  public String getOptC() {
    return optC;
  }

  public String getAnswer() {
    return answer;
  }

}
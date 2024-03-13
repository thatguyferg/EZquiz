package com.thatguyferg.ezquiz.model;

import java.util.EnumMap;
import java.util.Map;

/**
 * TODO: investigate how to get enums to work with gson
 *      ^^ look at making answer an enum as a key to a map
 */
class Question {

  //public enum Answer {A, C}

  private EnumMap<Options, String> options;
  private String prompt;
  private Options answer;

  public String getPrompt() {
    return prompt;
  }

  public Map<Options, String> getOptions() {
    return Map.copyOf(options);
  }

  public String getOptA() {
    return options.get(Options.A);
  }

  public String getOptB() {
    return options.get(Options.B);
  }

  public String getOptC() {
    return options.get(Options.C);
  }

  public String getAnswer() {
    return answer.name();
  }

  //private int id;
  enum Options {A, B, C}

}
// TODO: 3/12/24 get gitignore setup correctly
// TODO: 3/12/24 run all tests to verify they are still working
// TODO: 3/12/24 commit changes
// TODO: 3/12/24 change json to updated format - change models and tests to match

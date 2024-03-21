package com.thatguyferg.ezquiz;

import java.util.Arrays;
import java.util.List;

class Quiz {

  private final List<Question> questionList = Arrays.asList(
      new Question(1, "Is milly a good dog?", "Yes", "Yeah", "Ye", Question.Answer.C),
      new Question(2, "Does the next button work?", "Yes", "Maybe", "Definitely", Question.Answer.A),
      new Question(3, "Is this going to break the layout?", "Yeah yeah yeah yeah yeah yeah yeah yeah yeah yeah yeah yeah", "Probably", "No", Question.Answer.A),
      new Question(4, "Will this really really really really really really really really really really really long question do something bad?", "No", "Yes", "Both", Question.Answer.C)
  );

  private int qIndex = 0;
  private int score = 0;

  Question getCurrentQuestion() {
    return getQuestionList().get(qIndex);
  }

  int numberQuestions() {
    return getQuestionList().size();
  }

  Boolean hasQuestion() {
    return (qIndex < getQuestionList().size());
  }

  void nextQuestion() {
    // TODO: 2/25/24 band-aid solution to prevent qIndex from incrementing OOB (will fully fix after refactor with iterators)
    if (qIndex < getQuestionList().size()) {
      qIndex += 1;
    }
  }

  void checkAnswer(String answer, String selection) {
    if (answer.equals(selection)) setScore(getScore() + 1);
  }

  public List<Question> getQuestionList() {
    return questionList;
  }

  public int getScore() {
    return score;
  }

  private void setScore(int score) {
    this.score = score;
  }
}


/*
TODO: 2/15/24 make nextQuestion more robust (guardrails against index out of bounds etc) || look at/implement iterators (cooler)



*/


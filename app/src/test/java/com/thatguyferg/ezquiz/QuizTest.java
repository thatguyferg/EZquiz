package com.thatguyferg.ezquiz;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QuizTest {

  @Test
  public void hasQuestion_AtBeginning_IsTrue() {
    Quiz quiz = new Quiz();
    assertThat(quiz.hasQuestion(), is(true));
  }

  @Test
  public void hasQuestion_AfterAllQuestion_IsFalse() {
    Quiz quiz = new Quiz();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.nextQuestion();
    assertThat(quiz.hasQuestion(), is(false));
  }

  @Test
  public void hasQuestion_AtBeginning_ReturnsTrue() {
    Quiz quiz = new Quiz();
    assertThat(quiz.hasQuestion(), is(true));
  }

  @Test
  public void hasQuestion_IndexOOB_ReturnsFalse() {
    Quiz quiz = new Quiz();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.nextQuestion();
    assertThat(quiz.hasQuestion(), is(false));
  }

  @Test
  public void getCurrentQuestion_FirstQuestion_ReturnsQuestion() {
    Quiz quiz = new Quiz();
    assertThat(quiz.getCurrentQuestion().getQuestion(), containsString("Is milly a good dog?"));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void getCurrentQuestion_IndexOOB_ThrowsException() {
    Quiz quiz = new Quiz();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.nextQuestion();
    quiz.getCurrentQuestion();
  }

  @Test
  public void numberQuestions_matchesQuestionListSize() {
    Quiz quiz = new Quiz();
    assertThat(quiz.numberQuestions(), is(quiz.getQuestionList().size()));
  }

  @Test
  public void checkAnswer_selectedMatchesAnswer_scoreIncreases() {
    Quiz quiz = new Quiz();
    quiz.checkAnswer("Answer", "Answer");
    assertThat(quiz.getScore(), is(1));
  }

  @Test
  public void checkAnswer_selectedIsWrong_scoreRemainsSame() {
    Quiz quiz = new Quiz();
    quiz.checkAnswer("Answer", "Wrong");
    assertThat(quiz.getScore(), is(0));
  }
}
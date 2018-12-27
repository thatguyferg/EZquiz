package com.thatguyferg.ezquiz;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuizTest {

    @Test
    public void hasQuestion_AtBeginning_IsTrue() {
        Quiz quiz = new Quiz();
        assertThat(quiz.hasQuestion(), is(true));
    }

    @Test
    public void hasQuestion_AfterAllQuestion_IsFalse(){
        Quiz quiz = new Quiz();
        quiz.nextQuestion();
        quiz.nextQuestion();
        assertThat(quiz.hasQuestion(), is(false));
    }

   // @Test
    /*public void nextQuestion_AtBeginning_GoesToNewQuestion() {
        Quiz quiz = new Quiz();
        String firstQuestion = quiz.currentQuestion.getQuestion();
        quiz.nextQuestion();

        assertThat(quiz.currentQuestion.getQuestion(), equalTo(firstQuestion));
    }*/

    @Test
    public void checkAnswer() {
    }
}
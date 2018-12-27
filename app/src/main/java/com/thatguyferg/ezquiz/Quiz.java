package com.thatguyferg.ezquiz;

import android.support.v7.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

class Quiz extends AppCompatActivity{

    List<Question> questionList = Arrays.asList (
            new Question(1, "Is milly a good dog?", "Yes", "Yeah", "Ye", Question.Answer.C),
            new Question(2, "Does the next button work?", "Yes", "Maybe", "Definitely", Question.Answer.A)
    );

    int qIndex = 0;
    Question currentQuestion = questionList.get(qIndex);
    int score = 0;

    Boolean hasMoreQuestion(){
        return (qIndex < questionList.size());
    }

    void nextQuestion(){
        currentQuestion = questionList.get(qIndex);
        qIndex++;
    }

    int checkAnswer(String answer, String selection) {
        if (answer.equals(selection)){
            score++;
        } else {
            return score;
        }
        return score;
    }




}





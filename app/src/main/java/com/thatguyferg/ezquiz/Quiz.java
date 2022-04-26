package com.thatguyferg.ezquiz;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

class Quiz extends AppCompatActivity{

    final List<Question> questionList = Arrays.asList (
            new Question(1, "Is milly a good dog?", "Yes", "Yeah", "Ye", Question.Answer.C),
            new Question(2, "Does the next button work?", "Yes", "Maybe", "Definitely", Question.Answer.A)
    );

    int qIndex = 0;
    int score = 0;

    Question getCurrentQuestion(){
        return questionList.get(qIndex);
    }

    int numberQuestions(){
        return questionList.size();
    }

    Boolean hasQuestion(){
        return (qIndex < questionList.size());
    }

    void nextQuestion(){
        qIndex++;
    }

    void checkAnswer(String answer, String selection) {
        if (answer.equals(selection)){
            score++;
        } else {
        }
    }




}





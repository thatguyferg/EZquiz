package com.example.ferggot.ezquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    List<Question> questionList = Arrays.asList(new Question(1, "Is milly a good dog?", "Yes", "Yeah", "Ye", Question.Answer.C));
    Question currentQuestion;
    int qIndex = 0;
    TextView txtQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        currentQuestion = questionList.get(qIndex);
        txtQuestion = (TextView)findViewById(R.id.questionText);
        txtQuestion.setText(currentQuestion.getQuestion());

    }



}

package com.example.ferggot.ezquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    List<Question> questionList = Arrays.asList
    (
    new Question(1, "Is milly a good dog?", "Yes", "Yeah", "Ye", Question.Answer.C),
    new Question(2, "Does the next button work?", "Yes", "Maybe", "Definitely", Question.Answer.A));

    Question currentQuestion;
    int qIndex = 0;
    TextView txtQuestion;
    Button butNext;
    RadioButton rdA, rdB, rdC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        currentQuestion = questionList.get(qIndex);
        txtQuestion = (TextView)findViewById(R.id.questionText);
        butNext = (Button)findViewById(R.id.nextButton);
        rdA = (RadioButton)findViewById(R.id.A);
        rdB = (RadioButton)findViewById(R.id.B);
        rdC = (RadioButton)findViewById(R.id.C);
        setQuestionView();

        butNext.setOnClickListener((v) -> {
            if (qIndex < questionList.size()) {
                currentQuestion = questionList.get(qIndex);
                setQuestionView();
            } else {
                Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void setQuestionView(){
        txtQuestion.setText(currentQuestion.getQuestion());
        rdA.setText(currentQuestion.getOptA());
        rdB.setText(currentQuestion.getOptB());
        rdC.setText(currentQuestion.getOptC());
        qIndex++;
    }



}

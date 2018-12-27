package com.thatguyferg.ezquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    Quiz quiz = new Quiz();
    TextView txtQuestion;
    Button butNext;
    RadioButton rdA, rdB, rdC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        txtQuestion = findViewById(R.id.questionText);
        butNext = findViewById(R.id.nextButton);
        rdA = findViewById(R.id.A);
        rdB = findViewById(R.id.B);
        rdC = findViewById(R.id.C);
        setQuestionView();

        butNext.setOnClickListener((v) -> {
            RadioGroup answerOptions = findViewById(R.id.radioAnswers);
            RadioButton selectedAnswer = findViewById(answerOptions.getCheckedRadioButtonId());

            quiz.checkAnswer(quiz.currentQuestion.getAnswer().toString(), selectedAnswer.getTag().toString());

            if (quiz.hasMoreQuestion()) {
                setQuestionView();
            } else {
                Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                Bundle b = new Bundle();
                b.putInt("score", quiz.score);
                b.putInt("numberQuestions", quiz.questionList.size());
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });

    }

    private void setQuestionView(){
        quiz.nextQuestion();
        txtQuestion.setText(quiz.currentQuestion.getQuestion());
        rdA.setText(quiz.currentQuestion.getOptA());
        rdB.setText(quiz.currentQuestion.getOptB());
        rdC.setText(quiz.currentQuestion.getOptC());
    }



}

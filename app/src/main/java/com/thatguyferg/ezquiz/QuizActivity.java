package com.thatguyferg.ezquiz;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
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

            quiz.checkAnswer(quiz.getCurrentQuestion().getAnswer().toString(), selectedAnswer.getTag().toString());

            quiz.nextQuestion();

            if (quiz.hasQuestion()) {
                setQuestionView();

            } else {
                Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                Bundle b = new Bundle();
                b.putInt("score", quiz.score);
                b.putInt("numberQuestions", quiz.numberQuestions());
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });

    }

    private void setQuestionView(){
        txtQuestion.setText(quiz.getCurrentQuestion().getQuestion());
        rdA.setText(quiz.getCurrentQuestion().getOptA());
        rdB.setText(quiz.getCurrentQuestion().getOptB());
        rdC.setText(quiz.getCurrentQuestion().getOptC());
    }



}

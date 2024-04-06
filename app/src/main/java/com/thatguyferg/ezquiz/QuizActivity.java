package com.thatguyferg.ezquiz;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.thatguyferg.ezquiz.model.Question;
import com.thatguyferg.ezquiz.model.Quiz;

import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;

// TODO: 3/21/24 how to load files from a resource bundle (like default quiz included with apk)?
//    Fix the rest of the activity code that selects and displays different parts of quiz
//    Move rest of orphaned quiz methods/etc to quizactivity (score etc)
//    SETUP ITERATOR FOR LIST (for getting current question/parsing list)
public class QuizActivity extends AppCompatActivity {

  private Quiz quiz;
  private TextView txtQuestion;
  private RadioButton rdA;
  private RadioButton rdB;
  private RadioButton rdC;
  private int score = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_quiz);

    quiz = getQuiz();
    List<Question> questionList = quiz.getQuestions();
    ListIterator<Question> questionIterator = questionList.listIterator();

    txtQuestion = findViewById(R.id.questionText);
    Button butNext = findViewById(R.id.nextButton);
    rdA = findViewById(R.id.A);
    rdB = findViewById(R.id.B);
    rdC = findViewById(R.id.C);
    setQuestionView(questionList.get(questionIterator.nextIndex()));

    butNext.setOnClickListener((v) -> {
      RadioGroup answerOptions = findViewById(R.id.radioAnswers);
      RadioButton selectedAnswer = findViewById(answerOptions.getCheckedRadioButtonId());

      //quiz.checkAnswer(quiz.getCurrentQuestion().getAnswer().toString(), selectedAnswer.getTag().toString());

      checkAnswer(selectedAnswer, questionList.get(questionIterator.nextIndex()));

      if (questionIterator.hasNext()) {
        setQuestionView(questionIterator.next());

      } else {
        Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
        Bundle b = new Bundle();
        b.putInt("score", score);
        b.putInt("numberQuestions", quiz.getQuestions().size());
        intent.putExtras(b);
        startActivity(intent);
        finish();
      }
    });

  }

  void setQuestionView(Question currentQuestion) {
    txtQuestion.setText(currentQuestion.getPrompt());
    rdA.setText(currentQuestion.getOptions().get(0));
    rdB.setText(currentQuestion.getOptions().get(1));
    rdC.setText(currentQuestion.getOptions().get(2));
  }

  void checkAnswer(RadioButton selected, Question currentQuestion) {
    if (selected.getTag().toString().equals(currentQuestion.getOptions().get(currentQuestion.getAnswer()))) {
      score++;
    }
  }

  private Quiz getQuiz() {
    Context context = getApplicationContext();
    Resources res = context.getResources();
    InputStreamReader is = new InputStreamReader(res.openRawResource(R.raw.test));
    Gson gson = new Gson();
    return gson.fromJson(is, Quiz.class);
  }

}

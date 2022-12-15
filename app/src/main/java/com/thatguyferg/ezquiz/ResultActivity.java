package com.thatguyferg.ezquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        int numberQuestions = b.getInt("numberQuestions");
        TextView result = findViewById(R.id.scoreText);
        result.setText("You got " + score + "/" + numberQuestions);
    }

}

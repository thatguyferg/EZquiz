package com.thatguyferg.ezquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        int numberQuestions = b.getInt("numberQuestions");
        TextView result = (TextView)findViewById(R.id.scoreText);
        result.setText("You got " + score + "/" + numberQuestions);
    }

}

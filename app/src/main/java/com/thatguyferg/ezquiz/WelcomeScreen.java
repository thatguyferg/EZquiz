package com.thatguyferg.ezquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.thatguyferg.ezquiz.R;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        Button btn = (Button)findViewById(R.id.start_button);

        btn.setOnClickListener((V) -> startActivity(new Intent(WelcomeScreen.this, QuizActivity.class)));

    }





}

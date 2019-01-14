package com.thatguyferg.ezquiz;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        Button btn = (Button)findViewById(R.id.start_button);

        btn.setOnClickListener((V) -> startActivity(new Intent(WelcomeActivity.this, QuizActivity.class)));

    }





}

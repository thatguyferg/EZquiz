package com.thatguyferg.ezquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_welcome_screen);


    Button btn = findViewById(R.id.start_button);

    btn.setOnClickListener((V) -> {
      startActivity(new Intent(WelcomeActivity.this, QuizActivity.class));
    });
  }
}

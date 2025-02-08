package com.thatguyferg.ezquizplus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class QuizActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            QuizPreview()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuizPreview(){
    Text(text = "Quiz Time")
}
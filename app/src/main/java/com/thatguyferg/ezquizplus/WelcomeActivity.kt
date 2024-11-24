package com.thatguyferg.ezquizplus

import android.R.attr.onClick
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

import androidx.core.content.ContextCompat.startActivity

class WelcomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            WelcomeScreen()
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun WelcomeScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){


        Text(text = "Hey there!", color = Color.Red, fontSize = 45.sp, textAlign = TextAlign.Center)
        val context = LocalContext.current
        Button { Toast.makeText(context, "Hello!", Toast.LENGTH_SHORT).show() }
        /*Button(onClick = {
            Toast.makeText(context, "Hello!", Toast.LENGTH_SHORT).show()
        })*/
       /* Button(onClick = {
            context.startActivity(Intent(context, QuizActivity::class.java))
        })*/
    }
}

@Composable

fun Button(onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text("Button")
    }
}



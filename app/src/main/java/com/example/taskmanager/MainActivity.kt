package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Scaffold(modifier = Modifier.fillMaxHeight()) { innerPadding ->
                    Task(
                        text1 = "All tasks completed",
                        text2 = "Nice work!",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Task(text1: String, text2: String, modifier: Modifier = Modifier) {

    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .wrapContentSize(align = Alignment.Center)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = "TICK",
            modifier = modifier.align(alignment = Alignment.CenterHorizontally)
                .padding(24.dp)

        )
        Text(
            text = text1,
            textAlign = TextAlign.Center,

            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = modifier.padding(top=24.dp,bottom = 8.dp)
            .align(Alignment.CenterHorizontally)

        )

        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.align(Alignment.CenterHorizontally),
            color = Color.Black
        )
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        Task(
            text1 = "All tasks completed",
            text2 = "Nice work!"
        )
    }
}
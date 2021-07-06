package com.mohfahmi.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mohfahmi.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme
import com.mohfahmi.myfirstcomposeapp.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Greeting("Jetpack Compose")
                        TvName(text = "Mohammad Fahmi")
                        TvName(text = "Absolutely mad lad")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        style = Typography.body1,
        textAlign = TextAlign.Center,
        fontSize = 30.sp,
    )
}

@Composable
fun TvName(text: String) {
    Text(text = text, fontFamily = FontFamily.Cursive, fontSize = 20.sp)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstComposeAppTheme {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Greeting("Android")
            TvName(text = "Mohammad Fahmi")
            TvName(text = "Absolutely mad lad")
        }

    }
}
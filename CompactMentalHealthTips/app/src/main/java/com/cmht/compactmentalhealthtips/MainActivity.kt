package com.cmht.compactmentalhealthtips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.cmht.compactmentalhealthtips.ui.theme.CompactMentalHealthTipsTheme
import com.cmht.compactmentalhealthtips.view.ViewPagerSlider
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompactMentalHealthTipsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.LightGray) {
                    ViewPagerSlider()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CompactMentalHealthTipsTheme {
        Greeting("Android")
    }
}
package com.kapirti.dhikr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kapirti.dhikr.ui.theme.DhikrTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DhikrTheme {
                MainScreen()
            }
        }
    }
}

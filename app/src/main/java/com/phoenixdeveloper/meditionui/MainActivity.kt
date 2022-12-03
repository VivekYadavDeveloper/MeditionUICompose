package com.phoenixdeveloper.meditionui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.phoenixdeveloper.meditionui.ui.theme.HomeScreen
import com.phoenixdeveloper.meditionui.ui.theme.MeditionUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditionUITheme {
                HomeScreen()
            }

        }
    }
}


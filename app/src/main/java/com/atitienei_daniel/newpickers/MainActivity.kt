package com.atitienei_daniel.newpickers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.atitienei_daniel.newpickers.ui.theme.NewPickersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewPickersTheme {
                DatePickerScreen()
            }
        }
    }
}
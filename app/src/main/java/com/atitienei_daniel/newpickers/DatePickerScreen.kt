@file:OptIn(ExperimentalMaterial3Api::class)

package com.atitienei_daniel.newpickers

import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.time.LocalDateTime

@Composable
fun DatePickerScreen() {

    val dateTime = LocalDateTime.now()

    val datePickerState = remember {
        DatePickerState(
            yearRange = (2023..2024),
            initialSelectedDateMillis = dateTime.toMillis(),
            initialDisplayMode = DisplayMode.Picker,
            initialDisplayedMonthMillis = null
        )
    }

    DatePicker(state = datePickerState)
}
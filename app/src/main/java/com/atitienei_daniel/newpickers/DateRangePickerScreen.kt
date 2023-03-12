@file:OptIn(ExperimentalMaterial3Api::class)

package com.atitienei_daniel.newpickers

import androidx.compose.material3.DateRangePicker
import androidx.compose.material3.DateRangePickerState
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.time.LocalDateTime
import java.time.ZoneId

@Composable
fun DateRangePickerScreen() {

    val dateTime = LocalDateTime.now()

    val dateRangePickerState = remember {
        DateRangePickerState(
            initialSelectedStartDateMillis = dateTime.toMillis(),
            initialDisplayedMonthMillis = null,
            initialSelectedEndDateMillis = dateTime.plusDays(3).toMillis(),
            initialDisplayMode = DisplayMode.Picker,
            yearRange = (2023..2024)
        )
    }

    DateRangePicker(state = dateRangePickerState)
}

fun LocalDateTime.toMillis() = this.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
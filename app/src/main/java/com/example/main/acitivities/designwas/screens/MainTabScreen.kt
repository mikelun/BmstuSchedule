package com.example.main.acitivities.designwas.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.main.acitivities.designwas.ElementsTabScreen.CouplesSchedule
import com.example.main.acitivities.designwas.ElementsTabScreen.Header
import com.google.accompanist.pager.ExperimentalPagerApi

@SuppressLint("RestrictedApi")
@ExperimentalPagerApi
@Composable
fun ScheduleScreen() {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header()
        CouplesSchedule()

    }
}

@Composable
fun BottomBar() {

}
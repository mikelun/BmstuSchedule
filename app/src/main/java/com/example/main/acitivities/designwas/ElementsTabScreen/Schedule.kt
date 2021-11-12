package com.example.main.acitivities.designwas.ElementsTabScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.main.acitivities.ui.theme.CardBlue
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import com.google.android.material.animation.AnimationUtils
import kotlin.math.absoluteValue

fun tesat() {

}



@SuppressLint("RestrictedApi", "CoroutineCreationDuringComposition")
@ExperimentalPagerApi
@Composable
fun CouplesSchedule() {
    HorizontalPager(
        count = 10,
        state = rememberPagerState(0),
        contentPadding = PaddingValues(end = 64.dp),
    ) { page ->
        Card(
            Modifier
                .graphicsLayer {
                val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                    AnimationUtils.lerp(
                        0.85f,
                        1f,
                        1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale
                        scaleY = scale
                    }
                    alpha = AnimationUtils.lerp(
                        1f,
                        1f,
                        1f - pageOffset.coerceIn(0f, 1f)
                    )
            },
        ) {
            Column() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier
                            .padding(start = 15.dp, top = 15.dp),
                        text = "${9 + page} ОКТЯБРЯ, \nвоскресенье",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W900,
                        color = CardBlue
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .padding(20.dp)
                        .fillMaxSize()
                        .verticalScroll(ScrollState(0))
                ) {
                    for (i in 0..4) {
                        CardSchedule(i)
                    }
                }
            }
        }
    }
}
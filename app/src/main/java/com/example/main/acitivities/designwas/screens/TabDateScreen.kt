package com.example.main.acitivities.designwas.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.example.main.acitivities.models.pages
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset

@ExperimentalPagerApi
@Composable
fun TabDateScreen() {

    val pagerState = rememberPagerState(0)

    TabRow(
        modifier = Modifier
            .padding(bottom = 2.dp)
        ,
        // Our selected tab is our current page
        selectedTabIndex = pagerState.currentPage,
        // Override the indicator, using the provided pagerTabIndicatorOffset modifier
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
            )
        }
    ) {
        // Add tabs for all of our pages
        pages.forEachIndexed { index, title ->
            Tab(
                text = { title },
                selected = pagerState.currentPage == index,
                onClick = { /* TODO */ },
            )
        }
    }

    HorizontalPager(
        count = pages.size,
        state = pagerState,
    ) { page ->
        Text("Count: $page")
    }
}
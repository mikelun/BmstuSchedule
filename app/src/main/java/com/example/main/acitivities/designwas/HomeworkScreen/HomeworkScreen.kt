package com.example.main.acitivities.designwas.HomeworkScreen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.main.R
import com.example.main.acitivities.ui.theme.*

@Composable
fun HomeworkScreen(navController: NavController) {
    Column(modifier = Modifier
        .padding(start = 20.dp, end = 20.dp)
        .fillMaxSize()
    ) {
        TopText()
        Column(
            Modifier.fillMaxHeight().padding(bottom = 50.dp).verticalScroll(ScrollState(0))
        ) {
            for (i in 1..15) {
                CardSubject(i, navController = navController)
            }
        }
    }
}


@Composable
fun TopText() {
    Box(
        modifier = Modifier
            .padding(top = 10.dp)
            .fillMaxWidth()
            .height(40.dp)
            .background(CardBlue, shape = Shapes.medium)
    ) {
        Text(
            text = "Выберите предмет",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            color = Color.White,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W700
        )
    }
}

@Composable
fun CardSubject(cntCard: Int, navController: NavController) {
    Card(
        modifier = Modifier
            .padding(top = 2.dp)
            .height(50.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate("homework/$cntCard")
            },
        elevation = 10.dp
    ) {
        Row(
            modifier = Modifier
                .padding(top = 10   .dp, start = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Инженерная графика",
                fontWeight = FontWeight.W500,
                fontSize = 18.sp,
                color = SubjectName
            )
            Image(
                ImageVector.vectorResource(
                    id = R.drawable.ic_arrow_square_right
                ),
                "Localized description",
                colorFilter = ColorFilter.tint(MainOrange),

                alignment = Alignment.CenterEnd
            )
        }
    }
}
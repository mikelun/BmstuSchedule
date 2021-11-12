package com.example.main.acitivities.designwas.ElementsTabScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.main.acitivities.ui.theme.CardBlue
import com.example.main.acitivities.ui.theme.MainOrange
import com.example.main.acitivities.ui.theme.Shapes

@Composable
fun CardSchedule(numberCard: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(5.dp)
            ,
        elevation = 10.dp,
        shape = RoundedCornerShape(6.dp)
    ) {
        Column {
            if (numberCard == 0) {
                CoupleBox()
            }

            MainCardInfo()
        }
    }
}

@Composable
fun CoupleBox() {
    Row(
        Modifier.height(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .background(CardBlue)
                .width(5.dp)
        )
        Box(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(CardBlue)
        ) {
            Text(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp),
                text = "Осталось 10 минут",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.W800,
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun CoupleBoxHomework() {
    Row(
        Modifier.height(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .background(CardBlue)
                .width(5.dp)
        )
        Row(
            Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
                    .background(MainOrange, shape = Shapes.medium)
            ) {
                Text(

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp),
                    text = "Смотреть ДЗ",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.W800,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
fun MainCardInfo() {
    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(CardBlue)
                .width(5.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 10.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "  8:30",
                fontWeight = FontWeight.W600
            )
            Text(
                "10:30",
                color = Color(0xFFC4C4C4),
                fontWeight = FontWeight.W600
            )
        }
        Box(
            modifier = Modifier
                .height(100.dp)
                .padding(top = 5.dp, bottom = 5.dp, start = 10.dp)
                .background(CardBlue)
                .width(1.dp)
        )
        Column(
            modifier = Modifier
                .height(100.dp)
                .padding(start = 10.dp, top = 10.dp, bottom = 10.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Инженерная графика",
                fontWeight = FontWeight.W600,
                fontSize = 16.sp
            )
            Text(
                "404 УЛК",
                color = Color(0xFFC4C4C4),
                fontWeight = FontWeight.W600,
                fontSize = 15.sp,
            )
        }
    }
}
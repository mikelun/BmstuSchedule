package com.example.main.acitivities.designwas.HomeworkAboutScreen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.main.acitivities.ui.theme.*

@Composable
fun HomeworkAboutScreen() {
    Column() {
        TopText()
        Column(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxSize()
                .verticalScroll(ScrollState(0))
        ) {
            DescriptionHomework()
            FilesHomework()
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
            text = "Инженерная графика",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            color = Color.White,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W700
        )
    }
    Column() {
        Card(
            modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 15.dp, bottom = 5.dp),
            elevation = 5.dp,
        ) {
            Row(
                Modifier.padding().fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Row(Modifier.padding(10.dp)) {
                    Text(
                        text = "Срок сдачи: 21.04.05",
                        modifier = Modifier
                            .padding(),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W300,
                    )
                }
            }
        }
        Card(
            modifier = Modifier.padding(start = 15.dp, end = 15.dp),
            elevation = 5.dp,
        ) {
            Row(
                Modifier.padding().fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Row(Modifier.padding(10.dp)) {
                    Text(
                        text = "Осталось: 15 дней",
                        modifier = Modifier
                            .padding(),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W300,
                    )
                }
            }
        }
    }

}


@Composable
fun DescriptionHomework() {
    Card(
        modifier = Modifier.fillMaxSize().padding(top = 20.dp),
        elevation = 5.dp,
    ) {
        Column() {
            Text(
                "Описание",
                modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                fontWeight = FontWeight.W600
            )
            Box(
                Modifier
                    .padding(top = 1.dp)
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(
                        MainOrange
                    )
            )
            Text(
                "Сделать чертеж. В рабочей тетради номера 12, 13, 15. ",
                fontSize = 18.sp,
                fontWeight = FontWeight.W300,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

@Composable
fun FilesHomework() {
    Card(
        modifier = Modifier.fillMaxSize().padding(top = 20.dp),
        elevation = 5.dp,
    ) {
        Column() {
            Text(
                "Файлы",
                modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                fontWeight = FontWeight.W600
            )
            Box(
                Modifier
                    .padding(top = 1.dp)
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(
                        MainOrange
                    )
            )
            Text(
                "Файлов нет",
                fontSize = 18.sp,
                fontWeight = FontWeight.W300,
                modifier = Modifier.padding(10.dp),
                color = Color.LightGray
            )
        }
    }
}

package com.example.main.acitivities.designwas.HomeworkAddScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.main.acitivities.ui.theme.CardBlue
import com.example.main.acitivities.ui.theme.MainOrange
import com.example.main.acitivities.ui.theme.Shapes

@ExperimentalMaterialApi
@Composable
fun HomeworkAddScreen() {
    val query1 = remember {
        mutableStateOf("")
    }
    val query2 = remember {
        mutableStateOf("")
    }
    val query3 = remember {
        mutableStateOf("")
    }
    Column() {
        TopText()
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = query1.value,
                onValueChange = { newValue ->
                    query1.value = newValue
                },
                label = { Text("Срок сдачи") },
                modifier = Modifier.padding(top = 10.dp, start = 50.dp, end = 50.dp),
            )
            OutlinedTextField(
                value = query2.value,
                onValueChange = { newValue ->
                    query2.value = newValue
                },
                label = { Text("Что задали?") },
                modifier = Modifier.padding(top = 10.dp, start = 50.dp, end = 50.dp),
            )
            OutlinedTextField(
                value = query3.value,
                onValueChange = { newValue ->
                    query3.value = newValue
                },
                label = { Text("Ссылка на файлы для дз") },
                modifier = Modifier.padding(top = 10.dp, start = 50.dp, end = 50.dp),
            )
            Card(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth().padding(start = 54.dp, end = 54.dp, top = 10.dp),
                backgroundColor = MainOrange
            ) {
                Text(
                    text = "Добавить",
                    modifier = Modifier.fillMaxWidth().padding(15.dp),
                    color = Color.White,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
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
}
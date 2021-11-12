package com.example.main.acitivities.designwas.SignUpScreen

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
import androidx.navigation.NavController
import com.example.main.acitivities.ui.theme.CardBlue
import com.example.main.acitivities.ui.theme.MainOrange
import com.example.main.acitivities.ui.theme.Shapes

@ExperimentalMaterialApi
@Composable
fun SignUpScreen(navController: NavController) {
    val query1 = remember {
        mutableStateOf("")
    }
    val query2 = remember {
        mutableStateOf("")
    }
    Column() {
        TopText()
        Column(
            modifier = Modifier.fillMaxWidth().padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = query1.value,
                onValueChange = { newValue ->
                    query1.value = newValue
                },
                label = { Text("Логин") },
                modifier = Modifier.padding(top = 10.dp, start = 50.dp, end = 50.dp),
            )
            OutlinedTextField(
                value = query2.value,
                onValueChange = { newValue ->
                    query2.value = newValue
                },
                label = { Text("Пароль") },
                modifier = Modifier.padding(top = 10.dp, start = 50.dp, end = 50.dp),
            )
            Card(
                onClick = {
                          navController.navigate("home")
                },
                modifier = Modifier.fillMaxWidth().padding(start = 54.dp, end = 54.dp, top = 10.dp),
                backgroundColor = MainOrange
            ) {
                Text(
                    text = "Войти",
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
            text = "Вход",
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
package com.example.main.acitivities.designwas.HomeworkSelectedScreen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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
import com.example.main.common.Common
import com.example.main.R
import com.example.main.acitivities.ui.theme.*
import com.example.main.models.RetrofitServices
import com.example.main.models.Post
import retrofit2.Callback
import retrofit2.Response

lateinit var mService: RetrofitServices




@Composable
fun SelectHomeworkScreen(id: String, navController: NavController) {
    Column() {
        Header(navController)

        Column(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxSize()
        ) {
            Column(
                Modifier
                    .fillMaxHeight()
                    .padding(bottom = 50.dp)
                    .verticalScroll(ScrollState(0))
            ) {
                TopText()
                for (i in 1..10) {
                    CardSubject(
                        cntCard = i,
                        navController
                    )
                }
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

@Composable
fun CardSubject(cntCard: Int, navController: NavController) {
    Card(
        modifier = Modifier
            .padding(top = 10.dp)
            .fillMaxHeight()
            .fillMaxWidth()
            .clickable {
                navController.navigate("homeworkabout")
            },
        elevation = 10.dp
    ) {
        Column() {
            if (cntCard == 1) {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(20.dp)
                        .background(SubjectTime)
                ) {
                    Text("до сдачи 24 дня", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                        color = Color.White, fontWeight = FontWeight.W800, fontSize = 15.sp)
                }
            }

            Row(
                Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .height(80.dp)
            ) {
                Column(
                    Modifier
                        .fillMaxHeight()
                        .padding(top = 20.dp, bottom = 20.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "Срок сдачи",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.W500,
                        color = Color.Black
                    )
                    Text(
                        "01.11.2021",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.W500,
                        color = Color.Black
                    )
                }
                Box(
                    Modifier
                        .padding(10.dp)
                        .fillMaxHeight()
                        .width(1.dp)
                        .background(MainOrange)
                )
                Column() {
                    Text(
                        "Сделать чертеж. В рабочей тетради номера 12, 13, 15",
                        modifier = Modifier.padding(top = 10.dp, end = 10.dp),
                        fontWeight = FontWeight.W500,
                    )
                    Text(
                        "Открыть полностью",
                        modifier = Modifier.padding(top = 1.dp, bottom = 10.dp, end = 10.dp),
                        fontWeight = FontWeight.W700
                    )
                }
            }
        }
    }
}

@Composable
fun Header(navController: NavController) {
    Column() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp, top = 15.dp)
        ) {
            Text(
                color = Color(0xFF333333),
                text = "ИУ7-15Б",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            IconButton(
                onClick = {
                          navController.navigate("homeworkadd")
                },
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
            ) {
                Image(
                    ImageVector.vectorResource(
                        id = R.drawable.ic_plus_rectangle
                    ),
                    "Localized description",
                    colorFilter = ColorFilter.tint(MainOrange),

                    alignment = Alignment.CenterEnd
                )
            }
        }
//    Line
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(1.dp)
                .background(color = Color(0xFF333333))
        )
    }
}
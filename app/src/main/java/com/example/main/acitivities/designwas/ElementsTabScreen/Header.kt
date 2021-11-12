package com.example.main.acitivities.designwas.ElementsTabScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header() {
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
                onClick = {},
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            ) {
                Icon(Icons.Filled.Notifications, contentDescription = null)
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
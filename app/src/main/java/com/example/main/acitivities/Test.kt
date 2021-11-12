package com.example.main.acitivities

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.main.presentation.BaseApplication
import com.example.main.acitivities.designwas.ElementsTabScreen.BottomNavItem
import com.example.main.acitivities.designwas.HomeworkAboutScreen.HomeworkAboutScreen
import com.example.main.acitivities.designwas.HomeworkAddScreen.HomeworkAddScreen
import com.example.main.acitivities.designwas.HomeworkSelectedScreen.SelectHomeworkScreen
import com.example.main.acitivities.designwas.HomeworkScreen.HomeworkScreen
import com.example.main.acitivities.designwas.SignUpScreen.SignUpScreen
import com.example.main.acitivities.designwas.screens.ScheduleScreen
import com.example.main.acitivities.ui.theme.*
import com.example.main.presentation.ui.schedule_screen.schedule_list.ScheduleListViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Test : ComponentActivity() {


    @ExperimentalMaterialApi
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var items =  ItemsNavBar()
        setContent {
            Scaffold() {
                Text("ASD")
            }
        }
//        setContent {
//                val navController = rememberNavController()
//                Scaffold(
//                    bottomBar = {
//                        BottomNavigationBar(
//                            items = items.GetItems(),
//                            navController = navController,
//                            onItemClick = {
//                                navController.navigate(it.route)
//                            }
//                        )
//                    }
//                ) {
//                    Navigation(navController = navController)
//                }
//            }

    }
}


@ExperimentalMaterialApi
@ExperimentalPagerApi
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "signUp") {
        composable("signUp") {
            SignUpScreen(navController)
        }
        composable("home") {
            HomeScreen()
        }
        composable("chat") {
            HomeworkScreen(navController = navController)
        }
        composable("settings") {
            AccountScreen()
        }
        composable("homework/{user}", arguments = listOf(navArgument("user"){type = NavType.StringType})) {
            NavBackStackEntry -> NavBackStackEntry?.arguments?.getString("user")?.let { it ->
                val id = it
                SelectHomeworkScreen(id, navController)
            }
        }
        composable("homeworkabout") {
            HomeworkAboutScreen()
        }
        composable("homeworkadd") {
            HomeworkAddScreen()
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = modifier,
        backgroundColor = Color.White,
        elevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item) },
                selectedContentColor = MainOrange,
                unselectedContentColor = NesibeGray,
                icon = {
                    Column(horizontalAlignment = CenterHorizontally) {
                        if(item.badgeCount > 0) {
                            BadgeBox(
                                badgeContent = {
                                    Text(text = item.badgeCount.toString())
                                }
                            ) {
                                Image(
                                    ImageVector.vectorResource(
                                        id = item.id
                                    ),
                                    "Localized description",
                                    colorFilter = if (selected) { ColorFilter.tint(MainOrange) }
                                    else {ColorFilter.tint(NesibeGray)},

                                    alignment = Alignment.CenterEnd
                                )
                            }
                        } else {
                            Image(
                                ImageVector.vectorResource(
                                    id = item.id
                                ),
                                "Localized description",
                                colorFilter = if (selected) { ColorFilter.tint(MainOrange) }
                                else {ColorFilter.tint(NesibeGray)},

                                alignment = Alignment.CenterEnd
                            )
                        }
                        if(selected) {
                            Text(
                                text = item.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            )
        }
    }
}

@ExperimentalPagerApi
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ScheduleScreen()
    }
}


@Composable
fun AccountScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Account screen")
    }
}


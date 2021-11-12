package com.example.main.acitivities

import com.example.main.R
import com.example.main.acitivities.designwas.ElementsTabScreen.BottomNavItem

class ItemsNavBar() {
    private val items = listOf(
        BottomNavItem(
            name = "Расписание",
            route = "home",
            id = R.drawable.ic_calendar_alt
        ),
        BottomNavItem(
            name = "Домашняя работа",
            route = "chat",
            id = R.drawable.ic_task_list,
            badgeCount = 23
        ),
        BottomNavItem(
            name = "Аккаунт",
            route = "settings",
            id = R.drawable.ic_user_square,
        ),
    )
    public fun GetItems():List<BottomNavItem> {
        return items
    }
}
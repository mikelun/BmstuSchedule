package com.example.main.acitivities.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.ui.graphics.vector.ImageVector

class Page(var title: String, icon: ImageVector)

var pages = Array(10, {Page("1", Icons.Default.Call)})
package com.kolee.composephotomemo.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Purple80 = Color(0xFFD0BCFF)
val RoyalBlue = Color(0xFF4169E1)
val LightWhite = Color(0xFFE3E3E3)
val LightGray = Color(0xFFBEBEBE)

val ItemDarkBackGround = Color(0xFF393939)
val ItemLightBackGround = Color(0xFFFFFF8D).copy(alpha = 0.76f)

val Colors.TextDefaultColor: Color
    @Composable get() = if (isLight) Color(0xFF2B2B2B) else Color(0xFFCECECE)
val Colors.TextHintColor: Color
    @Composable get() = if (isLight) Color(0xFF848484) else Color(0xFF9B9B9B)
val Colors.BorderColor: Color
    @Composable get() = if (isLight) Color(0xFFBEBEBE) else Color(0xFF848484)
val Colors.ItemBackgroundColor: Color
    @Composable get() = if (isLight) Color(0xFFFFFF8D) else Color(0xFF393939)
val Colors.BottomBarBackgroundColor: Color
    @Composable get() = if (isLight) Color(0xFFE1E1E1) else Color(0xFF393939)
val Colors.DialogBackgroundColor: Color
    @Composable get() = if (isLight) Color(0xFFECE7DD) else Color(0xFF848484)


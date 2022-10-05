package com.bignerdranch.android.productivitypalaceredux.ui

import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors

@Composable
fun ProductivityPalaceReduxTheme (
    content: @Composable () -> Unit
) = MaterialTheme(
        colors = lightColors(
        primary = Color(0xFFB72A33),
        primaryVariant = Color(0xFFA6262E),
        secondary = Color(0xFF03C4DD),
        secondaryVariant = Color(0xFF03B2C9)
        )
    ){

        content()


    }
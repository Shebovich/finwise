package com.example.myfirstkmp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun AppTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) AppColors.Dark else AppColors.Light

    CompositionLocalProvider(
        LocalAppColors provides colors
    ) {
        content()
    }
}
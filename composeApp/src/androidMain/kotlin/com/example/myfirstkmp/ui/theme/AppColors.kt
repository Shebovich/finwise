package com.example.myfirstkmp.ui.theme

import androidx.compose.ui.graphics.Color

data class AppColors(
    val darkModeGreenBlack: Color,
    val backgroundDarkAndLetters: Color,
    val lettersAndIcons: Color,
    val darkModeGreenBar: Color,
    val mainGreen: Color,
    val lightGreen: Color,
    val lightBlueButton: Color,
    val oceanBlueButton: Color,
    val white: Color,
) {
    companion object {
        // Тёмная тема (используем ваши оригинальные цвета)
        val Dark = AppColors(
            darkModeGreenBlack = Color(0xFF031314),
            backgroundDarkAndLetters = Color(0xFF052224),
            lettersAndIcons = Color(0xFF093030),
            darkModeGreenBar = Color(0xFF0E3E3E),
            mainGreen = Color(0xFF00D09E),
            lightGreen = Color(0xFFDFF7E2),
            lightBlueButton = Color(0xFF6DB6FE),
            oceanBlueButton = Color(0xFF0068FF),
            white = Color.White
        )

        // Светлая тема (адаптированные цвета)
        val Light = AppColors(
            darkModeGreenBlack = Color(0xFFE8F5E9),      // светлая версия
            backgroundDarkAndLetters = Color(0xFFFFFFFF), // белый
            lettersAndIcons = Color(0xFF616161),          // серый
            darkModeGreenBar = Color(0xFFC8E6C9),         // светлый зелёный
            mainGreen = Color(0xFF00D09E),                // тот же акцентный цвет
            lightGreen = Color(0xFFDFF7E2),               // тот же
            lightBlueButton = Color(0xFF6DB6FE),          // тот же
            oceanBlueButton = Color(0xFF0068FF),
            white = Color.White// тот же
        )
    }
}
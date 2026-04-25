package com.example.myfirstkmp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstkmp.shared.MR
import com.example.myfirstkmp.ui.theme.AppTheme
import com.example.myfirstkmp.ui.theme.LocalAppColors
import dev.icerock.moko.resources.compose.asFont
import dev.icerock.moko.resources.compose.fontFamilyResource
import dev.icerock.moko.resources.compose.stringResource


@Composable
@Preview
fun App() {
    AppTheme {
        SplashScreen()
    }
}

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.mainGreen),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.width(109.dp).height(115.dp),
            painter = painterResource(MR.images.splash.drawableResId),
            contentDescription = "splashIcon"
        )

        Text(
            text = stringResource(MR.strings.finwise.resourceId),
            fontFamily = fontFamilyResource(MR.fonts.poppins_semibold),
            fontSize = 52.sp,
            color = AppTheme.colors.white
        )
    }
}
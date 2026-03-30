package com.example.praktam_2467051025.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val AppColorScheme = lightColorScheme(
    primary = RosePrimary,
    secondary = RoseSecondary,
    background = RoseBackground,
    surface = RoseSurface,
    onPrimary = OnPrimaryText
)

@Composable
fun PrakTAM_2467051025Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = Typography,
        content = content
    )
}
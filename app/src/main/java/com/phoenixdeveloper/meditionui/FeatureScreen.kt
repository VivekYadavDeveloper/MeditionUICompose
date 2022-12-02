package com.phoenixdeveloper.meditionui

import android.graphics.Color
import androidx.annotation.DrawableRes

data class Feature(
    val title: String,
    @DrawableRes val iconID: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color,
)

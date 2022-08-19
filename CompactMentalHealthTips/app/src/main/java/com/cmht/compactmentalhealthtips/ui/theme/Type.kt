package com.cmht.compactmentalhealthtips.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cmht.compactmentalhealthtips.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)

val CorporateProRegular = FontFamily (
    Font(R.font.corporate_pro_regular_medium, FontWeight.Thin),
    Font(R.font.corporate_pro_regular_medium, FontWeight.Normal),
    Font(R.font.corporate_pro_regular_medium, FontWeight.Bold),
)

val BrandBold = FontFamily(
    Font(R.font.brand_bold, FontWeight.Thin),
    Font(R.font.brand_bold, FontWeight.Normal),
    Font(R.font.brand_bold, FontWeight.Bold),
)
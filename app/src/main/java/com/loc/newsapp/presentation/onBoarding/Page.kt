package com.loc.newsapp.presentation.onBoarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Test page 1st Dump title",
        description = "Test page 1st Dump Description,Test page 1st Dump Description, Test page 1st Dump Description,",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Test page 2nd Dump title",
        description = "Test page 2nd Dump Description,Test page 2nd Dump Description, Test page 2nd Dump Description,",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Test page 3rd Dump title",
        description = "Test page 3rd Dump Description,Test page 3rd Dump Description, Test page 3rd Dump Description,",
        image = R.drawable.onboarding3
    )
)

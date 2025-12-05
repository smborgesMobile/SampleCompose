package com.sborges.androidlearning.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(Color(0xFF4CAF50))
            .fillMaxSize()
    ) {

    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    Column {
        HomeScreen()
    }
}
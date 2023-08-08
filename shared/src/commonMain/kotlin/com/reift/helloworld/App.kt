package com.reift.helloworld

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun App(){
    var count by remember { mutableStateOf(0) }
    Box(
        modifier = Modifier.background(Color.White).fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

            Button(onClick = { count++ }) {
                Text(text = "Count: $count")
            }

    }
}
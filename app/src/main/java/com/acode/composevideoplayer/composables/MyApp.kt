package com.acode.composevideoplayer.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment

@Composable
fun MyApp() {
    var source by rememberSaveable {
        mutableStateOf(
            "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"
        )
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        VideoPlayer(sourceUrl = source)

        Button(onClick = {
            source = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"
        }) {
            Text(text = "Video 1")
        }
        Button(onClick = {
            source = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
        }) {
            Text(text = "Video 2")
        }
        Button(onClick = {
            source = "https://cdn.videvo.net/videvo_files/video/free/2020-03/large_watermarked/Tromeur_Knight2_preview.mp4"
        }) {
            Text(text = "Video 3")
        }
    }
}





package com.acode.composevideoplayer.composables

import android.net.Uri
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.PlayerControlView
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.exoplayer2.upstream.DefaultDataSource

@Composable
fun VideoPlayer(
    sourceUrl: String
) {
    //Accessing current context from composable function
    val context = LocalContext.current

//    val videoUrl = "https://cdn.videvo.net/videvo_files/video/free/2020-03/large_watermarked/Tromeur_Knight2_preview.mp4"
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            val dataSource = DefaultDataSource.Factory(context)
            val source = ProgressiveMediaSource.Factory(dataSource)
                .createMediaSource(MediaItem.fromUri(Uri.parse(sourceUrl)))

            this.addMediaSource(source)
            this.prepare()
        }
    }

    AndroidView(
        modifier = Modifier.fillMaxWidth(),
        factory = {
            StyledPlayerView(it).apply {
                this.player = exoPlayer
                this.useController = true
                this.setShowBuffering(
                    StyledPlayerView.SHOW_BUFFERING_ALWAYS
                )
                
            }
        }
    )


}










package com.acode.composevideoplayer.composables

import androidx.compose.foundation.Image
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeAppBar(
    title: String,
    openSearch: () -> Unit,
    openFilters: () -> Unit
) {
    TopAppBar (
        title = { Text(text = title, color = Color.White )},
        backgroundColor = Color(0xFF889949),
        actions = {
            IconButton(onClick = openSearch) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    tint = Color.White
                )
            }

            IconButton(onClick = openFilters) {
                Icon(
                    imageVector = Icons.Filled.FilterList,
                    contentDescription = "Filter",
                    tint = Color.White
                )
            }
        }
            )
}

@Preview
@Composable
fun HomeAppBarPreview() {
    HomeAppBar(title = "EpicWorld", openSearch = { /*TODO*/ }) {
        
    }
}
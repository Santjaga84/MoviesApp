package com.example.moviesapp.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.moviesapp.MainViewModel
import org.w3c.dom.Text

@Composable
fun DetailsScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
      Text("Details screen: item id: ${itemId}")
}
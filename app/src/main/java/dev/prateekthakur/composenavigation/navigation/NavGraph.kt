package dev.prateekthakur.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.prateekthakur.composenavigation.screens.DetailScreen
import dev.prateekthakur.composenavigation.screens.HomeScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route){
            HomeScreen(navController)
        }
        composable(route = Screen.Details.route){
            DetailScreen(navController)
        }
    }
}
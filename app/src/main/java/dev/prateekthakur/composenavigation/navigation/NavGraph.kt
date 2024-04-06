package dev.prateekthakur.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import dev.prateekthakur.composenavigation.screens.DetailScreen
import dev.prateekthakur.composenavigation.screens.HomeScreen
import dev.prateekthakur.composenavigation.screens.MessageScreen

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
        composable(
            route = Screen.Message.route,
            arguments = listOf(navArgument(Screen.Message.MESSAGE){
                type = NavType.StringType
                defaultValue = "Hi"
            })
        ){
            MessageScreen(it.arguments?.getString(Screen.Message.MESSAGE)!!)
        }
    }
}
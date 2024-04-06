package dev.prateekthakur.composenavigation.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("home")
    data object Details: Screen("details")
    data object Message: Screen(route = "message/{message}"){
        const val MESSAGE = "message"
        fun passArgument(message:String): String {
            return "message/$message"
        }
    }
}
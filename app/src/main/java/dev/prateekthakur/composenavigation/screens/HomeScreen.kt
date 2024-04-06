package dev.prateekthakur.composenavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.prateekthakur.composenavigation.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController
) {
    var input by remember { mutableStateOf("") }
    var sendable by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Home", style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = input, onValueChange = {
            input = it
            sendable = it.isNotBlank()
        }, placeholder = { Text(text = "Message") })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(
            enabled = sendable,
            onClick = {
                navController.navigate(Screen.Message.passArgument(input))
            }) {
            Text(text = "Send")
        }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = {
            navController.navigate(Screen.Details.route)
        }) {
            Text(text = "Go To Details")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}
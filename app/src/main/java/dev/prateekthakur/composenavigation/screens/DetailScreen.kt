package dev.prateekthakur.composenavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Details", style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        ))
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Go To Home")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeDetailPreview(){
    DetailScreen(navController = rememberNavController())
}
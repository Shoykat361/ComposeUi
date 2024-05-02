package com.shoykatsaha.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shoykatsaha.composeui.ui.theme.ComposeUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun  MyApp(){
    ComposeUiTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
           // Greeting("Android")
            BoxExample()
        }
    }
}

@Composable
fun BoxExample() {
    Box(
        //contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface (
            color = Color.Blue,
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ){

        }
        Surface (
            color = Color.Cyan,
            shape = RoundedCornerShape(30),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 150.dp, start = 24.dp, end = 24.dp)
                .height(100.dp)
        ){

        }



    }

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        //verticalArrangement = Arrangement.Center,
        /*horizontalAlignment = Alignment.CenterHorizontally,
        modifier =  modifier.background(Color.Blue)*/){

        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "Hello Saha!",
            modifier = modifier
        )
        Text(
            text = "Hello Shoykat !",
            modifier = modifier
        )
        Row(
            modifier = modifier
                .background(Color.Blue)
                .fillMaxWidth()
            /* verticalAlignment = Alignment.Bottom,
             horizontalArrangement = Arrangement.Center*/
        ) {

            Text(
                text = "Hello Shoykat !",
                modifier = modifier
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}
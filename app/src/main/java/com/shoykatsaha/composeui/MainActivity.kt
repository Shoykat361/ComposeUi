package com.shoykatsaha.composeui

import android.content.Context
import android.content.res.Configuration
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shoykatsaha.composeui.ui.theme.ComposeUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()

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
fun BoxExample(modifier: Modifier= Modifier) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Gray)
                .weight(1f), contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                text = "0",
                fontSize = 30.sp
            )

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .fillMaxHeight()
                .background(Color.Red)
                .weight(5f),
        ) {
            Column {
                Row {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Cqq",
                            fontSize = 30.sp
                        )

                    }
                }
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)){
                    Column(modifier = Modifier.width(100.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .fillMaxHeight()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }

                    }
                    Column(modifier = Modifier.width(100.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .fillMaxHeight()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }

                    }
                    Column(modifier = Modifier.width(100.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .fillMaxHeight()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }

                    }
                    Column(modifier = Modifier.width(100.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }


                    }


                }
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)){
                    Column(modifier = Modifier.width(100.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .fillMaxHeight()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Cjjj",
                                fontSize = 30.sp
                            )

                        }

                    }
                    Column(modifier = Modifier.width(100.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .fillMaxHeight()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }

                    }
                    Column(modifier = Modifier.width(100.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .fillMaxHeight()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "C",
                                fontSize = 30.sp
                            )

                        }

                    }
                    Column(modifier = Modifier.width(100.dp)) {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                                .background(Color.Blue)
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Cnnn",
                                fontSize = 30.sp
                            )

                        }


                    }


                }


                /*Row {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                }
                Row {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(2f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .fillMaxHeight()
                            .padding(5.dp)
                            .background(Color.Blue)
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "C",
                            fontSize = 30.sp
                        )

                    }
                }*/
            }


        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}

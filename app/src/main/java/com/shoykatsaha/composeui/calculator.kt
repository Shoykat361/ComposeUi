/*
package com.shoykatsaha.composeui


@Composable
fun CalculatorLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Display(text = "0", modifier = modifier.weight(1f))
        KeySection(modifier = modifier.weight(3f))
    }
}

@Composable
fun KeySection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(4.dp)

    ) {
        FirstRow(modifier = Modifier.weight(1f))
        SecondRow(modifier = Modifier.weight(2f))
        ThirdRow(modifier = Modifier.weight(2f))
    }
}

@Composable
fun FirstRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        CalculatorButton(text = "C", modifier = Modifier.weight(1f).fillMaxHeight())
        CalculatorButton(text = "/", modifier = Modifier.weight(1f).fillMaxHeight())
        CalculatorButton(text = "*", modifier = Modifier.weight(1f).fillMaxHeight())
        CalculatorButton(text = "-", modifier = Modifier.weight(1f).fillMaxHeight())
    }
}

@Composable
fun SecondRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.weight(3f)
        ){
            Row(
                modifier = Modifier.weight(1f)
            ) {
                CalculatorButton(text = "1", modifier = Modifier.weight(1f).fillMaxHeight())
                CalculatorButton(text = "2", modifier = Modifier.weight(1f).fillMaxHeight())
                CalculatorButton(text = "3", modifier = Modifier.weight(1f).fillMaxHeight())
            }
            Row(
                modifier = Modifier.weight(1f)
            ) {
                CalculatorButton(text = "4", modifier = Modifier.weight(1f).fillMaxHeight())
                CalculatorButton(text = "5", modifier = Modifier.weight(1f).fillMaxHeight())
                CalculatorButton(text = "6", modifier = Modifier.weight(1f).fillMaxHeight())
            }
        }
        CalculatorButton(text = "+", modifier = Modifier.weight(1f).fillMaxHeight())
    }
}

@Composable
fun ThirdRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.weight(3f)
        ){
            Row(
                modifier = Modifier.weight(1f)
            ) {
                CalculatorButton(text = "1", modifier = Modifier.weight(1f).fillMaxHeight())
                CalculatorButton(text = "2", modifier = Modifier.weight(1f).fillMaxHeight())
                CalculatorButton(text = "3", modifier = Modifier.weight(1f).fillMaxHeight())
            }
            Row(
                modifier = Modifier.weight(1f)
            ) {
                CalculatorButton(text = "0", modifier = Modifier.weight(2f).fillMaxHeight())
                CalculatorButton(text = ".", modifier = Modifier.weight(1f).fillMaxHeight())
            }
        }
        CalculatorButton(text = "=", modifier = Modifier.weight(1f).fillMaxHeight())
    }
}



@Composable
fun Display(text: String, modifier: Modifier = Modifier) {
    val fontSize = if (isPortrait(LocalContext.current)) 60.sp else 40.sp
    Box(
        contentAlignment = Alignment.CenterEnd,
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Gray)

    ) {
        Text(
            text = text,
            fontSize = fontSize,
            textAlign = TextAlign.End,
            color = Color.White,
            modifier = Modifier.padding(end = 16.dp)
        )
    }
}

@Composable
fun CalculatorButton(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.DarkGray,) {
    val fontSize = if (isPortrait(LocalContext.current))
        40.sp else 25.sp
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .padding(4.dp)
            .size(100.dp)
            .background(color)
    ) {
        Text(
            text = text,
            fontSize = fontSize,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorLayoutPreview() {
    CalculatorLayout()
}

fun isPortrait(context: Context): Boolean {
    val configuration = context.resources.configuration
    return configuration.orientation == Configuration.ORIENTATION_PORTRAIT
}
*/

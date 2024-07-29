package com.example.dessertclicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dessertclicker.ui.theme.DessertClickerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DessertClickerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier
                        .fillMaxSize(),

                ) {
                    DessertScreen()
                }
            }
        }
    }
}

@Composable
fun DessertScreen(/*dessertViewModel: DessertViewModel = viewModel()*/) {
    val img by remember { mutableStateOf(R.drawable.dessert) }
    //val dessertUiState by dessertViewModel.uiState.collectAsState()

    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        //DessertClicker(onDessertclicked = { dessertViewModel.afterClick()})
            Image(
                painter = painterResource(img),
                contentDescription = stringResource(R.string.dessert),
                /*modifier = Modifier
                    .wrapContentSize()
                    .clickable {
                        //onDessertclicked()
                    }*/

            )
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = stringResource(R.string.dessert),
            //text = "hhhhhhhh",

            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(50.dp))
    }
}





/*
@Composable

fun DessertApp(){
    DessertScreen()
}

@Composable
fun DessertClick(modifier: Modifier = Modifier) {
    var noOfClick by rememberSaveable { mutableIntStateOf(0) }
    val total = calculateTotal(noOfClick)


}

private fun calculateTotal(noOfClick: Int): String {
    val total = noOfClick * 10
    return NumberFormat.getCurrencyInstance().format(total)
}*/

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DessertClickerTheme {
        DessertScreen()
    }
}
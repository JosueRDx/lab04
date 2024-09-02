package com.JosueRDx.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.JosueRDx.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                    //función a probar
                    MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RadioButtonExample()
        CheckboxExample()
        DividerControl()
    }

}

@Composable
fun RadioButtonExample() {
    var selected by remember { mutableStateOf(false) }

    RadioButton(selected = selected, onClick = { selected = !selected })
    Text(
        text = "RadioButton",
        color = Color.Blue
    )
}


@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }

    Checkbox(checked = checked, onCheckedChange = { checked = it })
    Text(text = "Checkbox", color = Color.Yellow)
}

@Composable
fun DividerControl() {
    HorizontalDivider(thickness = 10.dp, color = Color.Green)
}

@Preview(showBackground = true)
@Composable
fun FlowRowPreview() {
    MainScreen()
}
package com.example.appupdate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appupdate.ui.theme.AppUpdateTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()

        }
    }
}

@Composable
fun App() {
    SimpleCenterAlignedTopAppBar()
    SimpleFilledTextFieldSample()
    SimpleFilledTextFieldSample2()
    Spacer(modifier = Modifier.padding(20.dp))
    ButtonSample()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleCenterAlignedTopAppBar() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Cadastro",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Favorite,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
            LazyColumn(
                contentPadding = innerPadding,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {


            }
        }


    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleFilledTextFieldSample() {
    var text by rememberSaveable { mutableStateOf("") }
Column(
    Modifier.padding(100.dp),
    Arrangement.Center,
    Alignment.CenterHorizontally
) {
    OutlinedTextField(
        value = text,
        onValueChange = {text = it},
        label = { Text(text = "Email") }
    )
}


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleFilledTextFieldSample2() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        Modifier.padding(170.dp),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = {text = it},
            label = { Text(text = "Senha") }
        )

        }
    }

@Composable
fun ButtonSample() {
    Column(
        Modifier.padding(19.dp),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Cadastar")
        }
    }
}


@Preview()
@Composable
fun SimpleCenterAlignedTopAppBarPreviw(){
    SimpleFilledTextFieldSample2()
}


@Preview()
@Composable
fun ButtonPreviw(){
    ButtonSample()
}

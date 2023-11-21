package com.example.appdetarjetasdepresentacin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdetarjetasdepresentacin.ui.theme.AppDeTarjetasDePresentaciónTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            initApp()
        }
    }

    @Composable
    fun initApp() {
        AppDeTarjetasDePresentaciónTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFFAAC887)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    setLogotipo()
                    Spacer(modifier = Modifier.weight(1f))
                    setAllInfo()
                }
            }
        }
    }

    @Composable
    fun setLogotipo() {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .size(140.dp)
                    .background(color = colorResource(id = R.color.verde_oscuro))
            )
            Text(
                text = "Jennifer Doe",
                modifier = Modifier,
                fontSize = 56.sp,
                color = colorResource(id = R.color.verde_oscuro)
            )
            Text(
                text = "Android Developer Extraordinaire",
                modifier = Modifier.padding(16.dp),
                color = colorResource(id = R.color.verde_no_tan_oscuro)
            )
        }
    }

    @Composable
    fun setInfo(icono: Int, text: String) {
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = icono),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = text,
                modifier = Modifier,
                color = colorResource(id = R.color.verde_oscuro)
            )
        }
    }

    @Composable
    fun setAllInfo() {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            setInfo(R.drawable.baseline_phone_black_24dp, "+11 (123) 44 555 666")
            setInfo(R.drawable.baseline_share_black_24dp, "jen.doe@android.com ")
            setInfo(R.drawable.baseline_email_black_24dp, "jen.doe@android.com ")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        initApp()
    }
}

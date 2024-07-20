package com.shashank.appandlibmodules

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.shashank.appandlibmodules.ui.theme.AppAndLibModulesTheme
import com.shashank.testlib.components.TextComposable

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppAndLibModulesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    TextComposable()
                }
            }
        }
    }
}
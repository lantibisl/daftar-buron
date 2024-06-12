package org.d3if0158.daftarburon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.d3if0158.daftarburon.ui.screen.MainScreen
import org.d3if0158.daftarburon.ui.theme.DaftarBuronTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaftarBuronTheme {
                MainScreen()
            }
        }
    }
}
package android.test.currencyassistant.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.test.currencyassistant.R
import android.test.currencyassistant.di.components.NetworkComponent

class MainActivity : AppCompatActivity() {

    var networkComponent: NetworkComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

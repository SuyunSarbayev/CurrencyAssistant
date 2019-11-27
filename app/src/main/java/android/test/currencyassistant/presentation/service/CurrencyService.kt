package android.test.currencyassistant.presentation.service

import android.app.Service
import android.content.Intent
import android.location.LocationManager
import android.os.Binder
import android.os.IBinder
import android.test.currencyassistant.presentation.interfaces.TimerCallbackInterface
import java.util.*

class CurrencyService(var timerCallbackInterface: TimerCallbackInterface) : Service() {

    var binder: Binder = Binder()
    var timer: Timer = Timer()

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)

        startUpdates()

        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return binder
    }

    fun startUpdates(){
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                timerCallbackInterface.onTimerTicked()
            }
        }, 0, 1000)
    }
}
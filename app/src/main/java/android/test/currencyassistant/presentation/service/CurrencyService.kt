package android.test.currencyassistant.presentation.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.Handler
import android.os.IBinder
import android.test.currencyassistant.presentation.utils.Constants
import java.util.*


class CurrencyService() : Service() {

    var binder: Binder = Binder()
    var timer: Timer = Timer()

    private val delay: Long = 1000
    private val handler: Handler = Handler()
    private var started: Boolean = false

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)

        started = true

        startUpdates()

        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return binder
    }

    fun startUpdates(){
        val runnable: Runnable = object : Runnable {
            override fun run() {
                sendCurrencyUpdate()
                if (started) {
                    handler.postDelayed(this, delay)
                }
            }
        }
        runnable.run()
    }

    override fun onDestroy() {
        super.onDestroy()
        started = false
    }

    fun sendCurrencyUpdate(){
        sendBroadcast(Intent().apply {
            action = Constants.PageConstants.update_currency_action
        })
    }
}
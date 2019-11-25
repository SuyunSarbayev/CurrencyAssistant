package android.test.currencyassistant.presentation.utils

import android.test.currencyassistant.presentation.interfaces.TimerCallbackInterface
import java.util.*

class TimerHelper(scheduleRate: Long, timerInterface: TimerCallbackInterface) : Timer() {

    var scheduleRate: Long = 1000
    var timerInterface: TimerCallbackInterface

    init {
        this.scheduleRate = scheduleRate
        this.timerInterface = timerInterface
    }

    fun initializeTimer(){
        this.scheduleAtFixedRate(object: TimerTask(){
            override fun run() {
                timerInterface.onTimerTicked()
            }
        }, 0 , scheduleRate)
    }

    fun pause(){
        this.pause()
    }

    fun resume(){
        this.resume()
    }
}
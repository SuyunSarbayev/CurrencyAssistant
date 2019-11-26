package android.test.currencyassistant.presentation.utils

import android.test.currencyassistant.presentation.interfaces.TimerCallbackInterface
import java.util.*

class TimerHelper(scheduleRate: Long, timerInterface: TimerCallbackInterface){

    var timer: Timer? = null
    var scheduleRate: Long = 1000
    var timerInterface: TimerCallbackInterface

    init {
        this.scheduleRate = scheduleRate
        this.timerInterface = timerInterface
    }

    fun initializeTimer(){
        timer = Timer()
        timer?.scheduleAtFixedRate(object: TimerTask(){
                override fun run() {
                    timerInterface.onTimerTicked()
                }
            }, 0 , scheduleRate)
        }

    fun cancelTimer(){
        timer?.cancel()
    }
}
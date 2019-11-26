package android.test.currencyassistant.presentation.utils

import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.widget.TextView

class AnimationHelper {
    companion object{
        fun switchTextAnimation(animationTextView: TextView, text: String?) {
            val anim = AlphaAnimation(1.0f, 0.0f)
            anim.duration = 200
            anim.repeatCount = 1
            anim.repeatMode = Animation.REVERSE
            anim.setAnimationListener(object : AnimationListener {
                override fun onAnimationStart(animation: Animation) {}
                override fun onAnimationEnd(animation: Animation) {}
                override fun onAnimationRepeat(animation: Animation) {
                    animationTextView.text = text
                }
            })
            animationTextView.startAnimation(anim)
        }
    }
}
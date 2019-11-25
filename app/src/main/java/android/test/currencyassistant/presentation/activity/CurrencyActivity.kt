package android.test.currencyassistant.presentation.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.test.currencyassistant.presentation.base.BaseActivity
import android.test.currencyassistant.presentation.base.BaseFragment
import android.test.currencyassistant.presentation.fragment.CurrencyFragment

class CurrencyActivity : BaseActivity() {

    override fun onInitFragment(): BaseFragment? {
        return CurrencyFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}
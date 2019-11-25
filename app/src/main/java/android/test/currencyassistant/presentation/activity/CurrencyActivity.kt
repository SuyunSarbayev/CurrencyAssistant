package android.test.currencyassistant.presentation.activity

import android.os.Bundle
import android.test.currencyassistant.presentation.base.BaseActivity
import android.test.currencyassistant.presentation.base.BaseFragment
import android.test.currencyassistant.presentation.fragment.CurrencyFragment

class CurrencyActivity : BaseActivity() {

    override fun onInitFragment(): BaseFragment? {
        return CurrencyFragment.newInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
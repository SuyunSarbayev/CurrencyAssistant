package android.test.currencyassistant.presentation.fragment

import android.os.Bundle
import android.test.currencyassistant.R
import android.test.currencyassistant.presentation.base.BaseActivity
import android.test.currencyassistant.presentation.base.BaseFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar

import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.fragment_currency.*

class CurrencyFragment : BaseFragment() {

    override fun getFragmentTag(): String? {
        return this.javaClass.name
    }

    override fun onLayoutId(): Int {
        return R.layout.fragment_currency
    }

    override fun customizeActionBar() {
        var toolbar: Toolbar = mainActivity().findViewById(R.id.toolbar_activity_base) as Toolbar
        mainActivity().setSupportActionBar(toolbar);
        mainActivity().supportActionBar!!.setDisplayShowHomeEnabled(true)
        activity?.toolbar_activity_base?.title = "Rates"
        activity?.toolbar_activity_base?.setTitleTextColor(resources.getColor(R.color.color_black))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return rootView
    }

    override fun onResume() {
        super.onResume()
    }
}
package android.test.currencyassistant.presentation.fragment

import android.content.Context
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
        mainActivity().setSupportActionBar(activity?.toolbar_activity_base);
        mainActivity().supportActionBar!!.setDisplayShowHomeEnabled(true)
        activity?.toolbar_activity_base?.title = "Rates"
        activity?.toolbar_activity_base?.setTitleTextColor(resources.getColor(R.color.color_black))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return rootView
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onResume() {
        super.onResume()

        customizeActionBar()
    }

    companion object {
        @JvmStatic
        fun newInstance() = CurrencyFragment().apply {}
    }

}
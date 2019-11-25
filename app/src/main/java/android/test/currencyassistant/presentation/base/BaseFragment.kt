package android.test.currencyassistant.presentation.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    lateinit var rootView: View

    abstract fun getFragmentTag(): String?

    protected abstract fun onLayoutId(): Int

    protected abstract fun customizeActionBar()

    override fun onResume() {
        super.onResume()
        customizeActionBar()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun mainActivity() : BaseActivity{
        return activity as BaseActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(onLayoutId(), container, false)

        setHasOptionsMenu(true)
        customizeActionBar()

        return rootView
    }

    open fun hideKeyboard() {
        if (context != null) {
            val imm =
                context!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            if (imm != null && rootView != null) imm.hideSoftInputFromWindow(
                rootView.getWindowToken(),
                0
            )
        }
    }
}
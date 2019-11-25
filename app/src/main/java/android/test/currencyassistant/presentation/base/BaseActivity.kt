package android.test.currencyassistant.presentation.base

import android.os.Bundle
import android.test.currencyassistant.R
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity : AppCompatActivity() {

    var allowTransaction: Boolean = false

    protected abstract fun onInitFragment(): BaseFragment?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initializeLayout())

        allowTransaction = true

        setSupportActionBar(toolbar_activity_base);

        if (getCurrentFragment() == null) {
            displayFragment(onInitFragment())
        }
    }

    fun initializeLayout() : Int{
        return R.layout.activity_base
    }

    private fun getCurrentFragment(): BaseFragment? {
        val fm = supportFragmentManager
        val entryCount = fm.backStackEntryCount
        if (entryCount > 0) {
            val fragmentTag = fm.getBackStackEntryAt(entryCount - 1).name
            return fm.findFragmentByTag(fragmentTag) as BaseFragment
        }
        return null
    }

    override fun onBackPressed() {
        super.onBackPressed()
        popBackStack()
    }

    open fun displayFragment(fragment: BaseFragment?) {
        if(allowTransaction && fragment != null){
            val fm = supportFragmentManager

            if (fm.backStackEntryCount > 0 && getCurrentFragment() != null && getCurrentFragment()!!.getFragmentTag().equals(fragment.getFragmentTag())) {
                val ft = fm.beginTransaction()
                if (fm.backStackEntryCount > 0) {
                    ft.hide(getCurrentFragment() as Fragment)
                }

                val existFragment = fm.findFragmentByTag(fragment.getFragmentTag()) as BaseFragment

                ft.show(existFragment)
                ft.commit()
                return
            }

            val ft = fm.beginTransaction()

            if (fm.backStackEntryCount > 0) {
                ft.hide(getCurrentFragment() as Fragment)
            }
            ft.add(R.id.relativelayout_activity_base_fragment_container, fragment, fragment.getFragmentTag())
            ft.addToBackStack(fragment.getFragmentTag())
            ft.commit()
        }
    }

    open fun popBackStack() {
        if (allowTransaction) {
            val fm = supportFragmentManager
            if (fm.backStackEntryCount <= 1) {
                finish()
            } else {
                val ft = fm.beginTransaction()
                var currentFragment: BaseFragment? = getCurrentFragment() ?: return
                currentFragment?.hideKeyboard()

                ft.hide(currentFragment!!)
                ft.remove(currentFragment)

                popCurrentFragment()

                currentFragment = getCurrentFragment()
                ft.show(currentFragment!!)
                ft.commit()
                invalidateOptionsMenu()
            }
        }
    }

    open fun popCurrentFragment(){
        val fm = supportFragmentManager
        if (fm.backStackEntryCount > 0) {
            fm.popBackStackImmediate()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onPause() {
        super.onPause()
        allowTransaction = false
    }

    override fun onStop() {
        super.onStop()
        allowTransaction = false
    }

    override fun onStart() {
        super.onStart()
        allowTransaction = true
    }

    override fun onResume() {
        super.onResume()
        allowTransaction = true
    }
}
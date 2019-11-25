package android.test.currencyassistant.presentation.base

import android.os.Bundle
import android.os.PersistableBundle
import android.test.currencyassistant.R
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity : AppCompatActivity() {

    var active: Boolean = false
    var toolbar: Toolbar? = null

    protected abstract fun onInitFragment(): BaseFragment?

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(initializeLayout())

        toolbar = findViewById(R.id.toolbar_activity_base) as Toolbar
        setSupportActionBar(toolbar);

        if (getCurrentFragment() == null) {
            displayFragment(onInitFragment())
        }
    }

    fun initializeLayout() : Int{
        return R.layout.activity_base
    }

    open fun getCurrentFragment(): BaseFragment? {
        val fm = supportFragmentManager
        val entryCount = fm.backStackEntryCount
        if (entryCount > 0) {
            val fragmentTag = fm.getBackStackEntryAt(entryCount - 1).name
            return fm.findFragmentByTag(fragmentTag) as BaseFragment?
        }
        return null
    }

    open fun allowTransaction(): Boolean {
        return active
    }

    override fun onBackPressed() {
        super.onBackPressed()
        popBackStack()
    }

    open fun displayFragment(fragment: BaseFragment?) {
        if (allowTransaction()) {
            val fm = supportFragmentManager
            if (fm.backStackEntryCount > 0 && getCurrentFragment() != null && getCurrentFragment()?.getFragmentTag().equals(
                    fragment?.getFragmentTag())) {
                val ft = fm.beginTransaction()
                if (fm.backStackEntryCount > 0) {
                    ft.hide(getCurrentFragment()!!)
                }
                val existFragment: BaseFragment? =
                    fm.findFragmentByTag(fragment?.getFragmentTag()) as BaseFragment?
                existFragment?.hideKeyboard()
                ft.show(existFragment!!)
                ft.commit()
                return
            }
            val ft = fm.beginTransaction()
            if (fm.backStackEntryCount > 0) {
                ft.hide(getCurrentFragment()!!)
            }
            ft.add(R.id.relativelayout_activity_base_fragment_container, fragment!!, fragment?.getFragmentTag())
            ft.addToBackStack(fragment?.getFragmentTag())
            ft.commit()
        }
    }

    open fun popBackStack() {
        if (allowTransaction()) {
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
        active = false
    }

    override fun onPause() {
        super.onPause()
        active = false
    }

    override fun onStop() {
        super.onStop()
        active = false
    }

    override fun onStart() {
        super.onStart()
        active = true
    }

    override fun onResume() {
        super.onResume()
        active = true
    }
}
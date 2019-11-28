package android.test.currencyassistant.pageobjects

import android.test.currencyassistant.CurrencyApplication
import android.test.currencyassistant.R
import android.test.currencyassistant.matchers.RecyclerViewMatcher
import android.test.currencyassistant.presentation.adapters.currency.CurrencyViewHolder
import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.uiautomator.Direction
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CurrencyFragmentPageObject{

    lateinit var currencyApplication: CurrencyApplication

    @Before
    fun prepare(){
        this.currencyApplication = CurrencyApplication()
    }

    @Test
    fun mainTest(){
        scrollDown()
        selectCurrency()
        scrollDown()
        changeCurrencyValue("123.0")
        scrollDown()
        scrollUp()
        changeCurrencyValue("0.0")
    }

    fun scrollDown(){
        currencyApplication.pageObject.getUiElement("recyclerview_fragment_currency").scroll(Direction.DOWN, 0.5f, 200)
    }

    fun scrollUp() {
        currencyApplication.pageObject.getUiElement("recyclerview_fragment_currency").scroll(Direction.UP, 0.4f, 200)
    }

    fun selectCurrency(){
        onView(withId(R.id.recyclerview_fragment_currency))
            .perform(RecyclerViewActions.actionOnItemAtPosition<CurrencyViewHolder>(3, clickOnViewChild(
                    R.id.edittext_item_currency_value)))
    }

    fun changeCurrencyValue(value: String){

        onView(withId(R.id.recyclerview_fragment_currency))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<CurrencyViewHolder>(3, switchText(
                    value, R.id.edittext_item_currency_value)))

        onView(withRecyclerView(R.id.recyclerview_fragment_currency).atPosition(0))
            .check(matches(hasDescendant(withText(value))))

    }

    fun withRecyclerView(recyclerViewId: Int): RecyclerViewMatcher {
        return RecyclerViewMatcher(recyclerViewId)
    }

    fun switchText(text: String, viewId: Int) = object : ViewAction {
        override fun getDescription() = "Switch text of a child view with specified id.";

        override fun getConstraints() = null

        override fun perform(uiController: UiController, view: View) {
            click().perform(uiController, view.findViewById<View>(viewId))
            replaceText(text).perform(uiController, view.findViewById<View>(viewId))
        }
    }

    fun clickOnViewChild(viewId: Int) = object : ViewAction {
        override fun getConstraints() = null

        override fun getDescription() = "Click on a child view with specified id."

        override fun perform(uiController: UiController, view: View) = click().perform(uiController, view.findViewById<View>(viewId))
    }
}
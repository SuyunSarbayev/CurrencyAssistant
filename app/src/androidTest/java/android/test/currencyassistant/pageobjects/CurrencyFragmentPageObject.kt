package android.test.currencyassistant.pageobjects

import android.R.id
import android.test.currencyassistant.R
import android.test.currencyassistant.TestApplication
import android.test.currencyassistant.presentation.adapters.currency.CurrencyViewHolder
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.Direction
import org.hamcrest.Matcher
import org.junit.Before
import org.junit.BeforeClass
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CurrencyFragmentPageObject{

    companion object{
        lateinit var testApplication: TestApplication

        @BeforeClass
        fun prepare(){
            this.testApplication = TestApplication()
        }
    }

    @Test
    fun scrollDown(){
        testApplication.pageObject.getUiElement("recyclerview_fragment_currency").scroll(Direction.DOWN, 0.5f, 200)
    }

    @Test
    fun scrollUp() {
        testApplication.pageObject.getUiElement("recyclerview_fragment_currency").scroll(Direction.UP, 0.4f, 200)
    }

    @Test
    fun selectCurrency(){
        scrollDown()
        onView(withId(R.id.recyclerview_fragment_currency))
            .perform(RecyclerViewActions.actionOnItemAtPosition<CurrencyViewHolder>(3, clickOnViewChild(
                    R.id.edittext_item_currency_value)))
    }

    @Test
    fun changeCurrencyValue(){
        scrollDown()

        onView(withId(R.id.recyclerview_fragment_currency))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<CurrencyViewHolder>(3, switchText(
                    "123.0", R.id.edittext_item_currency_value)))

        scrollDown()
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
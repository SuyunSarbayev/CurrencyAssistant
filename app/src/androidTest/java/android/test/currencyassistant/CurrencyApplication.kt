package android.test.currencyassistant

import android.content.Context
import android.content.Intent
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until

private const val LAUNCH_TIMEOUT = 5000L
private const val BASIC_PACKAGE = "android.test.currenyassistant"

open class CurrencyApplication {

    lateinit var device: UiDevice
    lateinit var pageObject: PageObject
    lateinit var context: Context
    lateinit var packageName: String
    var launchIntent: Intent? = null

    constructor(){
        device = initializeDevice()

        pressHome()

        waitForLauncher()

        packageName = initializePackage()

        context = initializeContext()

        pageObject = initializePageObject()

        launchIntent = initializeLaunchIntent()

        launchIntent()

        waitForApp()
    }

    fun initializeDevice() : UiDevice{
        return UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    }

    fun initializePackage() : String{
        return InstrumentationRegistry.getInstrumentation().targetContext.getPackageName();
    }

    fun initializeContext() : Context{
        return InstrumentationRegistry.getInstrumentation().getContext();
    }

    fun initializeLaunchIntent() : Intent? {
        return context.getPackageManager()
            .getLaunchIntentForPackage(packageName)?.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    }

    fun launchIntent(){
        context.startActivity(launchIntent);
    }

    fun waitForLauncher(){
        device.wait(
            Until.hasObject(By.pkg(device.launcherPackageName).depth(0)),
            LAUNCH_TIMEOUT
        )
    }

    fun waitForApp(){
        device.wait(
            Until.hasObject(By.pkg(BASIC_PACKAGE).depth(0)),
            LAUNCH_TIMEOUT
        )
    }

    fun initializePageObject() : PageObject{
        return PageObject(device, packageName)
    }

    fun pressHome(){
        device.pressHome()
    }
}
package android.test.currencyassistant

import androidx.test.uiautomator.*


open class PageObject {

    var device: UiDevice
    var packageName: String

    constructor(device: UiDevice, packageName: String){
        this.device = device
        this.packageName = packageName
    }

    fun getUiElement(resourceId: String) : UiObject2{
        return device.findObject(By.res(packageName, resourceId))
    }

    private fun getUiObject(selector: BySelector): UiObject2? {
        return device.wait(Until.findObject(selector), 10000)
    }
}
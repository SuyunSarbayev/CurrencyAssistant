package android.test.currencyassistant.presentation.interfaces

interface CurrencyValueUpdatedCallback {
    fun onCurrencyValueUpdated(position: Int, value: String)
}
package android.test.currencyassistant.presentation.base

interface BaseView {

    fun initializeViews()

    fun initializeViewsData()

    fun initializeListeners()

    fun displayLoader()

    fun dismissLoader()

    fun processError(withText: String)
}
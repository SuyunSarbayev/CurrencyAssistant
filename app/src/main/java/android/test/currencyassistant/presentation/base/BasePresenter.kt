package android.test.currencyassistant.presentation.base

interface BasePresenter<T> {
    fun attach(view: T)

    fun dispose()
}
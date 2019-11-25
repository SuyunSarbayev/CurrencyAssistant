package android.test.currencyassistant.presentation.utils

import android.test.currencyassistant.domain.models.Currency
import androidx.recyclerview.widget.DiffUtil

class UtilCallback(oldList: ArrayList<Currency.CurrencyItem>, newList : ArrayList<Currency.CurrencyItem>) : DiffUtil.Callback() {

    private var oldList: ArrayList<Currency.CurrencyItem>? = null
    private var newList: ArrayList<Currency.CurrencyItem>? = null

    init {
        this.oldList = oldList
        this.newList = newList
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList?.get(oldItemPosition)?.currencyName == newList?.get(newItemPosition)?.currencyName
    }

    override fun getOldListSize(): Int {
        return oldList!!.size
    }

    override fun getNewListSize(): Int {
        return newList!!.size
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldData: Currency.CurrencyItem = oldList!![oldItemPosition]
        val newData: Currency.CurrencyItem = newList!![newItemPosition]

        return oldData.currencyPrice == newData.currencyPrice
    }
}
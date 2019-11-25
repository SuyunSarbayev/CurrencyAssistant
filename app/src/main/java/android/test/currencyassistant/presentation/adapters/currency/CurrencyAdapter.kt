package android.test.currencyassistant.presentation.adapters.currency

import android.content.Context
import android.test.currencyassistant.R
import android.test.currencyassistant.domain.models.Currency
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CurrencyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {

    var currencyList: ArrayList<Currency.CurrencyItem> = ArrayList()

    var context: Context? = null

    constructor(context: Context?, currencyList: ArrayList<Currency.CurrencyItem>){
        this.context = context
        this.currencyList = currencyList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CurrencyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_currency, parent, false),
            context)
    }

    override fun getItemCount(): Int {
        return currencyList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as CurrencyViewHolder).bind(currencyList.get(position))
    }
}
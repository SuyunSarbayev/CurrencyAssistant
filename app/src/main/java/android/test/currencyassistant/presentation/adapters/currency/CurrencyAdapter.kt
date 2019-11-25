package android.test.currencyassistant.presentation.adapters.currency

import android.content.Context
import android.test.currencyassistant.R
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CurrencyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {

    var currencyList: ArrayList<Currency.CurrencyItem> = ArrayList()
    var currencyClickInterface: CurrencyClickInterface
    var context: Context? = null

    constructor(context: Context?,
                currencyList: ArrayList<Currency.CurrencyItem>,
                currencyClickInterface: CurrencyClickInterface){
        this.context = context
        this.currencyList = currencyList
        this.currencyClickInterface = currencyClickInterface
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CurrencyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_currency, parent, false),
            context, currencyClickInterface)
    }

    override fun getItemCount(): Int {
        return currencyList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as CurrencyViewHolder).bind(currencyList.get(position))
    }
}
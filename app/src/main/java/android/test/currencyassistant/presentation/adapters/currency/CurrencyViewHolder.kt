package android.test.currencyassistant.presentation.adapters.currency

import android.content.Context
import android.test.currencyassistant.R
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_currency.view.*
import kotlinx.android.synthetic.main.item_currency.*

class CurrencyViewHolder(itemView: View,
                         context: Context?,
                         currencyClickInterface: CurrencyClickInterface) : RecyclerView.ViewHolder(itemView),
View.OnClickListener{

    var context: Context? = null
    var currencyClickInterface: CurrencyClickInterface

    init {
        this.currencyClickInterface = currencyClickInterface
        this.context = context
    }

    fun bind(currencyItem: Currency.CurrencyItem){
        var icon: Int = R.drawable.ic_launcher_foreground

        itemView.imageview_item_currency_icon.setImageDrawable(null)

        when(currencyItem.currencyName){
            "EUR" -> {
                icon = R.drawable.ic_currency_flag_eu
                itemView.imageview_item_currency_icon.setImageDrawable(context?.resources?.getDrawable(icon))
            }
            "USD" -> {
                icon = R.drawable.ic_currency_flag_us
                itemView.imageview_item_currency_icon.setImageDrawable(context?.resources?.getDrawable(icon))
            }
            "CAD" -> {
                icon = R.drawable.ic_currency_flag_canada
                itemView.imageview_item_currency_icon.setImageDrawable(context?.resources?.getDrawable(icon))
            }
            "SEK" -> {
                icon = R.drawable.ic_currency_flag_sweden
                itemView.imageview_item_currency_icon.setImageDrawable(context?.resources?.getDrawable(icon))
            }
        }

        itemView.textview_item_currency_title.text = currencyItem.currencyName
        itemView.edittext_item_currency_value.setText(currencyItem.currencyPrice.toString())

        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        currencyClickInterface.onViewClicked(adapterPosition)
    }


}
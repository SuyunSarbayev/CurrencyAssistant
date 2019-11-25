package android.test.currencyassistant.presentation.adapters.currency

import android.content.Context
import android.test.currencyassistant.R
import android.test.currencyassistant.domain.models.Currency
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_currency.view.*
import kotlinx.android.synthetic.main.item_currency.*

class CurrencyViewHolder(itemView: View, context: Context?) : RecyclerView.ViewHolder(itemView) {

    fun bind(currencyItem: Currency.CurrencyItem){
        var icon: Int = 0

        when(currencyItem.currencyName){
            "EUR" -> icon = R.drawable.ic_currency_flag_eu
            "USD" -> icon = R.drawable.ic_currency_flag_us
            "CAD" -> icon = R.drawable.ic_currency_flag_canada
            "SEK" -> icon = R.drawable.ic_currency_flag_sweden
        }

        Picasso.get()
            .load(icon)
            .error(R.drawable.ic_launcher_background)
            .into(itemView.imageview_item_currency_icon)

        itemView.textview_item_currency_title.text = currencyItem.currencyName
        itemView.edittext_item_currency_value.setText(currencyItem.currencyPrice.toString())
    }
}
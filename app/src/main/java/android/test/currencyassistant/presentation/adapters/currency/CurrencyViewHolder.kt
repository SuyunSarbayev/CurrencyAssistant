package android.test.currencyassistant.presentation.adapters.currency

import android.content.Context
import android.test.currencyassistant.R
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface
import android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback
import android.test.currencyassistant.presentation.utils.AnimationHelper
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_currency.view.*
import kotlinx.android.synthetic.main.item_currency.*

class CurrencyViewHolder(itemView: View,
                         context: Context?,
                         currencyClickInterface: CurrencyClickInterface,
                         currencyValueUpdatedCallback: CurrencyValueUpdatedCallback) :
    RecyclerView.ViewHolder(itemView),
    View.OnClickListener,
    View.OnFocusChangeListener,
    TextWatcher{

    var context: Context? = null
    var currencyClickInterface: CurrencyClickInterface
    var currencyValueUpdatedCallback: CurrencyValueUpdatedCallback
    var picasso: Picasso

    init {
        this.currencyClickInterface = currencyClickInterface
        this.context = context
        this.currencyValueUpdatedCallback = currencyValueUpdatedCallback
        this.picasso = Picasso.get()
    }

    fun bind(currencyItem: Currency.CurrencyItem){
        initializeIcon(currencyItem)

        initializeData(currencyItem)

        initializeListeners()
    }

    fun initializeData(currencyItem: Currency.CurrencyItem){
        itemView.textview_item_currency_title.text = currencyItem.currencyName
        itemView.edittext_item_currency_value.setText(currencyItem.currencyPrice.toString())
    }

    fun initializeIcon(currencyItem: Currency.CurrencyItem){
        //itemView.imageview_item_currency_icon.setImageResource(currencyItem.currencyIcon!!)
    }

    fun initializeListeners(){
        itemView.edittext_item_currency_value.addTextChangedListener(this)
        itemView.edittext_item_currency_value.setOnFocusChangeListener(this)
        itemView.setOnClickListener(this)
    }

    fun initiateFocus(){
        itemView.edittext_item_currency_value.requestFocus()
        itemView.edittext_item_currency_value.setSelection(itemView.edittext_item_currency_value.length())
    }

    override fun onClick(v: View?) {
        currencyClickInterface.onViewClicked(adapterPosition)
    }

    override fun onFocusChange(v: View?, hasFocus: Boolean) {
        when(hasFocus) {true -> currencyClickInterface.onViewClicked(adapterPosition)}
    }

    override fun afterTextChanged(s: Editable?) {
        when(adapterPosition == 0) {
            true -> currencyValueUpdatedCallback.onCurrencyValueUpdated(adapterPosition, s.toString())
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
}
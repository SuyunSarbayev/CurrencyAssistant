package android.test.currencyassistant.presentation.adapters.currency

import android.content.Context
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface
import android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_currency.view.*
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*


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

    var decimalFormat: DecimalFormat = DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).apply {
        maximumFractionDigits = 340
    }

    init {
        this.currencyClickInterface = currencyClickInterface
        this.context = context
        this.currencyValueUpdatedCallback = currencyValueUpdatedCallback
        this.picasso = Picasso.get()

        initializeCurrencyField()
    }

    fun bind(currencyItem: Currency.CurrencyItem){
        initializeIcon(currencyItem)

        initializeData(currencyItem)

        initializeListeners()
    }

    fun initializeData(currencyItem: Currency.CurrencyItem){
        itemView.textview_item_currency_title.text = currencyItem.currencyName
        itemView.edittext_item_currency_value.setText(decimalFormat.format(currencyItem.currencyPrice).toString())
    }

    fun initializeIcon(currencyItem: Currency.CurrencyItem){
        itemView.imageview_item_currency_icon.setImageResource(currencyItem.currencyIcon!!)
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

    fun initializeCurrencyField(){
        itemView.edittext_item_currency_value.setImeOptions(EditorInfo.IME_ACTION_DONE)
        itemView.edittext_item_currency_value.setFocusable(true)
        itemView.edittext_item_currency_value.setFocusableInTouchMode(true)
    }

    override fun onClick(v: View?) {
        currencyClickInterface.onViewClicked(adapterPosition)
    }

    override fun onFocusChange(v: View?, hasFocus: Boolean) {
        when(hasFocus) {
            true -> {
                openKeyboard(v)
                currencyClickInterface.onViewClicked(adapterPosition)
            }
        }
    }

    fun openKeyboard(view: View?){
        val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
    }

    override fun afterTextChanged(s: Editable?) {
        when(adapterPosition == 0) {
            true -> currencyValueUpdatedCallback.onCurrencyValueUpdated(adapterPosition, s.toString())
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
}
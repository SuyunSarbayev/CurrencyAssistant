package android.test.currencyassistant.data.repositories

import android.test.currencyassistant.R
import android.test.currencyassistant.data.models.CurrencyEntity
import android.test.currencyassistant.domain.models.Currency
import com.google.gson.Gson
import javax.inject.Inject

class CurrencyMapper {

    var gson: Gson

    @Inject
    constructor(gson: Gson){
        this.gson = gson
    }

    fun transformCurrency(currencyEntity: CurrencyEntity?): Currency{
        for(key in currencyEntity?.rates?.keys!!){
            var currencyItem: CurrencyEntity.CurrencyItem = CurrencyEntity().CurrencyItem().apply {
                currencyName = key
                currencyPrice = currencyEntity.rates?.get(key) as Double
                currencyIcon = R.drawable.ic_currency_flag_default
                when(key){
                    "EUR" -> currencyIcon = R.drawable.ic_currency_flag_eu
                    "USD" -> currencyIcon = R.drawable.ic_currency_flag_us
                    "CAD" -> currencyIcon = R.drawable.ic_currency_flag_canada
                    "SEK" -> currencyIcon = R.drawable.ic_currency_flag_sweden
                }
            }
            currencyEntity.currencyList.add(currencyItem)
        }
        var currencyModel: Currency = (gson.fromJson(gson.toJson(currencyEntity), Currency::class.java) as Currency)
        return currencyModel
    }
}
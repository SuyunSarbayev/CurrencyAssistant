package android.test.currencyassistant.data.repositories

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
            currencyEntity.currencyList.add(CurrencyEntity().CurrencyItem().apply {
                currencyName = key
                currencyPrice = currencyEntity.rates?.get(key) as Double
            })
        }
        var currencyModel: Currency = (gson.fromJson(gson.toJson(currencyEntity), Currency::class.java) as Currency)
        return currencyModel
    }
}
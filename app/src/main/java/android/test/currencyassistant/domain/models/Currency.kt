package android.test.currencyassistant.domain.models

import com.google.gson.annotations.SerializedName

class Currency {
    @SerializedName("base")
    var base: String? = null

    @SerializedName("date")
    var date: String? = null

    @SerializedName("rates")
    var rates: HashMap<String, Any>? = HashMap()

    @SerializedName("currency_list")
    var currencyList: ArrayList<CurrencyItem> = ArrayList()


    inner class CurrencyItem{

        constructor()

        @SerializedName("currency_name")
        var currencyName: String? = null

        @SerializedName("currency_price")
        var currencyPrice: Double? = null
        override fun toString(): String {
            return "Currency(currencyName=$currencyName, currencyPrice=$currencyPrice)"
        }


    }

    override fun toString(): String {
        return "CurrencyEntity(base=$base, date=$date, rates=$rates, currencyList=$currencyList)"
    }
}
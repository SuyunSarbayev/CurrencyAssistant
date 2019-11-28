package android.test.currencyassistant.data.models

import com.google.gson.annotations.SerializedName

class CurrencyEntity {

    @SerializedName("base")
    var base: String? = null

    @SerializedName("date")
    var date: String? = null

    @SerializedName("rates")
    var rates: HashMap<String,Any>? = HashMap()

    @SerializedName("currency_list")
    var currencyList: ArrayList<CurrencyItem> = ArrayList()


    inner class CurrencyItem{

        constructor()

        @SerializedName("currency_name")
        var currencyName: String? = null

        @SerializedName("currency_price")
        var currencyPrice: Double? = null

        @SerializedName("currency_icon")
        var currencyIcon: Int? = null

        override fun toString(): String {
            return "CurrencyItem(currencyName=$currencyName, currencyPrice=$currencyPrice, currencyIcon=$currencyIcon)"
        }


    }

    override fun toString(): String {
        return "CurrencyEntity(currencyList=$currencyList)"
    }
}
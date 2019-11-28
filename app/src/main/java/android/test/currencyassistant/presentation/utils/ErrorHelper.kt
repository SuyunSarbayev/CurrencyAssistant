package android.test.currencyassistant.presentation.utils

import android.content.Context
import android.test.currencyassistant.R
import android.test.currencyassistant.data.NetworkException
import android.test.currencyassistant.data.models.APIErrorEntity
import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import org.json.JSONException
import org.json.JSONObject
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.inject.Inject

class ErrorHelper {

    var errorText: String = ""

    @Inject
    constructor()

    fun getApiError(jsonObject: JSONObject) : APIErrorEntity{
        var jsonParser: JsonParser = JsonParser()
        val jsonElement: JsonElement = jsonParser.parse(jsonObject.toString())
        val gson = Gson()

        return gson.fromJson(jsonElement, APIErrorEntity::class.java)
    }

    @Throws(JSONException::class)
    fun processError(e: Throwable, context: Context): String? {
        try {
            if (e is NetworkException) {
                val error = JSONObject((e as NetworkException).errorBody())
                val apiError: APIErrorEntity = getApiError(error)
                if (apiError.error!!.length > 0) {
                    errorText = apiError.error!!
                } else if (e.response.code() == 500) {
                    errorText = context.getString(R.string.server_error_constant)
                } else if (e.response.code() == 404) {
                    errorText = context.getString(R.string.page_not_found_error_constant)
                }
            } else if (e is SocketTimeoutException) {
                errorText = context.getString(R.string.network_error_constant)
            } else if (e is UnknownHostException) {
                errorText = context.getString(R.string.network_error_constant)
            }
        } catch (jsonException: JSONException) {
        }
        return errorText
    }
}
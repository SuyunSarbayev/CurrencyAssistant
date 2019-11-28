package android.test.currencyassistant.data

import retrofit2.HttpException
import retrofit2.Response

class NetworkException : HttpException{

    var response: Response<*>

    constructor(response : Response<*>) : super(response){
        this.response = response
    }

    fun errorBody() : String?{
        return response.errorBody()?.string()
    }
}
package android.test.currencyassistant.domain.usecases

import android.test.currencyassistant.domain.BaseUseCase
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.domain.repository.CurrencyDomainRepository
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Named

class CurrencyListUseCases : BaseUseCase<Currency> {

    var currencyDomainRepository: CurrencyDomainRepository
    var params: HashMap<String, Any> = HashMap()
    @Inject
    constructor(@Named("executor_thread") executorThread: Scheduler,
                @Named("ui_thread") uiThread: Scheduler,
                currencyDomainRepository: CurrencyDomainRepository) : super(executorThread, uiThread){
        this.currencyDomainRepository = currencyDomainRepository
    }

    fun initializeParams(params: HashMap<String, Any>){
        this.params = params
    }

    override fun createObservable(): Single<Currency> {
        return currencyDomainRepository.currencyList(params)
    }
}
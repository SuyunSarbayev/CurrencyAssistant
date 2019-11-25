package android.test.currencyassistant.domain

import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.observers.DisposableSingleObserver

abstract class BaseUseCase<T> {

    var compositeDisposableObserver: CompositeDisposable
    var executorThread: Scheduler
    var uiThread: Scheduler

    constructor(executorThread: Scheduler, uiThread: Scheduler){
        this.executorThread = executorThread
        this.uiThread = uiThread
        compositeDisposableObserver = CompositeDisposable()
    }

    fun execute(disposableObserver: DisposableSingleObserver<T>){
        var observable: Single<T> = createObservable()
            .subscribeOn(executorThread)
            .observeOn(uiThread)

        compositeDisposableObserver.add(observable.subscribeWith(disposableObserver))
    }


    fun dispose(){
        if(!compositeDisposableObserver.isDisposed) compositeDisposableObserver.dispose()
    }

    fun clear(){
        compositeDisposableObserver.clear()
    }

    abstract fun createObservable() : Single<T>
}
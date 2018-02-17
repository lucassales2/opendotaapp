package lucassales2.com.github.opendotaapp.util

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

/**
 * Simple ViewModel which exposes a CompositeDisposable which is automatically cleared when
 * the ViewModel is cleared.
 */
open class RxViewModel : ViewModel() {

    val disposables = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }
}
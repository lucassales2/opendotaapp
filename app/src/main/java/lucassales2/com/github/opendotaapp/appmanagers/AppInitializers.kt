package lucassales2.com.github.opendotaapp.appmanagers

import android.app.Application
import com.gabrielittner.threetenbp.LazyThreeTen
import com.squareup.leakcanary.LeakCanary
import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.plusAssign
import lucassales2.com.github.base.util.AppRxSchedulers
import lucassales2.com.github.opendotaapp.BuildConfig
import timber.log.Timber
import javax.inject.Inject

class AppInitializers(private vararg val initializers: AppInitializer) : AppInitializer {
    override fun init(application: Application) {
        initializers.forEach {
            it.init(application)
        }
    }
}

class ThreeTenBpInitializer @Inject constructor(private val schedulers: AppRxSchedulers) : AppInitializer {
    private val disposables = CompositeDisposable()

    override fun init(application: Application) {
        // Init LazyThreeTen
        LazyThreeTen.init(application)

        // ...and cache it's timezones on a background thread
        disposables += Completable.fromCallable { LazyThreeTen.cacheZones() }
                .subscribeOn(schedulers.disk)
                .subscribe({
                    // Ignore, nothing to do here!
                }, {
                    // This should never happen so lets throw the exception
                    Timber.e(it)
                    throw it
                })
    }
}

class LeakCanaryInitializer @Inject constructor() : AppInitializer {
    override fun init(application: Application) {
        if (!LeakCanary.isInAnalyzerProcess(application)) {
            LeakCanary.install(application)
        }
    }
}

class TimberInitializer @Inject constructor() : AppInitializer {
    override fun init(application: Application) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
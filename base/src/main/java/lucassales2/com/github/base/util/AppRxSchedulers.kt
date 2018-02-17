package lucassales2.com.github.base.util

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

data class AppRxSchedulers(
        val database: Scheduler = Schedulers.single(),
        val disk: Scheduler = Schedulers.io(),
        val network: Scheduler = Schedulers.io(),
        val main: Scheduler = AndroidSchedulers.mainThread())
package lucassales2.com.github.opendotaapp.inject

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import lucassales2.com.github.base.AppNavigator
import lucassales2.com.github.base.util.AppRxSchedulers
import lucassales2.com.github.opendotaapp.OpenDotaAppNavigator
import lucassales2.com.github.opendotaapp.OpenDotaApplication
import lucassales2.com.github.opendotaapp.appmanagers.AppInitializers
import lucassales2.com.github.opendotaapp.appmanagers.LeakCanaryInitializer
import lucassales2.com.github.opendotaapp.appmanagers.ThreeTenBpInitializer
import lucassales2.com.github.opendotaapp.appmanagers.TimberInitializer
import java.io.File
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    fun provideContext(application: OpenDotaApplication): Context {
        return application.applicationContext
    }

    @Singleton
    @Provides
    fun provideRxSchedulers(): AppRxSchedulers {
        return AppRxSchedulers()
    }

    @Named("app")
    @Provides
    @Singleton
    fun provideAppPreferences(application: OpenDotaApplication): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides
    fun provideAppManagers(
            leakCanaryManager: LeakCanaryInitializer,
            timberManager: TimberInitializer,
            threeTenManager: ThreeTenBpInitializer): AppInitializers {
        return AppInitializers(leakCanaryManager, timberManager, threeTenManager)
    }

    @Provides
    @Singleton
    @Named("app")
    fun provideAppNavigator(context: Context): AppNavigator {
        return OpenDotaAppNavigator(context)
    }
}
package lucassales2.com.github.opendotaapp.inject

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import lucassales2.com.github.data.DatabaseModule
import lucassales2.com.github.opendotaapp.OpenDotaApplication
import lucassales2.com.github.opendotaapp.home.HomeBuilder

import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    DatabaseModule::class,
    ViewModelBuilder::class,
    HomeBuilder::class,
    NetworkModule::class
])
interface AppComponent : AndroidInjector<OpenDotaApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<OpenDotaApplication>()
}
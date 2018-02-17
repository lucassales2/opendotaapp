package lucassales2.com.github.opendotaapp.inject

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import lucassales2.com.github.opendotaapp.inject.OpenDotaViewModelFactory

@Module
internal abstract class ViewModelBuilder {
    @Binds
    internal abstract fun bindViewModelFactory(factory: OpenDotaViewModelFactory): ViewModelProvider.Factory
}
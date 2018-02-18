package lucassales2.com.github.core

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import lucassales2.com.github.core.api.MatchApiService
import lucassales2.com.github.core.api.PlayerApiService
import lucassales2.com.github.core.api.SearchApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    fun provideOkhttp(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

    @Provides
    fun provideGson(): Gson =
            GsonBuilder().create()


    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://api.opendota.com/api/")
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
    }

    @Singleton
    @Provides
    fun provideMatchApiService(retrofit: Retrofit): MatchApiService =
            retrofit.create(MatchApiService::class.java)

    @Singleton
    @Provides
    fun providePlayerApiService(retrofit: Retrofit): PlayerApiService =
            retrofit.create(PlayerApiService::class.java)

    @Singleton
    @Provides
    fun provideSearchApiService(retrofit: Retrofit): SearchApiService =
            retrofit.create(SearchApiService::class.java)


}
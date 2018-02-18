package lucassales2.com.github.data

import android.arch.persistence.room.Room
import android.content.Context
import android.os.Debug
import dagger.Module
import dagger.Provides
import lucassales2.com.github.data.dao.MatchDao
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(context: Context): OpenDotaDatabase {
        val builder = Room.databaseBuilder(context, OpenDotaDatabase::class.java, "opendota.db")
                .fallbackToDestructiveMigration()
        if (Debug.isDebuggerConnected()) {
            builder.allowMainThreadQueries()
        }
        return builder.build()
    }

    @Singleton
    @Provides
    fun provideDatabaseTransactionRunner(db: OpenDotaDatabase): DatabaseTxRunner = DatabaseTxRunner(db)

    @Provides
    fun provideMatchDao(openDotaDatabase: OpenDotaDatabase): MatchDao =
            openDotaDatabase.matchDao()
}
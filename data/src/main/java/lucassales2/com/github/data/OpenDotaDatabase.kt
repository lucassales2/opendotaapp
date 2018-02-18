package lucassales2.com.github.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import lucassales2.com.github.data.dao.MatchDao
import lucassales2.com.github.data.entities.Match

@Database(entities = [
    Match::class
],
        version = 1)
@TypeConverters(RoomTypeConverters::class)
abstract class OpenDotaDatabase : RoomDatabase() {
    abstract fun matchDao(): MatchDao

}
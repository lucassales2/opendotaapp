package lucassales2.com.github.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import io.reactivex.Flowable
import io.reactivex.Maybe
import lucassales2.com.github.data.entities.Match

@Dao
interface MatchDao {
    @Query("SELECT * FROM matches WHERE id =:id")
    fun getById(id: Long): Maybe<Match>

    @Query("SELECT * FROM matches")
    fun getAll(): Flowable<List<Match>>

    @Insert
    fun insertAll(list: List<Match>)

}
package lucassales2.com.github.data.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "matches")
data class Match(
        @PrimaryKey @ColumnInfo(name = "id") val id: Long,
        @ColumnInfo(name = "last_hits") val lastHits: Int,
        @ColumnInfo(name = "hero_healing") val heroHealing: Int,
        @ColumnInfo(name = "tower_damage") val towerDamage: Int,
        @ColumnInfo(name = "hero_damage") val heroDamage: Int,
        @ColumnInfo(name = "gold_per_min") val goldPerMin: Int,
        @ColumnInfo(name = "xp_per_min") val xpPerMin: Int,
        @ColumnInfo(name = "skill") val skill: Int,
        @ColumnInfo(name = "player_slot") val playerSlot: Int,
        @ColumnInfo(name = "radiant_win") val radiantWin: Boolean,
        @ColumnInfo(name = "duration") val duration: Int,
        @ColumnInfo(name = "game_mode") val gameMode: Int,
        @ColumnInfo(name = "lobby_type") val lobbyType: Int,
        @ColumnInfo(name = "hero_id") val heroId: Int,
        @ColumnInfo(name = "start_time") val startTime: Int,
        @ColumnInfo(name = "version") val version: Int,
        @ColumnInfo(name = "kills") val kills: Int,
        @ColumnInfo(name = "deaths") val deaths: Int,
        @ColumnInfo(name = "assists") val assists: Int
)
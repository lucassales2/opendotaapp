package lucassales2.com.github.core.model.dto.match

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Lucas Sales on 26/04/2017.
 */

data class MatchDto(
        @SerializedName("match_id")
        @Expose
        val matchId: Long? = null,
        @SerializedName("player_slot")
        @Expose
        val playerSlot: Int? = null,
        @SerializedName("radiant_win")
        @Expose
        val radiantWin: Boolean? = null,
        @SerializedName("duration")
        @Expose
        val duration: Int? = null,
        @SerializedName("game_mode")
        @Expose
        val gameMode: Int? = null,
        @SerializedName("lobby_type")
        @Expose
        val lobbyType: Int? = null,
        @SerializedName("hero_id")
        @Expose
        val heroId: Int? = null,
        @SerializedName("start_time")
        @Expose
        val startTime: Int? = null,
        @SerializedName("version")
        @Expose
        val version: Int? = null,
        @SerializedName("kills")
        @Expose
        val kills: Int? = null,
        @SerializedName("deaths")
        @Expose
        val deaths: Int? = null,
        @SerializedName("assists")
        @Expose
        val assists: Int? = null,
        @SerializedName("skill")
        @Expose
        val skill: Int? = null,
        @SerializedName("xp_per_min")
        @Expose
        val xpPerMin: Int? = null,
        @SerializedName("gold_per_min")
        @Expose
        val goldPerMin: Int? = null,
        @SerializedName("hero_damage")
        @Expose
        val heroDamage: Int? = null,
        @SerializedName("tower_damage")
        @Expose
        val towerDamage: Int? = null,
        @SerializedName("hero_healing")
        @Expose
        val heroHealing: Int? = null,
        @SerializedName("last_hits")
        @Expose
        val lastHits: Int? = null)
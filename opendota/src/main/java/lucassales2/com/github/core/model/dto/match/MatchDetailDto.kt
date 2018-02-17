package lucassales2.com.github.core.model.dto.match

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MatchDetailDto(
        @SerializedName("match_id")
        @Expose
        val matchId: Long? = null,
        @SerializedName("barracks_status_dire")
        @Expose
        val barracksStatusDire: Int? = null,
        @SerializedName("barracks_status_radiant")
        @Expose
        val barracksStatusRadiant: Int? = null,
        @SerializedName("chat")
        @Expose
        val chat: List<Chat>? = null,
        @SerializedName("cluster")
        @Expose
        val cluster: Int? = null,
        @SerializedName("cosmetics")
        @Expose
        val cosmetics: Map<Int, Int>? = null,
        @SerializedName("dire_score")
        @Expose
        val direScore: Int? = null,
        @SerializedName("duration")
        @Expose
        val duration: Int? = null,
        @SerializedName("engine")
        @Expose
        val engine: Int? = null,
        @SerializedName("first_blood_time")
        @Expose
        val firstBloodTime: Int? = null,
        @SerializedName("game_mode")
        @Expose
        val gameMode: Int? = null,
        @SerializedName("human_players")
        @Expose
        val humanPlayers: Int? = null,
        @SerializedName("leagueid")
        @Expose
        val leagueid: Int? = null,
        @SerializedName("lobby_type")
        @Expose
        val lobbyType: Int? = null,
        @SerializedName("match_seq_num")
        @Expose
        val matchSeqNum: Long? = null,
        @SerializedName("negative_votes")
        @Expose
        val negativeVotes: Int? = null,
        @SerializedName("objectives")
        @Expose
        val objectives: List<Objectives>? = null,
        @SerializedName("picks_bans")
        @Expose
        val picksBans: List<PicksBans>? = null,
        @SerializedName("positive_votes")
        @Expose
        val positiveVotes: Int? = null,
        @SerializedName("radiant_gold_adv")
        @Expose
        val radiantGoldAdv: List<Int>? = null,
        @SerializedName("radiant_score")
        @Expose
        val radiantScore: Int? = null,
        @SerializedName("radiant_win")
        @Expose
        val radiantWin: Boolean? = null,
        @SerializedName("radiant_xp_adv")
        @Expose
        val radiantXpAdv: List<Int>? = null,
        @SerializedName("start_time")
        @Expose
        val startTime: Int? = null,
        @SerializedName("teamfights")
        @Expose
        val teamfights: List<Teamfights>? = null,
        @SerializedName("tower_status_dire")
        @Expose
        val towerStatusDire: Int? = null,
        @SerializedName("tower_status_radiant")
        @Expose
        val towerStatusRadiant: Int? = null,
        @SerializedName("version")
        @Expose
        val version: Int? = null,
        @SerializedName("replay_salt")
        @Expose
        val replaySalt: Int? = null,
        @SerializedName("series_id")
        @Expose
        val seriesId: Int? = null,
        @SerializedName("series_type")
        @Expose
        val seriesType: Int? = null,
        @SerializedName("radiant_team")
        @Expose
        val radiantTeam: Team? = null,
        @SerializedName("dire_team")
        @Expose
        val direTeam: Team? = null,
        @SerializedName("league")
        @Expose
        val league: League? = null,
        @SerializedName("skill")
        @Expose
        val skill: Int? = null,
        @SerializedName("players")
        @Expose
        val players: List<Player>? = null,
        @SerializedName("patch")
        @Expose
        val patch: Int? = null,
        @SerializedName("region")
        @Expose
        val region: Int? = null,
        @SerializedName("all_word_counts")
        @Expose
        val allWordCounts: Map<String, Int>? = null,
        @SerializedName("my_word_counts")
        @Expose
        val myWordCounts: MyWordCounts? = null,
        @SerializedName("throw")
        @Expose
        val _throw: Int? = null,
        @SerializedName("loss")
        @Expose
        val loss: Int? = null,
        @SerializedName("replay_url")
        @Expose
        val replayUrl: String? = null

)
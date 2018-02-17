package lucassales2.com.github.core.model.dto.match

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Player (

    @SerializedName("match_id")
    @Expose
    val matchId: Long? = null,
    @SerializedName("player_slot")
    @Expose
    val playerSlot: Int? = null,
    @SerializedName("ability_upgrades_arr")
    @Expose
    val abilityUpgradesArr: List<Int>? = null,
    @SerializedName("ability_uses")
    @Expose
    val abilityUses: Map<String, Int>? = null,
    @SerializedName("account_id")
    @Expose
    val accountId: Long? = null,
    @SerializedName("actions")
    @Expose
    val actions: Map<Int, Int>? = null,
    @SerializedName("additional_units")
    @Expose
    val additionalUnits: AdditionalUnits? = null,
    @SerializedName("assists")
    @Expose
    val assists: Int? = null,
    @SerializedName("backpack_0")
    @Expose
    val backpack0: Int? = null,
    @SerializedName("backpack_1")
    @Expose
    val backpack1: Int? = null,
    @SerializedName("backpack_2")
    @Expose
    val backpack2: Int? = null,
    @SerializedName("buyback_log")
    @Expose
    val buybackLog: List<BuyBackLog>? = null,
    @SerializedName("camps_stacked")
    @Expose
    val campsStacked: Int? = null,
    @SerializedName("creeps_stacked")
    @Expose
    val creepsStacked: Int? = null,
    @SerializedName("damage")
    @Expose
    val damage: Map<String, Int>? = null,
    @SerializedName("damage_inflictor")
    @Expose
    val damageInflictor: Map<String, Int>? = null,
    @SerializedName("damage_inflictor_received")
    @Expose
    val damageInflictorReceived: Map<String, Int>? = null,
    @SerializedName("damage_taken")
    @Expose
    val damageTaken: Map<String, Int>? = null,
    @SerializedName("deaths")
    @Expose
    val deaths: Int? = null,
    @SerializedName("denies")
    @Expose
    val denies: Int? = null,
    @SerializedName("dn_t")
    @Expose
    val dnT: List<Any>? = null,
    @SerializedName("gold")
    @Expose
    val gold: Int? = null,
    @SerializedName("gold_per_min")
    @Expose
    val goldPerMin: Int? = null,
    @SerializedName("gold_reasons")
    @Expose
    val goldReasons: GoldReasons? = null,
    @SerializedName("gold_spent")
    @Expose
    val goldSpent: Int? = null,
    @SerializedName("gold_t")
    @Expose
    val goldT: List<Any>? = null,
    @SerializedName("hero_damage")
    @Expose
    val heroDamage: Int? = null,
    @SerializedName("hero_healing")
    @Expose
    val heroHealing: Int? = null,
    @SerializedName("hero_hits")
    @Expose
    val heroHits: HeroHits? = null,
    @SerializedName("hero_id")
    @Expose
    val heroId: Int? = null,
    @SerializedName("item_0")
    @Expose
    val item0: Int? = null,
    @SerializedName("item_1")
    @Expose
    val item1: Int? = null,
    @SerializedName("item_2")
    @Expose
    val item2: Int? = null,
    @SerializedName("item_3")
    @Expose
    val item3: Int? = null,
    @SerializedName("item_4")
    @Expose
    val item4: Int? = null,
    @SerializedName("item_5")
    @Expose
    val item5: Int? = null,
    @SerializedName("item_uses")
    @Expose
    val itemUses: ItemUses? = null,
    @SerializedName("kill_streaks")
    @Expose
    val killStreaks: KillStreaks? = null,
    @SerializedName("killed")
    @Expose
    val killed: Map<String, Int>? = null,
    @SerializedName("killed_by")
    @Expose
    val killedBy: Map<String, Int>? = null,
    @SerializedName("kills")
    @Expose
    val kills: Int? = null,
    @SerializedName("kills_log")
    @Expose
    val killsLog: List<KillLog>? = null,
    @SerializedName("lane_pos")
    @Expose
    val lanePos: Map<Int, Map<Int, Int>>? = null,
    @SerializedName("last_hits")
    @Expose
    val lastHits: Int? = null,
    @SerializedName("leaver_status")
    @Expose
    val leaverStatus: Int? = null,
    @SerializedName("level")
    @Expose
    val level: Int? = null,
    @SerializedName("lh_t")
    @Expose
    val lhT: List<Any>? = null,
    @SerializedName("life_state")
    @Expose
    val lifeState: LifeState? = null,
    @SerializedName("max_hero_hit")
    @Expose
    val maxHeroHit: MaxHeroHit? = null,
    @SerializedName("multi_kills")
    @Expose
    val multiKills: MultiKills? = null,
    @SerializedName("obs")
    @Expose
    val obs: Obs? = null,
    @SerializedName("obs_left_log")
    @Expose
    val obsLeftLog: List<Any>? = null,
    @SerializedName("obs_log")
    @Expose
    val obsLog: List<Any>? = null,
    @SerializedName("obs_placed")
    @Expose
    val obsPlaced: Int? = null,
    @SerializedName("party_id")
    @Expose
    val partyId: Int? = null,
    @SerializedName("permanent_buffs")
    @Expose
    val permanentBuffs: List<Any>? = null,
    @SerializedName("pings")
    @Expose
    val pings: Int? = null,
    @SerializedName("purchase")
    @Expose
    val purchase: Purchase? = null,
    @SerializedName("purchase_log")
    @Expose
    val purchaseLog: List<Any>? = null,
    @SerializedName("rune_pickups")
    @Expose
    val runePickups: Int? = null,
    @SerializedName("runes")
    @Expose
    val runes: Runes? = null,
    @SerializedName("runes_log")
    @Expose
    val runesLog: List<Any>? = null,
    @SerializedName("sen")
    @Expose
    val sen: Sen? = null,
    @SerializedName("sen_left_log")
    @Expose
    val senLeftLog: List<Any>? = null,
    @SerializedName("sen_log")
    @Expose
    val senLog: List<Any>? = null,
    @SerializedName("sen_placed")
    @Expose
    val senPlaced: Int? = null,
    @SerializedName("stuns")
    @Expose
    val stuns: Double? = null,
    @SerializedName("times")
    @Expose
    val times: List<Any>? = null,
    @SerializedName("tower_damage")
    @Expose
    val towerDamage: Int? = null,
    @SerializedName("xp_per_min")
    @Expose
    val xpPerMin: Int? = null,
    @SerializedName("xp_reasons")
    @Expose
    val xpReasons: XpReasons? = null,
    @SerializedName("xp_t")
    @Expose
    val xpT: List<Any>? = null,
    @SerializedName("personaname")
    @Expose
    val personaname: String? = null,
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("last_login")
    @Expose
    val lastLogin: String? = null,
    @SerializedName("radiant_win")
    @Expose
    val radiantWin: Boolean? = null,
    @SerializedName("start_time")
    @Expose
    val startTime: Int? = null,
    @SerializedName("duration")
    @Expose
    val duration: Int? = null,
    @SerializedName("cluster")
    @Expose
    val cluster: Int? = null,
    @SerializedName("lobby_type")
    @Expose
    val lobbyType: Int? = null,
    @SerializedName("game_mode")
    @Expose
    val gameMode: Int? = null,
    @SerializedName("patch")
    @Expose
    val patch: Int? = null,
    @SerializedName("region")
    @Expose
    val region: Int? = null,
    @SerializedName("isRadiant")
    @Expose
    val radiant: Boolean? = null,
    @SerializedName("win")
    @Expose
    val win: Int? = null,
    @SerializedName("lose")
    @Expose
    val lose: Int? = null,
    @SerializedName("total_gold")
    @Expose
    val totalGold: Int? = null,
    @SerializedName("total_xp")
    @Expose
    val totalXp: Int? = null,
    @SerializedName("kills_per_min")
    @Expose
    val killsPerMin: Double? = null,
    @SerializedName("kda")
    @Expose
    val kda: Int? = null,
    @SerializedName("abandons")
    @Expose
    val abandons: Int? = null,
    @SerializedName("neutral_kills")
    @Expose
    val neutralKills: Int? = null,
    @SerializedName("tower_kills")
    @Expose
    val towerKills: Int? = null,
    @SerializedName("courier_kills")
    @Expose
    val courierKills: Int? = null,
    @SerializedName("lane_kills")
    @Expose
    val laneKills: Int? = null,
    @SerializedName("hero_kills")
    @Expose
    val heroKills: Int? = null,
    @SerializedName("observer_kills")
    @Expose
    val observerKills: Int? = null,
    @SerializedName("sentry_kills")
    @Expose
    val sentryKills: Int? = null,
    @SerializedName("roshan_kills")
    @Expose
    val roshanKills: Int? = null,
    @SerializedName("necronomicon_kills")
    @Expose
    val necronomiconKills: Int? = null,
    @SerializedName("ancient_kills")
    @Expose
    val ancientKills: Int? = null,
    @SerializedName("buyback_count")
    @Expose
    val buybackCount: Int? = null,
    @SerializedName("observer_uses")
    @Expose
    val observerUses: Int? = null,
    @SerializedName("sentry_uses")
    @Expose
    val sentryUses: Int? = null,
    @SerializedName("lane_efficiency")
    @Expose
    val laneEfficiency: Double? = null,
    @SerializedName("lane_efficiency_pct")
    @Expose
    val laneEfficiencyPct: Double? = null,
    @SerializedName("lane")
    @Expose
    val lane: Int? = null,
    @SerializedName("lane_role")
    @Expose
    val laneRole: Int? = null,
    @SerializedName("is_roaming")
    @Expose
    val roaming: Boolean? = null,
    @SerializedName("purchase_time")
    @Expose
    val purchaseTime: Map<String, Int>? = null,
    @SerializedName("first_purchase_time")
    @Expose
    val firstPurchaseTime: Item? = null,
    @SerializedName("item_win")
    @Expose
    val itemWin: Item? = null,
    @SerializedName("item_usage")
    @Expose
    val itemUsage: Item? = null,
    @SerializedName("purchase_tpscroll")
    @Expose
    val purchaseTpscroll: Int? = null,
    @SerializedName("actions_per_min")
    @Expose
    val actionsPerMin: Int? = null,
    @SerializedName("life_state_dead")
    @Expose
    val lifeStateDead: Int? = null,
    @SerializedName("solo_competitive_rank")
    @Expose
    val soloCompetitiveRank: String? = null,
    @SerializedName("cosmetics")
    @Expose
    val cosmetics: List<Any>? = null,
    @SerializedName("benchmarks")
    @Expose
    val benchmarks: Map<String, Benchmarks>? = null)
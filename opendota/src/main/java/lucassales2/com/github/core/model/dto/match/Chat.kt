package lucassales2.com.github.core.model.dto.match


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Chat(
        @SerializedName("time")
        @Expose
        var time: Long? = null,
        @SerializedName("type")
        @Expose
        var type: String? = null,
        @SerializedName("unit")
        @Expose
        var unit: String? = null,
        @SerializedName("key")
        @Expose
        var key: String? = null,
        @SerializedName("slot")
        @Expose
        var slot: Long? = null,
        @SerializedName("player_slot")
        @Expose
        var playerSlot: Long? = null
)

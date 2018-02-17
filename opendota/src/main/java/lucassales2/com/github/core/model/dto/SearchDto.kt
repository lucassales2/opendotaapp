package lucassales2.com.github.core.model.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SearchDto(

        @SerializedName("account_id")
        @Expose
        val accountId: Int? = null,
        @SerializedName("avatarfull")
        @Expose
        val avatarfull: String? = null,
        @SerializedName("personaname")
        @Expose
        val personaname: String? = null,
        @SerializedName("similarity")
        @Expose
        val similarity: Float? = null,
        @SerializedName("last_match_time")
        @Expose
        val lastMatchTime: String? = null
)
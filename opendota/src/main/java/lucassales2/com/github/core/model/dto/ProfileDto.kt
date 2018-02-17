package lucassales2.com.github.core.model.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Lucas Sales on 20/04/2017.
 */

data class ProfileDto(

        @SerializedName("account_id")
        @Expose
        val accountId: Int? = null,
        @SerializedName("personaname")
        @Expose
        val personaname: String? = null,
        @SerializedName("name")
        @Expose
        val name: String? = null,
        @SerializedName("cheese")
        @Expose
        val cheese: Int? = null,
        @SerializedName("steamid")
        @Expose
        val steamid: String? = null,
        @SerializedName("avatar")
        @Expose
        val avatar: String? = null,
        @SerializedName("avatarmedium")
        @Expose
        val avatarmedium: String? = null,
        @SerializedName("avatarfull")
        @Expose
        val avatarfull: String? = null,
        @SerializedName("profileurl")
        @Expose
        val profileurl: String? = null,
        @SerializedName("last_login")
        @Expose
        val lastLogin: String? = null,
        @SerializedName("loccountrycode")
        @Expose
        val loccountrycode: String? = null
)

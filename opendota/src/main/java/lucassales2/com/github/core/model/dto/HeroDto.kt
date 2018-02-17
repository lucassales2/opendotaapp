package lucassales2.com.github.core.model.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Lucas Sales on 27/04/2017.
 */

data class HeroDto (
    @SerializedName("id")
    @Expose
    val id: Int? = null,
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("localized_name")
    @Expose
    val localizedName: String? = null,
    @SerializedName("primary_attr")
    @Expose
    val primaryAttr: String? = null,
    @SerializedName("attack_type")
    @Expose
    val attackType: String? = null,
    @SerializedName("roles")
    @Expose
    val roles: List<String>? = null
)
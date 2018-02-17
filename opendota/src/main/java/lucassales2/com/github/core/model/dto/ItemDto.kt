package lucassales2.com.github.core.model.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Lucas Sales on 04/05/2017.
 */

data class ItemDto (

    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("cost")
    @Expose
    var cost: Int? = null,
    @SerializedName("secret_shop")
    @Expose
    var secretShop: Int? = null,
    @SerializedName("side_shop")
    @Expose
    var sideShop: Int? = null,
    @SerializedName("recipe")
    @Expose
    var recipe: Int? = null
)

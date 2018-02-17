package lucassales2.com.github.core.model.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Lucas Sales on 04/05/2017.
 */

data class Result (

    @SerializedName("items")
    @Expose
    val items: List<ItemDto>? = null,
    @SerializedName("status")
    @Expose
    val status: Int? = null
)
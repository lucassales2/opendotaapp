package lucassales2.com.github.core.model.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Lucas Sales on 26/04/2017.
 */

data class PlayerWinLoss(

        @SerializedName("win")
        @Expose
        var win: Int? = null,
        @SerializedName("lose")
        @Expose
        var lose: Int? = null
)
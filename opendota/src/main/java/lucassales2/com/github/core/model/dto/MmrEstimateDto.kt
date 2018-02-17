package lucassales2.com.github.core.model.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Lucas Sales on 20/04/2017.
 */

data class MmrEstimateDto (
    @SerializedName("estimate")
    @Expose
    val estimate: Int? = null,
    @SerializedName("stdDev")
    @Expose
    val stdDev: Double? = null,
    @SerializedName("n")
    @Expose
    val n: Int? = null

)
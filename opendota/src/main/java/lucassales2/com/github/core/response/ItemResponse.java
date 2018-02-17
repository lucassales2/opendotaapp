package lucassales2.com.github.core.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lucassales2.com.github.core.model.dto.Result;


/**
 * Created by Lucas Sales on 04/05/2017.
 */

public class ItemResponse {


    @SerializedName("result")
    @Expose
    private Result result;

    public Result getResult() {
        return result;
    }


}

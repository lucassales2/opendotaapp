package lucassales2.com.github.core.model.dto.match;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Benchmarks {

    @SerializedName("raw")
    @Expose
    private Double raw;
    @SerializedName("pct")
    @Expose
    private Double pct;

}

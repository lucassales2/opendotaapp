package lucassales2.com.github.core.api

import io.reactivex.Single
import lucassales2.com.github.core.model.dto.SearchDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Lucas Sales on 20/04/2017.
 */

interface SearchApiService {
    @GET("search")
    fun search(@Query("q") searchString: String): Single<List<SearchDto>>
}

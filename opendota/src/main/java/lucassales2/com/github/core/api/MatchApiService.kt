package lucassales2.com.github.core.api

import io.reactivex.Single
import lucassales2.com.github.core.model.dto.match.MatchDetailDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Lucas Sales on 20/04/2017.
 */

interface MatchApiService {
    @GET("matches/{match_id}")
    fun getMatchById(@Path("match_id") matchId: Long): Single<MatchDetailDto>
}

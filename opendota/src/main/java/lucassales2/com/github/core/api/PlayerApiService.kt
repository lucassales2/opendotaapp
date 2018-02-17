package lucassales2.com.github.core.api

import io.reactivex.Single
import lucassales2.com.github.core.model.dto.PlayerWinLoss
import lucassales2.com.github.core.model.dto.match.MatchDto
import lucassales2.com.github.core.response.PlayerResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Lucas Sales on 20/04/2017.
 */

interface PlayerApiService {

    @GET("players/{account_id}")
    fun getPlayerById(@Path("account_id") accountId: Int): Single<PlayerResponse>

    @GET("players/{account_id}/recentmatches")
    fun getPlayerRecentMatches(@Path("account_id") accountId: Int): Single<List<MatchDto>>

    @GET("players/{account_id}/wl")
    fun getPlayerWinLoss(@Path("account_id") accountId: Int): Single<PlayerWinLoss>


}

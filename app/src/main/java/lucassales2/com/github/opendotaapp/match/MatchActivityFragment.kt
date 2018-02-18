package lucassales2.com.github.opendotaapp.match

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import lucassales2.com.github.opendotaapp.R

/**
 * A placeholder fragment containing a simple view.
 */
class MatchActivityFragment : Fragment() {

    companion object {
        private const val PARAM_PLAYER_ID = "playerId"
        fun create(playerId: Long): MatchActivityFragment {
            val fragment = MatchActivityFragment()
            val args = Bundle().apply {
                putLong(PARAM_PLAYER_ID, playerId)
            }
            fragment.arguments = args
            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_match, container, false)

}

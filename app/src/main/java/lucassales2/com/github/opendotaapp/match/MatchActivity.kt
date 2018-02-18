package lucassales2.com.github.opendotaapp.match

import android.content.Context
import android.content.Intent
import android.os.Bundle
import lucassales2.com.github.opendotaapp.BaseActivity
import lucassales2.com.github.opendotaapp.R

class MatchActivity : BaseActivity() {

    companion object {
        private const val PARAM_PLAYER_ID = "playerId"
        fun createIntent(context: Context, playerId: Long): Intent =
                Intent(context, MatchActivity::class.java).apply {
                    putExtra(PARAM_PLAYER_ID, playerId)
                }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match)
    }

    override fun handleIntent(intent: Intent) {
        val playerId = intent.getLongExtra(PARAM_PLAYER_ID, -1L)
        if (playerId != -1L) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_content, MatchActivityFragment.create(playerId))
                    .commit()
        } else {
            finish()
        }
    }


}

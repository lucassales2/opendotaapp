package lucassales2.com.github.opendotaapp.home

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import lucassales2.com.github.opendotaapp.R

/**
 * A placeholder fragment containing a simple view.
 */
class HomeActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}

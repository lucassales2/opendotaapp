package lucassales2.com.github.opendotaapp.home

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_home.*
import lucassales2.com.github.opendotaapp.R
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    companion object {
        val ROOT_FRAGMENT = "root"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: HomeActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        viewModel = ViewModelProviders.of(this, viewModelFactory)
                .get(HomeActivityViewModel::class.java)

    }

}

package com.androidapps.dagger2flavours

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.androidapps.dagger2flavours.injection.DaggerComponentManager
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var functionality: Functionality

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerComponentManager.getActivityComponent(this).inject(this)

        functionality.init()
        functionality.prepare()
        functionality.execute()
        functionality.persist()
        functionality.delete()
        functionality.exit()
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        navigation.selectedItemId = R.id.navigation_home
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        inflateFragment(item.itemId)
        when (item.itemId) {
            R.id.navigation_home -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun inflateFragment(itemId: Int) {
        val bundle = Bundle()
        bundle.putInt(FlavorFragment.ITEM_ID, itemId)
        val fragment = FlavorFragment()
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.layout, fragment).commitAllowingStateLoss()
    }
}

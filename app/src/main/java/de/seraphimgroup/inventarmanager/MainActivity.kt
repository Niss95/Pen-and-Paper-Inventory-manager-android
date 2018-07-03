package de.seraphimgroup.inventarmanager

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import de.seraphimgroup.inventarmanager.R

class MainActivity : AppCompatActivity() {

    private lateinit var mDrawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //ViewPager
        // Instantiate a ViewPager and a PagerAdapter.
        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        if (viewPager != null) {
            val adapter = FragmentPagerAdapter(supportFragmentManager)
            viewPager.adapter = adapter
        }



        //NavigationDrawer
        this.mDrawerLayout = findViewById(R.id.drawer_layout)
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            // set item as selected to persist highlight
            menuItem.isChecked = true
            // close drawer when item is tapped
            mDrawerLayout.closeDrawers()

            // Add code here to update the UI based on the item selected
            // For example, swap UI fragments here

            true
        }
    }


}
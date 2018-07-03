package de.seraphimgroup.inventarmanager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class FragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val count = 3

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = WeaponsFragment()
            1 -> fragment = InventoryFragment()
            2 -> fragment = AddFragment()
        }

        return fragment
    }

    override fun getCount(): Int {
        return count
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Weapons"
            1 -> "Inventory"
            2 ->  "+"
            else -> "!error!"
        }

    }
}

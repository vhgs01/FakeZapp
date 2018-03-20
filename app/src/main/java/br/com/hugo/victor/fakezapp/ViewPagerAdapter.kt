package br.com.hugo.victor.fakezapp

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    val myFragments = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return myFragments[position]
    }

    override fun getCount(): Int {
        return myFragments.size
    }

    fun addFragment(frag: Fragment) {
        myFragments.add(frag)
    }

}
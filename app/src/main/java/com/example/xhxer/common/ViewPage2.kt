package com.example.xhxer.common

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.xhxer.base.fragment.HomeFragment
import com.example.xhxer.base.fragment.MeFragment
import com.example.xhxer.base.fragment.WelfareFragment

//主頁的viewpage2
fun ViewPager2.initMain(fragment:Fragment): ViewPager2{
    this.isUserInputEnabled = false //是否可以滑动
    this.offscreenPageLimit = 3
    adapter = object :FragmentStateAdapter(fragment){
        override fun createFragment(position: Int): Fragment {
           return when(position){
                0 ->HomeFragment()
                1 ->WelfareFragment()
                2 ->MeFragment()
                else ->HomeFragment()
            }
        }
        override fun getItemCount(): Int = 3
    }
    return this
}
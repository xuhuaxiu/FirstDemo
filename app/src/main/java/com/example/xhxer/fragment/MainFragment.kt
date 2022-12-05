package com.example.xhxer.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.xhxer.R
import com.example.xhxer.common.initMain
import com.example.xhxer.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * 作者  : xiuer
 * 时间  : 2022/11/28
 * 描述  :
 */
class MainFragment: BaseFragment<MainViewModel>() {

    override fun layoutId(): Int = R.layout.fragment_main

    override fun initView(savedInstanceState: Bundle?) {
        view_page.initMain(this)
        setClick()
    }

    private fun setClick(){
        tv_one.setOnClickListener {view_page.setCurrentItem(0,false)}
        tv_two.setOnClickListener { view_page.setCurrentItem(1,false) }
        tv_three.setOnClickListener { view_page.setCurrentItem(2,false)}

    }
}
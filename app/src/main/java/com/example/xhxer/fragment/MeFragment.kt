package com.example.xhxer.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.xhxer.R
import com.example.xhxer.common.initMain
import com.example.xhxer.viewmodel.MeViewModel
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * 作者  : xiuer
 * 时间  : 2022/11/28
 * 描述  :
 */
class MeFragment: BaseFragment<MeViewModel>() {

    override fun layoutId(): Int = R.layout.fragment_me

    override fun initView(savedInstanceState: Bundle?) {
    }

}
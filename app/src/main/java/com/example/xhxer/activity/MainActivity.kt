package com.example.xhxer.activity

import android.os.Bundle
import com.example.xhxer.R
import com.example.xhxer.base.activity.BaseActivity
import com.example.xhxer.viewmodel.MainViewModel

class MainActivity : BaseActivity<MainViewModel>() {

    override fun layoutId(): Int = R.layout.activity_main

    override fun initView(savedInstanceState: Bundle?) {
    }
}
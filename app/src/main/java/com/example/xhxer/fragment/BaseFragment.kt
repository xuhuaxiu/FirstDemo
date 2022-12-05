package com.example.xhxer.base.fragment

import android.os.Bundle
import androidx.lifecycle.ViewModel

/**
 * 作者  : xiuer
 * 时间  : 2022/11/29
 * 描述  :
 */
abstract class BaseFragment<VM: ViewModel>: BaseVmFragment<VM>() {
    abstract override fun layoutId(): Int

    abstract override fun initView(savedInstanceState: Bundle?)

    override fun createObserver() {

    }
}